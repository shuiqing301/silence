import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Junit 测试基类，主要是为了加载配置文件
 * 使得继承此类的子类不需要再去加载配置文件
 * @author ShuiQing PM	
 * 2014年9月13日 下午5:22:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/springContext-*.xml"})
@WebAppConfiguration
public class TestCase{

    @Test
	public void test () {

    }
}
