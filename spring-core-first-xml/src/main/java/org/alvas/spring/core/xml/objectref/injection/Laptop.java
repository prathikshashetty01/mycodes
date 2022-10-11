package org.alvas.spring.core.xml.objectref.injection;

public class Laptop {
	USB usb;

	public void setUsb(USB usb) {
		this.usb = usb;
	}
	public void getLaptop()
	{
		System.out.println("hello iam laptop");
		usb.getUSB();
	}

}
