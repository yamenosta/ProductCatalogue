package com.productcateg.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productcateg.Service.AccountService;
import com.productcateg.entity.Client;

@RestController
public class ClientRest {
	
	@Autowired
	private AccountService accountService;
	@PostMapping("/register")
	public Client Register(@RequestBody Client client) {
		return accountService.saveClient(client.getNameClient(), client.getPassword());
	}

}
