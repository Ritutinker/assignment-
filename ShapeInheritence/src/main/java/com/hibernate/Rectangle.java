package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Rectangle")
public class Rectangle extends Shape
{
@Column(name="Rec_Length",length=50,nullable=true)
int length ;
@Column(name="Rec_breadth",length=50,nullable=true)
int breadth ;
public Rectangle() {
super();
// TODO Auto-generated constructor stub
}


public Rectangle(int shapeId,int length, int breadth) {
super();
this.length = length;
this.breadth = breadth;
}
public int getLength() {
return length;
}
public void setLength(int length) {
this.length = length;
}
public int getBreadth() {
return breadth;
}
public void setBreadth(int breadth) {
this.breadth = breadth;
}


@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
}
}
