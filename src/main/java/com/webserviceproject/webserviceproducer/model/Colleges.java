package com.webserviceproject.webserviceproducer.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "colleges")
@XmlAccessorType (XmlAccessType.FIELD)
public class Colleges {

	@XmlElement(name = "college")//Maps a field or property to an XML element
	private List<College> col=null;

	public List<College> getStudents() {
		return col;
	}

	public void setStudents(List<College> col) {
		this.col = col;
	}

}
