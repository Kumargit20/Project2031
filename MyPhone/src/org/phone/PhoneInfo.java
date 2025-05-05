package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("phoneName:Samsung S20");
	}
	private void phoneImiNum() {
		System.out.println("phoneImiNum:12345678");
	}
	private void camera() {
		System.out.println("camera:14megaPicxel");
	}
	private void storage() {
		System.out.println("storgae:256gb");
	}
	private void osName() {
		System.out.println("osName:Lolipop");
	}
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.camera();
		p.osName();
		p.phoneImiNum();
		p.storage();
		
		
		
	}

}

