package serviceimpl;

import mapper.CartItemMapper;
import org.springframework.stereotype.Service;
import pojo.CartItem;
import service.CartItemService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Resource
    private CartItemMapper cartItemMapper;

    @Override
    public boolean addCartItem(CartItem cartItem) {
        return cartItemMapper.addCartItem(cartItem) > 0;
    }

    @Override
    public List<CartItem> selectByCustomerId(int customerId) {
        return cartItemMapper.selectByCustomerId(customerId);
    }

    @Override
    public boolean deleteCartItem(int id) {
        return cartItemMapper.deleteCartItem(id) > 0;
    }
}
