package com.learning.dev.ops.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("customerControllerV1")
@CrossOrigin("*")
@RequestMapping(value = "v1/preference")
public class CustomerpreferencesController {
	
	
	@GetMapping("/{emailId}")
	public String getProfileInfo(@PathVariable(value = "emailId") String emailId) {
			return "Customer "+ emailId + "  will be deliighted with mild hot and less sweet in desert";
	}

}
