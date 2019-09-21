package com.webserviceproject.webserviceproducer.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webserviceproject.webserviceproducer.model.College;
import com.webserviceproject.webserviceproducer.repo.CrudRepo;
import com.webserviceproject.webserviceproducer.serviceinter.Serviceint;
@Service
public class Serviceim implements Serviceint{

	@Autowired
	CrudRepo cr;
	public void createAddmission(College c) {
		
		cr.save(c);
	}
	@Override
	public College getperdata(int id) {
		// TODO Auto-generated method stub
		Optional<College> c=cr.findById(id);
		College c1=c.get();
		return c1;
	}
	@Override
	public List<College> getalldata() {
		// TODO Auto-generated method stub
		return (List<College>) cr.findAll();
	}
	@Override
	public void chandata(College c) {
		cr.save(c);
		
	}
	@Override
	public void deledata(int id) {
		cr.deleteById(id);
		
	}

}
