package serviceimpl;

import mapper.CartItemMapper;
import org.springframework.stereotype.Service;
import service.CartItemService;

import javax.annotation.Resource;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Resource
    private CartItemMapper cartItemMapper;
}
