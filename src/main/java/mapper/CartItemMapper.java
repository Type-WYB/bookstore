package mapper;

import pojo.CartItem;

import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 17:03
 */
public interface CartItemMapper {
    /**
     * 添加购物车记录
     *
     * @param cartItem 购物车对象
     * @return 返回受影响行数
     */
    int addCartItem(CartItem cartItem);

    /**
     * 查询该用户的所有购物车记录
     *
     * @param customerId 指定用户id
     * @return 返回查询结果集
     */
    List<CartItem> selectByCustomerId(int customerId);

    /**
     * 删除购物车记录
     *
     * @param id 要删除的记录id
     * @return 返回受影响行数
     */
    int deleteCartItem(int id);
}
