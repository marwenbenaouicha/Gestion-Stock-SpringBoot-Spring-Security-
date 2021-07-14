package org.sid.demo.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductForm {

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CategoryForm getCategory() {
		return category;
	}
	public void setCategory(CategoryForm category) {
		this.category = category;
	}
	private String id;
    private String name;
    private String description;
    public ProductForm(String id, String name, String description, double currentPrice, int quantity,
			CategoryForm category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.currentPrice = currentPrice;
		this.quantity = quantity;
		this.category = category;
	}
	private double currentPrice;
   // private String photoName;
    private int quantity;
    private CategoryForm category;


}
