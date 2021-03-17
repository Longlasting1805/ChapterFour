//package product;
//
//import product.Exception.ProductException;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Map;
//
//public class ProductDB {
//    private static Map<Product> mockProduct;
//
//    public ProductDB(){
//        Product plantainChips = new Product("Adunni Chips", "Savoury Plantain Chips", new BigDecimal((50));
//        plantainChips.setProductId("AD001");
//        mockProduct.put(plantainChips.getProductId());
//
//        Product noseMask = new Product();
//        noseMask.setProductId("AD002");
//        noseMask.setName("cover nose mask");
//        noseMask.setDescription("best in class nose mask");
//        noseMask.setPrice(new BigDecimal(4500));
//        mockProduct.put(noseMask.getProductId(), noseMask);
//
//        Product shirt = new Product("vintage shirt", "vintage Verse");
//
//    }
//    public void getMockProduct(){
//        this.mockProduct = mockProduct;
//    }
//    public Product getProductById(String id) throws ProductException {
//        Product result = (Product) mockProduct.get(id);
//        if (result == null){
//            StringBuilder message = new StringBuilder("product with id ");
//            message.append(id);
//            message.append("not found");
//            throw new ProductException(message.toString());
//        }
//
//        return result;
//    }
//
//
//}
