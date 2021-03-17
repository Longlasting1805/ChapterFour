//package product.Exception.Shopping;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import product.Product;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CartTest {
//    Cart cart;
//
//    @BeforeEach
//    void setUp() {
//        Cart = new cart();
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//    @Test
//    void addToCart(){
//        assertTrue(cart.getProducts().isEmpty());
//        Product testProduct = new Product();
//        cart.addToCart(testProduct);
//        assertFalse(cart.getProducts().isEmpty());
//        assertEquals(1,cart.getProducts().size());
//    }
//    @Test
//    void removeFromCart(){
//        assertTrue(cart.getProducts().isEmpty());
//        Product testProduct = new Product();
//        cart.addToCart(testProduct);
//        assertFalse(cart.getProducts().isEmpty());
//        assertEquals(1,cart.getProducts().size());
//
//        Product plantainChips = null;
//        boolean result =  cart.removeFromCart(null);
//       assertTrue(result);
//       assertTrue(cart.getProducts().isEmpty());
//
//    }
//    @Test
//    void calculateTotal(){
//        assertTrue(cart.getItems().isEmpty());
//        Product plantainChips = new Product("Adunni Chips", "Savoury plantain Chips", new BigDecimal());
//        cart.addToCart(testProduct);
//        assertFalse(cart.getProducts().isEmpty());
//        assertEquals(1,cart.getProducts().size());
//        BigDecimal cartTotal
//
//        Product plantainChips = null;
//        boolean result =  cart.removeFromCart(null);
//        assertTrue(result);
//        assertTrue(cart.getProducts().isEmpty());
//
//    }
//}