package com.dw.course.model;

public class GridItem {

	private int id;
	private String title;
	private int icon;
	private int selectIcon;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GridItem(String title, int icon) {
		super();
		this.title = title;
		this.icon = icon;
	}
	
	public GridItem() {
		super();
	}
	public GridItem(int id, String title, int icon) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
	}
	public GridItem(int id, String title, int icon, int selectIcon) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
		this.selectIcon = selectIcon;
	}
	public int getSelectIcon() {
		return selectIcon;
	}
	public void setSelectIcon(int selectIcon) {
		this.selectIcon = selectIcon;
	}
	
}
