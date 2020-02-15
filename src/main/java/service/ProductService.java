package service;

import pojo.Product;

import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/7 17:04
 */
public interface ProductService {
    List<Product> getHomeProduct();

    /**
     * 通过ID获取具体的书籍信息
     *
     * @param id 书籍ID
     * @return 返回查询结果
     */
    Product getProduct(int id);
}
