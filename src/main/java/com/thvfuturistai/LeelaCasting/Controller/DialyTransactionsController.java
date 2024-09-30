package com.thvfuturistai.LeelaCasting.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	private static final Logger LOGGER = LoggerFactory.getLogger(DialyTransactionsController.class);

	@Autowired
	private DialyTransactionsService dialyTransactionsService;

//	@PostMapping("/saveTodaysRecords")
//	public ResponseEntity<String> saveTodaysRecords(@RequestBody DialyTransactions data) {
//		try {
//			LOGGER.info("Save todays record Start");
//			DialyTransactions LoginResponse = dialyTransactionsService.saveDialyTransactions(data);
//			LOGGER.info("Save todays record End");
//			return new ResponseEntity<String> (null,HttpStatus.OK);
//		} catch (IllegalArgumentException e) {
//			LOGGER.error("Exception In Save todays record" + e.getMessage(), e);
//			throw new IllegalArgumentException("Error saving data " + e.getMessage(), e);
//		} catch (Exception e) {
//			LOGGER.error("Exception In Save todays record " + e.getMessage(), e);
////			throw new LeelaCastingException(e.getMessage(), e);
//		}
//		return null;
//	}

	@PostMapping("/saveDialyTransactions")
	public DialyTransactions getDialyTransactions(@RequestBody DialyTransactions dialyTransactions) {
		try {
			LOGGER.info("Save todays record Start");
			return dialyTransactionsService.saveDialyTransactions(dialyTransactions);
		} catch (IllegalArgumentException e) {
			LOGGER.error("Exception In Save todays record" + e.getMessage(), e);
			throw new IllegalArgumentException("Error saving data " + e.getMessage(), e);
		} catch (Exception e) {
			LOGGER.error("Exception In Save todays record " + e.getMessage(), e);
			throw new IllegalArgumentException(e.getMessage(), e);
		}
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
