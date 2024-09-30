package com.thvfuturistai.LeelaCasting.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvfuturistai.LeelaCasting.Entity.BaseDialyTransactions;
import com.thvfuturistai.LeelaCasting.Entity.DialyTransactions;
import com.thvfuturistai.LeelaCasting.Repository.DialyTransactionsRepository;

@Service
public class DialyTransactionsService {

	@Autowired
	private DialyTransactionsRepository dialyTransactionsRepository;

	public DialyTransactions saveDialyTransactions(DialyTransactions dialyTransactions) {
		try {
			return dialyTransactionsRepository.save(dialyTransactions);
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}

	public DialyTransactions getDialyTransactions(Long DialyTransactionsid) {
		try {
			return dialyTransactionsRepository.findById(DialyTransactionsid).orElse(null);
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}

	public DialyTransactions updateDialyTransactions(DialyTransactions dialyTransactions) {
		try {
			DialyTransactions dialyTransactionsRecord = dialyTransactionsRepository
					.findById(dialyTransactions.getDailyTransactionsId()).get();
			dialyTransactionsRecord.setOrnamentWeight(dialyTransactions.getOrnamentWeight());
			dialyTransactionsRecord.setPayables(dialyTransactions.getPayables());
			dialyTransactionsRecord.setPendingGold(dialyTransactions.getPendingGold());
			dialyTransactionsRecord.setReceivables(dialyTransactions.getReceivables());
			dialyTransactionsRecord.setTransactionClosed(dialyTransactions.getTransactionClosed());
			return dialyTransactionsRepository.save(dialyTransactionsRecord);
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}
	}

//	public List<DialyTransactions> getAllTransactionsOfDate(String date) {
//		try {
//			return dialyTransactionsRepository.findBy(BaseDialyTransactions.FIELD_lastUpdatedTs, date).get();
//		} catch (Exception e) {
//			throw new IllegalArgumentException(e.getMessage(), e);
//		}
//	}

}
