package mapper;

import pojo.Order;
import pojo.User;

import java.util.List;


public interface UserMapper {
    public List<Order> getUserOrders(int uid);
    public User getUserById(int uid);
    User login(User user);
}
