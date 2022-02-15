package com.inheritance;

public class Teacher extends StudentDetails2{
public static void main(String[] args) {
	Teacher det=new Teacher();
	det.studentAge(22);
	det.studentGender('m');
	det.studentName("nathish");
	det.studentReg(98786756);
	
	det.studentAge(24);
	det.studentGender('F');
	det.studentName("kumar");
	det.studentReg(98756546);
}
}
