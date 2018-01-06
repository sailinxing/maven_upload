package com.lixinxin.maven.pojo;

public class Phone {
private Integer id;
private String brandname;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBrandname() {
	return brandname;
}
public void setBrandname(String brandname) {
	this.brandname = brandname;
}
@Override
public String toString() {
	return "Phone [id=" + id + ", brandname=" + brandname + "]";
}
public Phone() {
	super();
	// TODO Auto-generated constructor stub
}

}
