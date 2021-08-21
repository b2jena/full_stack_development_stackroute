package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTests {

    private static final String MSG_01 = "findProductNameByCode should return name of the existing product";
    private static final String MSG_02 = "findProductNameByCode should return null for non existing product";
    private static final String MSG_03 = "findMaxPriceProductInCategory should return the product with the highest price in the given category";
    private static final String MSG_04 = "findMaxPriceProductInCategory should return null for non existing category";
    private static final String MSG_05 = "getProductsByCategory should return all the products in an Array for existing category and null for nonexisting category";

    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @AfterEach
    public void tearDown() {
        productService = null;
    }

    @Test
    public void givenProductRepositoryWhenExistingProductSearchedByProductCodeThenReturnProductName() {
        assertEquals("keyboard", productService.findProductNameByCode(101), MSG_01);
    }

    @Test
    public void givenProductRepositoryWhenNonExistingProductSearchedByProductCodeThenReturnNull() {
        assertNull(productService.findProductNameByCode(999), MSG_02);
    }

    @Test
    public void givenProductRepositoryWhenHighestPricedProductSearchedByExistingCategoryThenReturnProduct() {
        Product expectedProduct = productService.findMaxPriceProductInCategory("clothing");
        assertNotNull(expectedProduct, MSG_03);
        assertEquals("jeans", expectedProduct.getName(), MSG_03);

    }

    @Test
    public void givenProductRepositoryWhenHighestPricedProductSearchedByNonExistingCategoryThenReturnNull() {
        Product expectedProduct = productService.findMaxPriceProductInCategory("unknown");
        assertNull(expectedProduct, MSG_04);
    }

    @Test
    public void givenProductRepositoryWhenProductsSearchedByExistingCategoryThenReturnArrayOfProducts() {
        Product[] toyProducts = productService.getProductsByCategory("toys");
        assertNotNull(toyProducts, MSG_03);
        assertEquals(2, toyProducts.length, MSG_05);
    }

    @Test
    public void givenProductRepositoryWhenProductsSearchedByNonExistingCategoryThenReturnNull() {
        Product[] toyProducts = productService.getProductsByCategory("unknown");
        assertNull(toyProducts, MSG_05);
    }
}