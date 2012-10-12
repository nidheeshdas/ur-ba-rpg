package com.nirandas.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import com.nirandas.beans.Point;

@Controller
@RequestMapping("/api")
public class FirstController
{

   @Autowired
   public SessionFactory sessionFactory;

   @RequestMapping(value = "/HelloWorld")
   public @ResponseBody
   String HelloWorld()
   {
      Session session = sessionFactory.openSession();
      Transaction trans = session.beginTransaction();
      session.save(new Point(1, 45, 96));
      trans.commit();
      session.close();
      return sessionFactory.isClosed() ? "Closed" : "Open";
   }

   @RequestMapping("/get")
   public @ResponseBody String getPoints()
   {
      Session session = sessionFactory.openSession();
      Transaction trans = session.beginTransaction();
      Query q = session.createQuery("from Point");
      List vals = q.list();
      trans.commit();
      session.close();
      return String.valueOf(vals.size());
   }

}
