package com.gst.Dao;

import java.util.List;

import com.gst.models.UserBean;

public interface UserDao {

	 public void saveOrUpdate(UserBean user);
     
	    public void delete(int portal_user_id);
	     
	    public UserBean get(int portal_user_id);
	     
	    public List<UserBean> list();
	
	
}
