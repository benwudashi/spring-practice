package tacos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@TestPropertySource({"classpath:application.properties"})
//@PropertySource({"classpath:application.properties"})
@RunWith(SpringRunner.class)    // SpringJUnit4ClassRunner
@SpringBootTest                 // <2>
public class TacoCloudApplicationTests {

    @Test                         // <3>
    public void contextLoads() {
    }

}
