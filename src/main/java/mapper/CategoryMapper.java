package mapper;

import pojo.Category;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 17:06
 */
public interface CategoryMapper {
    /**
     * 获取商品分类通过商品分类名称
     *
     * @param name 商品分类名称
     * @return 获取查询到的商品分类信息
     */
    Category selectByName(String name);
}
