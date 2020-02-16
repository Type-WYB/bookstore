package serviceimpl;

import mapper.CartItemMapper;
import org.springframework.stereotype.Service;
import pojo.CartItem;
import service.CartItemService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/15 13:24
 */
@Service
public class CartItemServiceImpl implements CartItemService {
    @Resource
    CartItemMapper cartitemMapper;


    @Override
    public boolean addCartItem(CartItem cartItem) {
        return cartitemMapper.addCartItem(cartItem) > 0;
    }

    @Override
    public List<CartItem> selectByCustomerId(int customerId) {
        return cartitemMapper.selectByCustomerId(customerId);
    }

    @Override
    public boolean deleteCartItem(int id) {
        return cartitemMapper.deleteCartItem(id) > 0;
    }
}
