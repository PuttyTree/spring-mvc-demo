import com.bkm.spring.model.User;
import com.bkm.spring.service.HelloWorldService;
import com.bkm.spring.service.UserService;

import com.bkm.spring.service.impl.HelloWorldServiceImpl;
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

    @Test
    public void testSet() {
        helloWorldService.save("zhang san");
    }

}




