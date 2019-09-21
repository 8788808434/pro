package com.webserviceproject.webserviceproducer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "college")
/*When a top level class or an enum type is annotated with the @XmlRootElement annotation
,then its value is represented as XML element in an XML document
*/
@XmlAccessorType(XmlAccessType.FIELD)
public class College implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
@OneToMany(cascade=CascadeType.ALL)
private List<Student> s=new ArrayList();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Student> getS() {
	return s;
}
public void setS(List<Student> s) {
	this.s = s;
}


	
}
