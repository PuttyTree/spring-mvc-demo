import com.bkm.spring.dao.RolePermissionMapext;
import com.bkm.spring.dao.RolePermissionMapper;
import com.bkm.spring.dao.UserMapext;
import com.bkm.spring.dao.UserMapper;
import com.bkm.spring.model.RolePermissionKey;
import com.bkm.spring.model.User;
import com.bkm.spring.service.HelloWorldService;
import com.bkm.spring.service.UserService;

import com.bkm.spring.service.impl.HelloWorldServiceImpl;
import com.bkm.spring.utils.JdbcTemplateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
;

import javax.annotation.Resource;

import java.util.List;


/**
 * Created by yongli.chen on 2017/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:application-test.xml"
})
public class AopTest {
    @Autowired
    HelloWorldService helloWorldService;

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserMapext userMapext;

    @Resource
    private RolePermissionMapper rolePermissionMapper;
    @Resource
    private RolePermissionMapext rolePermissionMapext;

    @Test
    public void testSet() {
        helloWorldService.save("zhang san");
    }

    @Test
    public void rolePermissionTest(){


        RolePermissionKey key = new RolePermissionKey();
        key.setPermissionId(1L);
        key.setRoleId(1L);
        //int count = rolePermissionMapext.count(key);
        //rolePermissionMapper.insertSelective(key);
        int count = rolePermissionMapext.count(key);
    }

    @Test
    public  void jdbcTest(){
        try {
            userMapext.deleteAll();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}




