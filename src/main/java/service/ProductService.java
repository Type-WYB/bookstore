package service;

import pojo.CartItem;
import pojo.Product;

import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/7 17:04
 */
public interface ProductService {
    List<Product> getHomeProduct();
    Product getProById(int id);
}
