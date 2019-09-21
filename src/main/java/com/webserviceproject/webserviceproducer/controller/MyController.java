package com.webserviceproject.webserviceproducer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webserviceproject.webserviceproducer.model.College;
import com.webserviceproject.webserviceproducer.model.Colleges;
import com.webserviceproject.webserviceproducer.serviceinter.Serviceint;
@RestController 
public class MyController {
	@Autowired
	Serviceint sr;
	@RequestMapping(value="/College",consumes="application/xml",method=RequestMethod.POST)
	public String create(@RequestBody College c)
	{
		sr.createAddmission(c);
		return "Success";
	}
	@RequestMapping(value="/College/{id}",produces="application/json",method=RequestMethod.GET)
	public College getdata(@PathVariable int id,HttpServletResponse response)
	{
		College c=sr.getperdata(id);
		if(c!=null)
		{
		response.setStatus(HttpServletResponse.SC_OK);
		return c;
		}
		else
		{
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}
	@RequestMapping(value="/College", method=RequestMethod.GET)
	public List<College> getAllData()
	{
		List<College> l=sr.getalldata();
		return l;
	}
	@RequestMapping(value="/College",method=RequestMethod.PUT)
	public void changeData(@RequestBody College c)
	{
		sr.chandata(c);
	}
	@RequestMapping(value="/College/{id}",method=RequestMethod.DELETE)
	public void deletedata(@PathVariable int id)
	{
		sr.deledata(id);
		
	}

	@RequestMapping(value="/College/list",produces="application/xml",method=RequestMethod.GET)
	public Colleges create1()
	{
		
		College s=new College();
		s.setId(12);
		s.setName("Avinash");
		//s.setAdddres("pune");
		College s1=new College();
		s1.setId(12);
		s1.setName("df");
		//s1.setAdddres("pune");
		Colleges ss=new Colleges();
		
		ss.setStudents(new ArrayList<College>());
		ss.getStudents().add(s);
		ss.getStudents().add(s1);

		return ss;
		
		
		
	
	}

}
