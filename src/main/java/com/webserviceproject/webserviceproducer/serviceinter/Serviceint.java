package com.webserviceproject.webserviceproducer.serviceinter;

import java.util.List;

import com.webserviceproject.webserviceproducer.model.College;

public interface Serviceint {

	public void createAddmission(College c);
	public College getperdata(int id);
	public List<College> getalldata();
	public void chandata(College c);
	public void deledata(int id);
}
