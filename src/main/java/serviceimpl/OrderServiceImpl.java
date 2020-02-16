package serviceimpl;

import mapper.OrderItemMapper;
import mapper.OrderMapper;
import org.springframework.stereotype.Service;
import pojo.Order;
import pojo.OrderItem;
import service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public Order selectById(int id) {
        return orderMapper.selectById(id);
    }

    @Override
    public List<Order> selectByCustomerId(int customerId) {
        return orderMapper.selectByCustomerId(customerId);
    }

    @Override
    public boolean addOrder(Order order, OrderItem orderItem) {
        // 添加到订单表order，返回该条记录的主键id
        int i = orderMapper.addOrder(order);
        OrderItem oi = new OrderItem(i,orderItem.getProductname(),orderItem.getListprice(),orderItem.getQty(),orderItem.getTotalprice());
        // 添加到订单详细项orderitem表
        return orderItemMapper.addOrderItem(oi) > 0;
    }

    @Override
    public boolean deleteOrder(int id) {
        // 在order表中删除记录
        orderMapper.deleteOrder(id);
        // 在orderitem表中删除记录
        return orderItemMapper.deleteOrderItemByOrderId(id)>0;
    }

    @Override
    public boolean updateOrder(Order order) {
        return orderMapper.updateOrder(order)>0;
    }
}
