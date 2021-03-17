//package product.Exception;
//
//import com.company.Payments.PaymentCard;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import product.Customer.Buyer;
//import product.Exception.Shopping.Cart;
//import product.ProductDB;
//import product.ShoppingService;
//
//import java.util.Collection;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ShoppingServiceImplTest {
//    private Buyer dozie;
//    private ShoppingService shoppingService;
//
//    @BeforeEach
//    void setUp() {
//        ProductDB productDB = new ProductDB();
//        dozie = new Buyer();
//        shoppingService = new ShoppingServiceImpl();
//        PaymentCard fbnVisa = new PaymentCard("12345", "Don Dozie", "2025", );
//        dozie.getCards().add(fbnVisa);
//        Cart DozieCart = new Cart();
//        dozie.addToCart(product.getMockPtoducts().get("AD001", 5));
//
//        dozie.setCart(dozieCart);
//    }
//
//    @Test
//    void checkOutWithNullBuyer(){
//        assertThrows(CheckOutException.class, ()-> shoppingService.checkOut(dozie));
//    }
//
//    @Test
//    void checkOutWithNullCart(){
//        dozie.setCart(new Cart());
//        assertThrows(CheckOutException.class, ()-> shoppingService.checkOut(dozie));
//    }
//
//    @Test
//    void checkOutWithNullPaymentCard(){
//        dozie.setCards(null);
//        assertThrows(CheckOutException.class, ()-> shoppingService.checkOut(dozie));
//    }
//
//    @Test
//    void checkOutWithNoPaymentCard(){
//        dozie.setCards(Collection.);
//        assertThrows(CheckOutException.class, ()-> shoppingService.checkOut(dozie));
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//}