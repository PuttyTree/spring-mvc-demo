import com.bkm.spring.dao.UserMapext;
import com.bkm.spring.dao.UserMapper;
import com.bkm.spring.utils.JdbcTemplateUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/7/22.
 */
public class MainTest {
	@Resource
	private UserMapper userMapper;
	@Resource
	private UserMapext userMapext;


	@Test
	public void jdbcTest() {
		try {
			userMapext.deleteAll();

		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
