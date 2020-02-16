package serviceimpl;

import mapper.CartItemMapper;
import org.springframework.stereotype.Service;
import pojo.CartItem;
import service.CartItemSerice;

import javax.annotation.Resource;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/15 13:24
 */
@Service
public class CartItemServiceImpl implements CartItemSerice {
    @Resource
    CartItemMapper cartitemMapper;

    @Override
    public void add(CartItem cartItem) {
//           cartitemMapper.add(cartItem);
    }
}
