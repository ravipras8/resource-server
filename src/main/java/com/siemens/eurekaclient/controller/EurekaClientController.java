package com.siemens.eurekaclient.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Tedeso", description = "Model Based Testing")
public class EurekaClientController {

	@ApiOperation(value = "Greetings method", response = String.class)
	@RequestMapping(path ="/greeting/hi", method=RequestMethod.GET)
	@PreAuthorize("hasRole('SYSTEMADMIN')")
	public String greeting() {
		return "Hello from EurekaClient!";
	}

	@ApiOperation(value = "Public method with taking input", response = String.class)
	@RequestMapping(path="/public/{id}", method=RequestMethod.GET)
	public String greeting2(@PathVariable String id) {
		return "Hello from jsut to display your id! " + id;
	}
}
