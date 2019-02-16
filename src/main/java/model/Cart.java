package model;

public class Cart {

	private Product product;
	private int quantity;

	public Cart() {
	}

	public Cart(Product p, int quantity) {
		this.product = p;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product p) {
		this.product = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
