package serviceimpl;

import mapper.OrderMapper;
import org.springframework.stereotype.Service;
import service.OrderService;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
}
