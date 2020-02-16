package mapper;

import pojo.OrderItem;

import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 17:03
 */
public interface OrderItemMapper {
    /**
     * 查询所有的订单详细项记录
     *
     * @return 返回查询结果集
     */
    List<OrderItem> selectAll();

    /**
     * 通过id查询订单详细项记录
     *
     * @param id id
     * @return 返回订单详细项
     */
    OrderItem selectById(int id);

    /**
     * 通过订单id查询订单详细项
     *
     * @param orderId 订单id
     * @return 返回订单详细项
     */
    OrderItem selectByOrderId(int orderId);

    /**
     * 通过订单id查询订单总价
     *
     * @param orderId 订单id
     * @return 订单总价
     */
    int selectTotalPriceByOrderId(int orderId);

    /**
     * 添加订单详细项记录
     *
     * @param orderItem OrderItem
     * @return 返回受影响行数
     */
    int addOrderItem(OrderItem orderItem);

    /**
     * 通过id删除订单详细项记录
     *
     * @param id id
     * @return 返回受影响行数
     */
    int deleteOrderItemById(int id);

    /**
     * 通过订单id删除订单详细项记录
     *
     * @param orderId 订单id
     * @return 返回受影响行数
     */
    int deleteOrderItemByOrderId(int orderId);

    /**
     * 更新订单详细项记录信息
     *
     * @param orderItem OrderItem
     * @return 返回受影响行数
     */
    int updateOrderItem(OrderItem orderItem);
}
