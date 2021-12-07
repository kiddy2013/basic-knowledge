package basic.knowledge.base.core.reflect;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author jack
 */
public class MainEnter {

    private static final Logger log = Logger.getAnonymousLogger();

    public static final String fieldTest = "test";

    public Integer methodTest(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        //class 的三种获取方式
        var generator = new Random();
        Class cl = generator.getClass();
        System.out.println(cl.getName());

        var cl1 = Class.forName("java.util.Random");
        System.out.println(cl1.getName());

        var cl2 = Random.class;
        System.out.println(cl2.getName());

        //constructor 来实现创建对象
        Random random = cl2.getConstructor().newInstance();

        // resource
        URL url = MainEnter.class.getResource("/resource.txt");
        System.out.println(url.getPath());

        InputStream stream = MainEnter.class.getResourceAsStream("/resource.txt");
        System.out.println(new String(stream.readAllBytes()));

        // Field ,Method ,Constructor
        Field field = MainEnter.class.getField("fieldTest");
        System.out.println(field.getName());
        System.out.println(field.getModifiers());

        Method method = MainEnter.class.getMethod("methodTest", Integer.class, Integer.class);
        var result = method.invoke(new MainEnter(), 1, 2);
        System.out.println(result);
        System.out.println(Modifier.isPrivate(method.getModifiers()));
    }

}
