package com.thvfuturistai.LeelaCasting.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvfuturistai.LeelaCasting.Entity.DialyTransactions;
import com.thvfuturistai.LeelaCasting.Repository.DialyTransactionsRepository;

@Service
public class DialyTransactionsService {
	
	
	@Autowired
	private DialyTransactionsRepository dialyTransactionsRepository;
	
	
	public DialyTransactions saveDialyTransactions(DialyTransactions dialyTransactions) {
	 	return dialyTransactionsRepository.save(dialyTransactions);
	}
	
	public DialyTransactions getDialyTransactions(Long DialyTransactionsid) {
	 	return dialyTransactionsRepository.findById(DialyTransactionsid).orElse(null);
	}

	public DialyTransactions updateDialyTransactions(DialyTransactions dialyTransactions) {
		DialyTransactions dialyTransactionsRecord = dialyTransactionsRepository.findById(dialyTransactions.getDailyTransactionsId()).get();
		dialyTransactionsRecord.setOrnamentWeight(dialyTransactions.getOrnamentWeight());
		dialyTransactionsRecord.setPayables(dialyTransactions.getPayables());
		dialyTransactionsRecord.setPendingGold(dialyTransactions.getPendingGold());
		dialyTransactionsRecord.setReceivables(dialyTransactions.getReceivables());
		dialyTransactionsRecord.setTransactionClosed(dialyTransactions.getTransactionClosed());
		return dialyTransactionsRepository.save(dialyTransactionsRecord);
	}
	
	
}
