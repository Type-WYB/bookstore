package service;

import pojo.Category;

public interface CategoryService {
    /**
     * 获取商品分类通过商品分类名称
     *
     * @param name 商品分类名称
     * @return 获取查询到的商品分类信息
     */
    Category selectByName(String name);
}
