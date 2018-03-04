package com.atos.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.pojo.LoginPojo;

@RestController
public class Login {
	ArrayList<LoginPojo> al=new ArrayList();
	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	public ResponseEntity login() {
	///	console.log("inside ");
		
		
			return ResponseEntity.status(200).body(new Date());
		
	}
	
	
	
	@RequestMapping("getAll")
	public ArrayList<LoginPojo> getAllStudentO(){
	
		return al;
	}
	

}
