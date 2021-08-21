package com.stackroute.oops;

/*
    Class for Analyzing the products present in ProductRepository
    **Class ProductService**

    Define the below methods

	+ findNameByCode(int): String
	    - Should take product code as parameter and return the name of the product from the list of products present in ProductRepository
        - If no product is found for the given product code, return null

	+ findMaxPriceProduct(String): Product
	    - Should take product category as a parameter and return the product object having the maximum price in the category provided
        - If no product is found for the given category, return null

	+ getProductsByCategory(String) : Product[]
	    - Should take product category as parameter and return the array of products in the category provided
        - If no product are found for the given category, return null


 */
public class ProductService {

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        String s = null;
        for(Product it : ProductRepository.getProducts()){
            if(it.getProductCode() == productCode){
                s = it.getName();
                return s;
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        double mx = 0;
        Product p = null;
        for(Product it : ProductRepository.getProducts()){
            if(it.getCategory().equals(category) && it.getPrice()>mx){
                mx = it.getPrice();
                p = it;
            }
        }
        if(mx!=0){
            return p;
        }
        return null;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        int i=0;
        Product[] pro = new Product[100];

        for(Product it: ProductRepository.getProducts()){
            if(it.getCategory().equals(category)){
                pro[i] = it;
                ++i;
            }
        }
        //array with required length
        Product[] proOut = new Product[i];
        //System.out.println(i);
        if(i==0){
            return null;
        }
        return proOut;
        //return new Product[]{};
    }
}
