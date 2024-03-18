package in.co.rays.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
public static void main(String[] args) throws Exception {
	testAuthentic();
	//testNextPk();
	//  testadd();
	//testSearch();
	//testDelete();
	//testFindByPk();
	//testUpdate();
	 // testAdd();
}
private static void testAdd() throws Exception {
		
		UserModel model = new UserModel();
		
		UserBean bean = new UserBean();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstName("jagrati");
		bean.setLastName("patel");
		bean.setLoginId("jagrati@123");
		bean.setPassword("12343");
		bean.setDob(sdf.parse("2002-02-02"));
		bean.setAddress("indore");
		
		model.add(bean);
	}
	

private static void testUpdate() throws Exception {

	UserBean bean = new UserBean();

	bean.setId(9);
	bean.setFirstName("abhi");
	bean.setLastName("abc");
	bean.setLoginId("abhi@gmail.com");
	bean.setPassword("123");
	bean.setDob(new Date());
	bean.setAddress("indore");

	UserModel model = new UserModel();

	model.update(bean);

}
		private static void testFindByPk() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(2);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());

	}

private static void testDelete() throws Exception {

		UserModel model = new UserModel();
		 model.delete(8);

	}
private static void testSearch() throws Exception {

	UserBean bean = new UserBean();
	bean.setFirstName("p");

	UserModel model = new UserModel();

	List list = model.search(bean, 1, 20);

	Iterator it = list.iterator();

	while (it.hasNext()) {

		bean = (UserBean) it.next();

		System.out.print(bean.getId());
		System.out.print("\t" + bean.getFirstName());
		System.out.print("\t" + bean.getLastName());
		System.out.print("\t" + bean.getLoginId());
		System.out.print("\t" + bean.getPassword());
		System.out.print("\t" + bean.getDob());
		System.out.println("\t" + bean.getAddress());

	}

}


private static void testNextPk() throws Exception {
	
	
	 UserModel model = new UserModel();
	 
	 int pk =model.nextPk();
	 
	 System.out.println("Pk="+pk);
	 
}


private static void testAuthentic() throws Exception {
	 	
	 UserModel model = new UserModel();
	 
	 UserBean bean =model.authenticate("rachimukati@gmail.com", "12345");
	 
	 if(bean != null) {
		 
		 	System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLoginId());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());
		}else {
			System.out.println("invalid login & password");
		}
}		
	public static void testadd() throws Exception{
		
		UserModel model = new UserModel();
		
		UserBean bean = new UserBean();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(2);
		bean.setFirstName("jagrati");
		bean.setLastName("patel");
		bean.setLoginId("jagrati@123");
		bean.setPassword("12343");
		bean.setDob(sdf.parse("2002-02-02"));
		bean.setAddress("indore");
		
		model.add(bean);
	}
	
}