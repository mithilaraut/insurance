package com.lti.vehicle.controller;


import java.util.Arrays;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.vehicle.model.ApplicationInsurance;
import com.lti.vehicle.model.Plans;
import com.lti.vehicle.model.VehicleDetails;
import com.lti.vehicle.service.IApplicationInsuranceService;
import com.lti.vehicle.service.IPlanService;
import com.lti.vehicle.service.IVehicleService;



@Controller
@SessionAttributes({"vehicle","plan","applicationInsurance","premium"})
public class VehicleController {
	
	private IVehicleService iVehicleService;
private IPlanService iPlanService;
private IApplicationInsuranceService iApplicationInsuranceService;
//private PaymentServiceDao paymentServiceDao;



//@Autowired
//public void setPaymentServiceDao(PaymentServiceDao paymentServiceDao) {
	//this.paymentServiceDao = paymentServiceDao;
//}

@Autowired
public void setiApplicationInsuranceService(IApplicationInsuranceService as) {
	this.iApplicationInsuranceService = as;
}

@Autowired
	public void setiPlanService(IPlanService ps) {
	this.iPlanService = ps;
}


	@Autowired
	public void setiVehicleService(IVehicleService vs) {
		this.iVehicleService = vs;
	}


	@ModelAttribute
	public void getVehicleType(Model model)
	{
	model.addAttribute("vehicletype",Arrays.asList("4w","2w"));
	}
	
	
@ModelAttribute
public void getBrand(Model model)
{
model.addAttribute("fwbrands",Arrays.asList("Suzuki","Renault","Mercedes"));
model.addAttribute("twbrands",Arrays.asList("Apache","Pulsar"));
}
@ModelAttribute
public void getModel(Model model)
{
model.addAttribute("suzukiModel",Arrays.asList("Baleno","Swift","Alto"));
model.addAttribute("renaultModel",Arrays.asList("Kwid","Scala"));

model.addAttribute("apacheModel",Arrays.asList("ApacheRTR","ApacheRR"));
model.addAttribute("pulsarModel",Arrays.asList("Pulsar220","NS200"));
}

@ModelAttribute
public void getPurchaseMonth(Model model)
{
model.addAttribute("pmonth",Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12"));
}
@ModelAttribute
public void getPurchaseYear(Model model)
{
model.addAttribute("pyear",Arrays.asList("2009","2010","2011","2012","2013","2014","2015","2016","2017","2018"));
}


@ModelAttribute
public void getPlanType(Model model)
{
model.addAttribute("plantypes",Arrays.asList("Comprehensive","3rdParty"));
model.addAttribute("planyears",Arrays.asList("1","2","3"));
}


	@RequestMapping(value="/vehicles")
	public String listVehicleDetails(Model model) {

		model.addAttribute("vehicle", new VehicleDetails());
		
		return "vehicle";
	}
	
	
	@RequestMapping(value="/vehicles/plans")
	public String addplans(Model model) {

		model.addAttribute("plan", new Plans());
		return "plans";
	}
	
	
	@RequestMapping(value="/vehicles/receipt")
	public String addPayment(Model model) {

	//	model.addAttribute("receipt", new Payment());
		return "receipt";
	}
	
	
	
	
	
	@RequestMapping(value="/vehicles/calculate")
	public String calculatePremium(Model model) {

		model.addAttribute("premium", new Plans());
		return "totalpremium";
	}
	
	
	@RequestMapping(value = "/vehicles/add",method = RequestMethod.POST)
/*	@ExceptionHandler({ CustomException.class })*/
	public String addVehicle(
			@ModelAttribute("vehicle") 
			@Valid VehicleDetails v, 
			BindingResult result, 
			Model model) {
		
		if(!result.hasErrors())
		{
			this.iVehicleService.addVehicle(v);	
		}
		return "vehsuccess";
	}
	
	
	
	
	
	@RequestMapping(value = "/vehicles/plans/adds",method = RequestMethod.POST)
/*	@ExceptionHandler({ CustomException.class })*/
	public String addPlan(
			@ModelAttribute("plan") 
			@Valid Plans p, 
			BindingResult result, 
			Model model) {
		if(!result.hasErrors())
		{
			this.iPlanService.addPlan(p);	
		}
		return "calcpremium";
	}
	
	
@RequestMapping("/vehicles/plans/calculate")
	public String calc(Model model,HttpSession session)
	{
	 VehicleDetails v1 = (VehicleDetails)session.getAttribute("vehicle");
	Plans p1  =(Plans)session.getAttribute("plan");
	ApplicationInsurance  appIns =  new ApplicationInsurance();
	appIns.setApplicationId(121212);
	appIns.setTempVehicle(v1);
	appIns.setTempPlan(p1);
	session.setAttribute("applicationInsurance",appIns);
	
   double premium =iApplicationInsuranceService.calculatePremium(appIns);
   model.addAttribute("premium",premium);
   session.setAttribute("premium",premium);
	return "totalpremium";
	}


@RequestMapping(value = "/vehicles/plans/receipt",method = RequestMethod.POST)
/*	@ExceptionHandler({ CustomException.class })*/
	public String addPayment(
			@ModelAttribute("receipt") 
	//		@Valid Payment r, 
			BindingResult result, 
			Model model) {
	//	if(!result.hasErrors())
	//	{			this.paymentServiceDao.addPayment(r);
	//	}
		return "receipt";
	}
	
	}
	
