package com.app.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.demo.jparepos.MyOrdersJPARepo;
import com.app.demo.pojo.Orders;


@Service
@Transactional
public class OrderServiceImpl implements OrderService
{
	@Autowired
	MyOrdersJPARepo orepo;
	@Autowired
	EntityManager eMan;
	
	@Override
	public List<Orders> getOrders()
	{
		return orepo.findAll();
	}

	@Override
	public List<Orders> getordersbyuserid(String ID) {
		// TODO Auto-generated method stub
		return orepo.getOrdersbyuserid(ID);
	}

	@Override
	public boolean addOrder(Orders o) {
		orepo.save(o);
		return true;
	}

	@Override
	public Orders getlasttransaction(String userid, String prodid) {
		Query qry = eMan.createQuery("select o from Orders o where o.user_id = :uid and o.prod_id=:pid ORDER BY date_of_purchase DESC");
		qry.setParameter("uid", userid);
		qry.setParameter("pid", prodid);
		qry.setFirstResult(0);
		qry.setMaxResults(1);
		Orders lstorder = (Orders) qry.getSingleResult();
		System.out.println(lstorder.getDate_of_purchase());
		return lstorder;
	}
	
	
}