import cn.tedu.config.Config;
import cn.tedu.entity.DragonBlade;
import cn.tedu.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSpringTest {
    @Test
    public void ht(){
        System.out.println("hello word");
    }
    @Test
    public void hah(){
        AnnotationConfigApplicationContext ax = new AnnotationConfigApplicationContext("Config.class");
        AnnotationConfigApplicationContext acac=
                new AnnotationConfigApplicationContext(
                        Config.class);
        User user =  acac.getBean("bean", User.class);
        System.out.println(user);
        acac.close();
    }
    AnnotationConfigApplicationContext acac;
   @Before
        public  void befors(){
       acac= new AnnotationConfigApplicationContext(Config.class);
       System.out.println("before");
   }
   @After
    public void after(){
       acac.close();
       System.out.println("after");
   }
   @Test
    public void test1(){
       User user = acac.getBean("bean",User.class);
       System.out.println(user);
   }
   @Test
    public void test2(){
       DragonBlade blade = acac.getBean("dragonBlade",DragonBlade.class);
       System.out.println(blade);
   }
   @Test
    public void test3(){
       DragonBlade d1 = new DragonBlade();
       DragonBlade d2 = new DragonBlade();
       System.out. println(d1==d2);

   }
}
