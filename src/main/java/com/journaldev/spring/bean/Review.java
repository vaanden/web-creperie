package com.journaldev.spring.bean;

public class Review {
	private String titre;
	private String description;
	private String date;
	// private String auteur;
	private String source;
	private Item item;
	private int note;

	public int getNote() {
		return note;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
