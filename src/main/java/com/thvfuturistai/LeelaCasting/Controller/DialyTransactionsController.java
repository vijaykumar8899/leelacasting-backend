package com.thvfuturistai.LeelaCasting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thvfuturistai.LeelaCasting.Entity.DialyTransactions;
import com.thvfuturistai.LeelaCasting.Service.DialyTransactionsService;


@RestController
public class DialyTransactionsController {
	
	@Autowired
	private DialyTransactionsService dialyTransactionsService;
	
	@PostMapping("/saveDialyTransactions")
	public DialyTransactions getDialyTransactions(@RequestBody DialyTransactions dialyTransactions) {
		return dialyTransactionsService.saveDialyTransactions(dialyTransactions);
	}
	
	@GetMapping("/getDialyTransactions")
	public DialyTransactions getDialyTransactions(@RequestParam Long DialyTransactionsid) {
		return dialyTransactionsService.getDialyTransactions(DialyTransactionsid);
	}
	
//	@GetMapping("/getAllTransactionsOfDate")
//	public List<DialyTransactions> getAllTransactionsOfDate(@RequestParam String date) {
//		return dialyTransactionsService.getAllTransactionsOfDate(date);
//	}
	
	@PutMapping("/updateDialyTransactions")
	public DialyTransactions updateDialyTransactions(@RequestBody DialyTransactions dialyTransactions) {
		return dialyTransactionsService.updateDialyTransactions(dialyTransactions);
	} 
	
	
	
	

}
