package mapper;

import pojo.Order;
import pojo.User;

import java.util.List;


public interface UserMapper {
    List<Order> getUserOrders(int uid);
    User getUserById(int uid);
    User login(User user);
}
