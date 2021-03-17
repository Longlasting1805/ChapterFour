//package product.Exception.Shopping;
//
//import product.Exception.ProductException;
//import product.Product;
//import product.ProductService;
//import product.ProductServiceImpl;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
////import java.lang.System.Logger.Level;
//
//public class Cart {
//    //private Logger logger = Logger.getLogger(Cart.class.getName());
//    private Map<String, CartItem> items;
//    private ProductService productService;
//    private BigDecimal total;
//
//    public Cart(){
//        product = new ArrayList<>();
//        productService = new ProductServiceImpl();
//    }
//
//    public void addToCart(Product product){
//        if (verifiedProduct(product)){
//            CartItem item = items.get(product.setProductId());
//            if (item == null){
//                item = new CartItem();
//                item.setProduct(product);
//                item.addItems(BigDecimal.ONE.intValue());
//            }
//            item.addItems(BigDecimal.ONE.intValue());
//            items.put(product.getProductId(), item);
////            Product verifiedProduct = productService.findProductById(product.getProductId());
////            this.product.items.put(product);
//        }
//
//        public void addToCart(Product product, product quantity){
//
//        }
//
//    }
//
//
//
//    private boolean verifiedProduct(Product product){
//        boolean verified = false;
//        if (product != null){
//            try{
//                Product verifiedProduct = productService.findProductById(product.getProductId());
//                verified = true;
//            }catch (ProductException ex){
////                logger.log(java.logger.);
//                // TODO: 3/10/2021 add log message
//            }
//        }
//    }
//
//    public boolean removeFromCart(Product product){
//        boolean removed = false;
//    }
//
//    public boolean getProducts() {
//        boolean removed;
//        return removed = false;
//        if (product != null){
//            this.product.remove(product);
//        }
//        return removed;
//    }
//    public <iterator> BigDecimal calculateCartTotal(){
//        if (!items.isEmpty()){
//            iterator cartItem = (iterator) items.values().iterator();
//            while(((Iterator<?>) cartItem).hasNext()){
//                this.total = this.total.add(cartItems.next().getTotal());
//            }
//        }
//        return this.getTotal();
//    }
//}
