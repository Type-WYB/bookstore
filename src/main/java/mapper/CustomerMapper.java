package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Customer;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/1/13 17:05
 */
public interface CustomerMapper {
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    void updateCustomer(Customer customer);
    Customer selectById(int id);
    Customer isMatch(@Param("name") String name, @Param("pwd") String pwd);
}
