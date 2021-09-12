package day9_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bwf.dao.IUserDao;
import com.bwf.dao.impl.UserDao;
import com.bwf.entity.User;

public class Test2 {

	public static void main(String[] args) {

		IUserDao userDao = new UserDao();

		User user = new User();

		//保存用户
		/*user.setId(6);
		user.setName("51testing");
		user.setSex("女");
		user.setBirthday(new Date());*/

		/*
		 * int count=userDao.save(user); if(count==1) {
		 * 
		 * System.out.println("用户数据保存成功"); }
		 */
		
		// 删除用户信息
		// userDao.del(6);

		
		
		// 更新用户信息
		/*user.setId(5);
		user.setName("aaaa");
		user.setSex("男");
		user.setBirthday(new Date());
		
		userDao.update(user);*/
		
		
		//查询用户
		/*User u1=userDao.findById(1);
		u1=userDao.findById(5);
		System.out.println(u1.getName());*/
		
		
		//根据name查询多个用户
		
		/*List<User> userList1=userDao.findByName("zhang");
		
		System.out.println(userList1);*/
		
		
		//查询所有用户
		
		List<User> userlist2=userDao.findAll(1);
		
		System.out.println(userlist2.size());
		
		

	}
}
