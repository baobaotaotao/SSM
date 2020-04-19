import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.serivce.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class testService {

    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        ItemsService service = (ItemsService) ac.getBean("itemsService");
        List<Items> all = service.findAll();
        System.out.println(all);
    }
}
