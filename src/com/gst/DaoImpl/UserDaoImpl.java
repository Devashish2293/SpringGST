package com.gst.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.gst.models.UserBean;
import com.gst.Dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveOrUpdate(UserBean user) {
		if (user.getPortal_user_id() != null && user.getPortal_user_id()>0 ) {
			// update
			String sql = "UPDATE portal_user SET portal_email=?, portal_mobile=?,  portal_password=?, portal_gstin=?, portal_groups_id=?, portal_state=?"
					+ "WHERE portal_user_id=?";
			jdbcTemplate.update(sql, user.getPortal_email(), user.getPortal_mobile(), user.getPortal_password(),
					user.getPortal_gstin(), user.getPortal_group_id(), user.getPortal_state(),
					user.getPortal_user_id());
		} else {
			// insert
			String sql = "INSERT INTO portal_user (portal_email, portal_mobile, portal_password, portal_gstin, portal_groups_id, portal_state)"
					+ " VALUES (?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, user.getPortal_email(), user.getPortal_mobile(), user.getPortal_password(),
					user.getPortal_gstin(), user.getPortal_group_id(), user.getPortal_state());
		}

	}

	@Override
	public void delete(int portal_user_id) {
		
		    String sql = "DELETE FROM portal_user WHERE portal_user_id=?";
		    jdbcTemplate.update(sql, portal_user_id);
		}

	@Override
	public UserBean get(int portal_user_id) {
	    String sql = "SELECT * FROM portal_user WHERE portal_user_id=" + portal_user_id;
	    return jdbcTemplate.query(sql, new ResultSetExtractor<UserBean>() {
	 
	        @Override
	        public UserBean extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	UserBean auser = new UserBean();
					auser.setPortal_user_id(rs.getInt("portal_user_id"));
					auser.setPortal_email(rs.getString("portal_email"));
					auser.setPortal_mobile(rs.getString("portal_mobile"));
					auser.setPortal_password(rs.getString("portal_password"));
					auser.setPortal_gstin(rs.getString("portal_gstin"));
					auser.setPortal_group_id(rs.getInt("portal_groups_id"));
					auser.setPortal_state(rs.getString("portal_state"));

					return auser;
					}
	 
	            return null;
	        }
	 
	    });
	}

	@Override
	public List<UserBean> list() {
		String sql = "SELECT * FROM portal_user";
		List<UserBean> listContact = jdbcTemplate.query(sql, new RowMapper<UserBean>() {

			@Override
			public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {

				UserBean auser = new UserBean();
				auser.setPortal_user_id(rs.getInt("portal_user_id"));
				auser.setPortal_email(rs.getString("portal_email"));
				auser.setPortal_mobile(rs.getString("portal_mobile"));
				auser.setPortal_password(rs.getString("portal_password"));
				auser.setPortal_gstin(rs.getString("portal_gstin"));
				auser.setPortal_group_id(rs.getInt("portal_groups_id"));
				auser.setPortal_state(rs.getString("portal_state"));

				return auser;
			}

		});

		return listContact;

	}
}