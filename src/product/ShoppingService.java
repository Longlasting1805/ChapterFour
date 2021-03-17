//package product;
//
//import product.Customer.Buyer;
//import product.Exception.CheckOutException;
//
//public class ShoppingService {
//    public boolean checkOut(Buyer buyer) throws CheckOutException{
//
//        if (buyer == null){
//            throw new CheckOutException("No buyer found at checkOut");
//        }
//
//
//        if (buyer.getCart().getItem().isEmpty()){
//            throw new CheckOutException("Cart found at check out");
//        }
//
//        if (buyer.getCart() == null || buyer.getCards().isEmptyty()){
//            throw new CheckOutException("Cart found at check out");
//        }
//
//        return false;
//    }
//}
