package serviceimpl;

import mapper.OrderItemMapper;
import org.springframework.stereotype.Service;
import service.OrderItemService;

import javax.annotation.Resource;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemMapper orderItemMapper;
}
