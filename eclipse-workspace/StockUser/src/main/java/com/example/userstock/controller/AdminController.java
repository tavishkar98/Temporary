package com.example.userstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userstock.businesslogic.SendConfirmationEmail;
import com.example.userstock.entities.Login;
import com.example.userstock.entities.User;
import com.example.userstock.service.AdminService;



@RestController
@RequestMapping("/")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private SendConfirmationEmail sendMail;

	@PostMapping(value = "login")
	ResponseEntity<User> validateUser(@RequestBody Login login) {
		ResponseEntity<User> response = null;

		if (adminService.findUser(login.getUser_name(), login.getPassword()) != null) {
			User user = adminService.findUser(login.getUser_name(), login.getPassword());
			if(user.getConfirmation_status().equals("confirmed"))
			{
					if (user.getUser_type().equals("Admin")) {
						System.out.println(user);
						response = new ResponseEntity<>(user, HttpStatus.ACCEPTED);
						return response;

					}
					
					else{
						System.out.println(user);
							response = new ResponseEntity<>(user, HttpStatus.CONTINUE);
							return response;

					}
			}
			 

			else {
				System.out.println("user is not found");
				response = new ResponseEntity<>(HttpStatus.FORBIDDEN);
				return response;

			}
			
		}
		else
		{

			System.out.println("password is empty");
			response = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			return response;

		}
			
		

		
	}
	
	@GetMapping("logout")
	ResponseEntity<String> logout()
	{
		ResponseEntity<String> response=  new ResponseEntity<>("You have been sucessfully logged out",HttpStatus.GONE);
		return response;
	}
	
	
	@GetMapping("mail")
	ResponseEntity<String> sendMail()
	{
		sendMail.sendEmail("receiver_email@gmail.com","username");
		ResponseEntity<String> response= new ResponseEntity<>("Verification mail has been sent", HttpStatus.GONE);
		return response;
	}
}

