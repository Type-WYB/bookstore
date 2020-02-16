package serviceimpl;

import mapper.OrderItemMapper;
import org.springframework.stereotype.Service;
import pojo.OrderItem;
import service.OrderItemService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> selectAll() {
        return orderItemMapper.selectAll();
    }

    @Override
    public OrderItem selectById(int id) {
        return orderItemMapper.selectById(id);
    }

    @Override
    public OrderItem selectByOrderId(int orderId) {
        return orderItemMapper.selectByOrderId(orderId);
    }

    @Override
    public int selectTotalPriceByOrderId(int orderId) {
        return orderItemMapper.selectTotalPriceByOrderId(orderId);
    }

    @Override
    public boolean addOrderItem(OrderItem orderItem) {
        return orderItemMapper.addOrderItem(orderItem) > 0;
    }

    @Override
    public boolean deleteOrderItemById(int id) {
        return orderItemMapper.deleteOrderItemById(id) > 0;
    }

    @Override
    public boolean deleteOrderItemByOrderId(int orderId) {
        return orderItemMapper.deleteOrderItemByOrderId(orderId) > 0;
    }

    @Override
    public boolean updateOrderItem(OrderItem orderItem) {
        return orderItemMapper.updateOrderItem(orderItem) > 0;
    }
}
