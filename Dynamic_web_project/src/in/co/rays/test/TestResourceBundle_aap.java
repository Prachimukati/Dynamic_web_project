package in.co.rays.test;

import java.util.ResourceBundle;

public class TestResourceBundle_aap {
public static void main(String[] args) {
	ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.aap");
	System.out.println(rb.getString("greeting"));
}
}
