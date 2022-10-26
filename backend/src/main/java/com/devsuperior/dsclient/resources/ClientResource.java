package com.devsuperior.dsclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;
import com.devsuperior.dsclient.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		
		List<Client> list = service.findAll();
		
		/*
		List<Client> list = new ArrayList<>();
		
		list.add(new Client(1L, "Maria", "123.456.789-00", 1000.00, Instant.now(), 1));
		list.add(new Client(2L, "João", "123.456.789-00", 2000.00, Instant.now(), 2));
		list.add(new Client(3L, "Pedro", "123.456.789-00", 3000.00, Instant.now(), 3));
		list.add(new Client(4L, "Carlos", "123.456.789-00", 4000.00, Instant.now(), 4));
		list.add(new Client(5L, "Maria", "123.456.789-00", 5000.00, Instant.parse("2002-10-26T14:57:12.160841300Z"), 5));
		*/
		
		return ResponseEntity.ok().body(list);
	}
}
