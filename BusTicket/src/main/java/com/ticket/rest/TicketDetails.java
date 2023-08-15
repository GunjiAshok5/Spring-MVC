package com.ticket.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TicketDetails {

	
	@PostMapping(value="/ticket",
			consumes= {"application/json"},
			produces= {"application/json"}
			)
	public ResponseEntity<PassengerDetails> sendPassengerData(@RequestBody PassengerDetails ticket ){
	//	PassengerDetails p=new PassengerDetails();
		
	//	String s1="Ticket confirmed";
		
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
}
