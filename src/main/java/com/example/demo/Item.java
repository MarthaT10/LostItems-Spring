package com.example.demo;

public class Item {

	private final int id;
	private final String description;
  private final String created_at;
  private final int location_id;
  private final int found_by_id;

	public Item(int id, String description, String created_at, int location_id, int found_by_id) {
		this.id = id;
		this.description = description;
    this.created_at= created_at;
    this.location_id=location_id;
    this.found_by_id=found_by_id;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

  public String getCreatedAt() {
		return created_at;
	}
  public int getLocationId() {
		return location_id;
	}
  public int getFoundById() {
		return found_by_id;
	}

}
