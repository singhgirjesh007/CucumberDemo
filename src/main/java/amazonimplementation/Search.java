package amazonimplementation;

public class Search {
	
	public String disaplayProduct(Product product ) {
		
		if(product.getProductList().contains(product.getProductname())) {
			return product.getProductname();
		}
		return null;
	}

}
