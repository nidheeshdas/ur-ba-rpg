package com.nirandas.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirandas.beans.Point;

@Controller
@RequestMapping("/api")
public class FirstController {

	@Autowired
	public SessionFactory sessionFactory;

	@RequestMapping(value = "/HelloWorld")
	public @ResponseBody
	String HelloWorld() {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(new Point(1, 45, 96));
		trans.commit();
		session.close();
		return sessionFactory.isClosed() ? "Closed" : "Open";
	}
}
