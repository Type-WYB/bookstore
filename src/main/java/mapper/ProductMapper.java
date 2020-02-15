package mapper;


import pojo.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> getAllProduct();

    /**
     * 通过ID获取具体的书籍信息
     *
     * @param id 书籍ID
     * @return 返回查询结果
     */
    Product getProduct(int id);
}
