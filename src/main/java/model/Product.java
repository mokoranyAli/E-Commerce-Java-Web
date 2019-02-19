package model;

public class Product {

	private int productId ;
        private String productName;
        private int productPrice;
        private String productType;
        private String productDescription;
        private String productImage;
        private int productQuantity;

    
        
    public Product(int productId, String productName, int productPrice, String productType, String productDescription, String productImage, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.productQuantity = productQuantity;
    }
    
    
 public Product( String productName, int productPrice, String productType, String productDescription, String productImage, int productQuantity) {
     
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.productQuantity = productQuantity;
    }
    
  

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
        
    
    
        
        

	

}
