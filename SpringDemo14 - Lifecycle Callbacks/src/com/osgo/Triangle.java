package com.osgo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	

	public Point getPointA()
	{
		return pointA;
	} // end method getPointA


	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	} // end method setPointA


	public Point getPointB()
	{
		return pointB;
	} // end method getPointB


	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	} // end method setPointB


	public Point getPointC()
	{
		return pointC;
	} // end method getPointC


	public void setPointC(Point pointC)
	{
		this.pointC = pointC;
	} // end method setPointC
	
	

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("InitializingBean init method called for Triangle.");
	}
	
	
	@Override
	public void destroy() throws Exception
	{
		System.out.println("DisposableBean destroy method called for Triangle.");		
	}

	
	public void myInit()
	{
		System.out.println("myInit method called for Triangle.");
	} // end method myInit
	
	
	public void cleanUp()
	{
		System.out.println("CleanUp method called for Triangle.");
	} // end method cleanUp
	
	
	public void draw()
	{
		System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");
		
	} // end method draw()

	
} // end Class Triangle
