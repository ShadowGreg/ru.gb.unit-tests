package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
        testSetAndGetProductsWhenValidListThenReturnList();
        testGetMostExpensiveProductWhenListNotEmptyThenReturnMostExpensiveProduct();
    }

    private static void FillProducts(Shop shop) {
        Product product1 = new Product("Product 1", 10);
        Product product2 = new Product("Product 2", 20);
        Product product3 = new Product("Product 3", 15);

        // Add products to the shop
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        shop.setProducts(products);
    }

    public static void testGetMostExpensiveProduct() {
        // Create some products
        Shop shop = new Shop();
        FillProducts(shop);
        Product product2 = new Product("Product 2", 20);

        // Get the most expensive product
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Assert that the most expensive product is correct
        assertThat(mostExpensiveProduct).isEqualTo(product2);
    }

    public static void testSortProductsByPrice() {
        // Create some products
        Shop shop = new Shop();
        FillProducts(shop);

        // Sort the products by price
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Assert that the products are sorted correctly
        assertThat(sortedProducts.get(0).getTitle()).isEqualTo("Product 1");
        assertThat(sortedProducts.get(1).getTitle()).isEqualTo("Product 3");
        assertThat(sortedProducts.get(2).getTitle()).isEqualTo("Product 2");
    }

    private static List<Product> otherFilling(Shop shop) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("product1", 100);
        products.add(product1);

        Product product2 = new Product("product2", 200);

        products.add(product2);

        shop.setProducts(products);

        return products;
    }

    public static void testSetAndGetProductsWhenValidListThenReturnList() {
        // Create some products
        Shop shop = new Shop();

        // Sort the products by price
        List<Product> expectedProducts = otherFilling(shop);


        // Assert that the products are sorted correctly
        assertThat(shop.getProducts()).isEqualTo(expectedProducts);
    }

    public static void testGetMostExpensiveProductWhenListNotEmptyThenReturnMostExpensiveProduct() {
        // Create some products
        Shop shop = new Shop();

        // Sort the products by price
        String expectedProduct = otherFilling(shop).get(1).getTitle();

        assertThat("product2").isEqualTo(expectedProduct);
    }

}