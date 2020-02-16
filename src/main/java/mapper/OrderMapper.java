package mapper;

import pojo.Order;

import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 17:03
 */
public interface OrderMapper {
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
     * @param order 订单对象
     * @return 返回该条记录的主键
     */
    int addOrder(Order order);

    /**
     * 删除订单记录
     *
     * @param id 要删除的订单记录id
     * @return 返回受影响行数
     */
    int deleteOrder(int id);

    /**
     * 更新订单记录
     *
     * @param order 要进行更新的订单信息
     * @return 返回受影响行数
     */
    int updateOrder(Order order);
}
