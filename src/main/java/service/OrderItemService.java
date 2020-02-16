package service;

import pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
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
     * @param orderItem(orderid,productname,listprice,qty,totalprice) OrderItem
     * @return 如果添加成功则返回true，否则返回false
     */
    boolean addOrderItem(OrderItem orderItem);

    /**
     * 通过id删除订单详细项记录
     *
     * @param id id
     * @return 如果删除成功则返回true，否则返回false
     */
    boolean deleteOrderItemById(int id);

    /**
     * 通过订单id删除订单详细项记录
     *
     * @param orderId 订单id
     * @return 如果删除成功则返回true，否则返回false
     */
    boolean deleteOrderItemByOrderId(int orderId);

    /**
     * 更新订单详细项记录信息
     *
     * @param orderItem(id,orderid,productname,listprice,qty,totalprice) OrderItem
     * @return 如果更新成功则返回true，否则返回false
     */
    boolean updateOrderItem(OrderItem orderItem);
}
