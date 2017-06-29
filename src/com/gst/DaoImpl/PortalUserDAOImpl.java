package com.gst.DaoImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.ClientDAO;
import com.gst.Dao.PortalUserDAO;
import com.gst.mappers.ClientMapper;
import com.gst.mappers.ItemMapper;
import com.gst.mappers.UserMapper;
import com.gst.models.Client;
import com.gst.models.Item;
import com.gst.models.PortalUser;

public class PortalUserDAOImpl implements PortalUserDAO{

private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}
	

	public void addPortalUser(PortalUser user) {
		// TODO Auto-generated method stub
		 String portal_user_id = UUID.randomUUID().toString(); 
		 user.setPortalUserId(portal_user_id); 
		 String SQL = "insert into portal_user (portal_user_id,user_firstname,user_lastname,user_email,user_mobile,user_password) values (?,?,?,?,?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	      else
	    	jdbcTemplateObject.update( SQL, user.getPortalUserId() ,user.getFirstname(),user.getLastname(), user.getEmail(),user.getMobileNum(),user.getPassword() );
	  
	}


	public List<PortalUser> getPortalUserList() {
		// TODO Auto-generated method stub
		String SQL = "select * from portl_user";
	      List <PortalUser> userlist = jdbcTemplateObject.query(SQL, new UserMapper());
	      return userlist;
	}


	public PortalUser getPortalUserFromId(String id) {
		// TODO Auto-generated method stub
		String SQL = "select * from portal_user where portal_user_id = ?";
		PortalUser user = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new UserMapper());
		return user;
	}


	public boolean authenticate(String userEmail, String password) {
		String SQL = "select count(*) from portal_user where user_email = ? and user_password=?";
		Integer count = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{userEmail, password},Integer.class);
		System.out.println("count for authenticate");
		System.out.println(count);
		return (count>0)? true: false;
	}
	
}

