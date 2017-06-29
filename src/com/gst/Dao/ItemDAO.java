package com.gst.Dao;

import java.util.List;

import javax.sql.DataSource;

import com.gst.models.Item;

public interface ItemDAO {
	

	public void addItem(Item item);
	public void updateItem();
	public List<Item> getItemList();

}
