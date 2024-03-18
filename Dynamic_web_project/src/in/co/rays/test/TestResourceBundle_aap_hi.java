package in.co.rays.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle_aap_hi {
	public static void main(String[] args) {

//		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.aap_hi");
//		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays..bundle.sp");
//  	 ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.aap", new Locale("hi"));
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays..bundle.sp",new Locale("sp"));

		System.out.println(rb.getString("greeting"));
 
		
	}
}