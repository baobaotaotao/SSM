import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class testDao {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        ItemsDao dao = ac.getBean(ItemsDao.class);
        List<Items> all = dao.findAll();
        System.out.println(all);
    }
}
