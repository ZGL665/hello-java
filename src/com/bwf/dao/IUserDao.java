package com.bwf.dao;

import java.util.List;

import com.bwf.entity.User;

/**
 * 关于用户的数据操作
 * 
 * @author zhangL
 *
 */
public interface IUserDao {
	/**
	 * @param save方法 保存用户
	 * @return 成功插入的数据条数
	 */
	public int save(User user);

	/**
	 * @param 根据id删除某个用户
	 * @return 成功删除用的的个数
	 */
	public int del(int id);

	/**
	 * @param user 改用户信息
	 * @return 修改成功 的记录数
	 */
	public int update(User user);

	/**
	 * 用户查询 id 返回查询到的用户数据
	 */
	public User findById(int id);

	/**
	 * @param name根据姓名查询所有用户
	 * @return 多个用户对象
	 */
	public List<User> findByName(String name);

	/**
	 * 查询全部
	 * 
	 * @return 多个用户对象
	 */
	public List<User> findAll();
	
	
	/**
	 * 分页查询
	 * pageNum  页码
	 * @return 多个用户对象
	 */
	public List<User> findAll(int pageNum);

	/**
	 * 根据不同条件查询
	 * 
	 * @param user
	 * @return 多个用户对象
	 */
	public List<User> findBy(User user);
	
	

}
