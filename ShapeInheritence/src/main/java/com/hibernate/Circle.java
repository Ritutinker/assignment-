package com.hibernate;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Circle")
public class Circle extends Shape
{
@Column(name="Circle_radius",length=50,nullable=true)
int radius ;
public Circle() {
super();
// TODO Auto-generated constructor stub
}
public Circle(int shapeId,int radius) {
super();
this.radius = radius;
}
public int getRadius() {
return radius;
}
public void setRadius(int radius) {
this.radius = radius;
}
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}

}
