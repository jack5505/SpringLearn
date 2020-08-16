package jack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Sabirov Jakhongir
 */
public class HelloWorld {
    public static void main(String[] args) {
        BeanFactory factory  = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        Alien obj = (Alien) factory.getBean("alien");
        obj.code();
    }
}
