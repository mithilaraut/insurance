package com.lti.vehicle.model;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



	//import org.hibernate.validator.constraints.NotBlank;

	@Entity
	@Table(name = "UserDetails")
	public class UserDetails implements Serializable{

		 
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;

		@Column(name = "first_name")
		@Size(max = 20, min = 3, 
		message = " Name entered is invalid. It must be between 3 and 20 characters.")
		 // @Pattern(regexp = "^[a-zA-Z]")
		private String firstName;
		
		
		@Column(name = "last_name")
		private String lastName;
		//@NotBlank(message = "Please enter email address!")	
		
		@Email
		private String email;
//		@NotBlank(message = "Please enter contact number!")
		//@Column(name = "contact_number")
		//private String contactNumber;
		//private String role;
//		@NotBlank(message = "Please enter password!")
		private String password;
		//private boolean enabled = true;
		@Transient
		private String confirmPassword;
		
		/*
		 * private String name;
		 * 
		 * public String getName() { return name=firstName+lastName; }
		 * 
		 * public void setName(String name) { this.name = name; }
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		 
		
//		public String getContactNumber() {
//			return contactNumber;
//		}
//		public void setContactNumber(String contactNumber) {
//			this.contactNumber = contactNumber;
//		}
//		public String getRole() {
//			return role;
//		}
//		public void setRole(String role) {
//			this.role = role;
//		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
//		public boolean isEnabled() {
//			return enabled;
//		}
//		public void setEnabled(boolean enabled) {
//			this.enabled = enabled;
//		}
		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
		}
		 
		 
		
	 
		
		
//		@OneToOne(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//		private Cart cart;
//		public Cart getCart() {
//			return cart;
//		}
//		public void setCart(Cart cart) {
//			this.cart = cart;
//		}
		

}
