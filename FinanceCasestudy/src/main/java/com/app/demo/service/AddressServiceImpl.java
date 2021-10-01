package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.demo.jparepos.JPAAddressRepo;
@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	JPAAddressRepo jpaRepo;
	@Override
	public List<Long> getallpincodes() {
		return jpaRepo.getallpincodes();
	}

}
