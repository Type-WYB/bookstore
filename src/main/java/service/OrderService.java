package service;

import pojo.Order;
import pojo.OrderItem;

import java.util.List;

public interface OrderService {
    /**
     * 查询所有的订单
     *
     * @return 返回查询结果集
     */
    List<Order> selectAll();

    /**
     * 通过订单id查询订单信息
     *
     * @param id 订单id
     * @return 返回查询到的订单
     */
    Order selectById(int id);

    /**
     * 通过用户id查询该用户的所有订单信息
     *
     * @param customerId 用户id
     * @return 返回查询结果集
     */
    List<Order> selectByCustomerId(int customerId);

    /**
     * 添加订单记录
     *
     * @param order(cutomerid,username,orderdate,addr1,city,state,zip,phone) 订单对象
     * @param orderItem(productname,listprice,qty,totalprice)                订单详细项
     * @return 如果添加成功返回true，否则返回false
     */
    boolean addOrder(Order order, OrderItem orderItem);

    /**
     * 删除订单记录
     *
     * @param id 要删除的订单记录id
     * @return 如果删除成功返回true，否则返回false
     */
    boolean deleteOrder(int id);

    /**
     * 更新订单记录
     *
     * @param order(id,cutomerid,username,orderdate,addr1,city,state,zip,phone) 要进行更新的订单信息
     * @return 如果更新成功则返回true，否则返回false
     */
    boolean updateOrder(Order order);
}
