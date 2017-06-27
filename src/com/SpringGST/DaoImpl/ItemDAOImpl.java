package com.SpringGST.DaoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.SpringGST.Dao.ItemDAO;
import com.SpringGST.mappers.ItemMapper;
import com.SpringGST.models.Item;



public class ItemDAOImpl implements ItemDAO{


	private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}  

	
	@Override
	public void addItem(Item item) {
		 String SQL = "insert into Item (item_id, description, item_type,hsn_sac,sku,sell_price,purchase_price,discount,item_notes) values (?, ?,?, ?,?, ?,?, ?, ?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL,item.getItemId(), item.getItemDescription(), item.getItemType(), item.getHSN(),item.getSKU(),item.getSellingPrice(),item.getPurchasePrice(),item.getDiscount(),item.getItemNotes());
	  //    System.out.println("Created Record Name = " + name + " Age = " + age);
	        return;
	      
		
	}

	@Override
	public void updateItem() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Item> getItemList(){
		 String SQL = "select * from Items";
	      List <Item> itemList = jdbcTemplateObject.query(SQL, new ItemMapper());
	      return itemList;
	}

}
