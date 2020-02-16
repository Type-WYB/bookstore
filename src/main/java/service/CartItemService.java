package service;

import pojo.CartItem;

import java.util.List;

public interface CartItemService {
    /**
     * 添加购物车记录
     *
     * @param cartItem 购物车对象
     * @return 如果添加成功返回true，否则返回false
     */
    boolean addCartItem(CartItem cartItem);

    /**
     * 查询该用户的所有购物车记录
     * @param customerId 指定用户id
     * @return 返回查询结果集
     */
    List<CartItem> selectByCustomerId(int customerId);

    /**
     * 删除购物车记录
     *
     * @param id 要删除的记录id
     * @return 如果删除成功则返回true，否则返回false
     */
    boolean deleteCartItem(int id);
}
