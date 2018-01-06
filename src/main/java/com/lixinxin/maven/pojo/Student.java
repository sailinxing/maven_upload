package com.lixinxin.maven.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="singleton")
public class Student {
	@Value("3636")
private String id;
private String name;
@Autowired
private Phone phone;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}

public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}
@Value("Ð¡Âí")
public void setName(String name) {
	this.name = name;
}

public Student(String id, String name, Phone phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}


}
