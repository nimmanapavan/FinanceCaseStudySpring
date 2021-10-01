package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.demo.jparepos.JPABankdetailsRepo;

@Service
@Transactional
public class BankdetailsServiceImpl implements BankService {

	@Autowired
	JPABankdetailsRepo jpaRepo;
	@Override
	public List<String> getallifsc() {
		return jpaRepo.getallifsc();
	}

}
