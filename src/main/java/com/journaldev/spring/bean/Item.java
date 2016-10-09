package com.journaldev.spring.bean;

public class Item {
	private String itemPhotoLink;
	private String itemName;
	private String itemLink;

	public Item(String itemPhotoLink, String ItemName, String itemLink) {
		this.itemPhotoLink = itemPhotoLink;
		this.itemName = ItemName;
		this.itemLink = itemLink;
	}

	public Item() {
		this.itemPhotoLink = null;
		this.itemName = null;
		this.itemLink = null;
	}

	public String getItemPhotoLink() {
		return itemPhotoLink;
	}

	public void setItemPhotoLink(String itemPhotoLink) {
		this.itemPhotoLink = itemPhotoLink;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String ItemName) {
		this.itemName = ItemName;
	}

	public String getItemLink() {
		return itemLink;
	}

	public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
	}
}
