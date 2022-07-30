package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.zhf.Zhf;
import org.springframework.zhf.ZhfPostProcessBeanFactory;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Zhf bean = applicationContext.getBean(Zhf.class);
		ZhfPostProcessBeanFactory bean1 = applicationContext.getBean(ZhfPostProcessBeanFactory.class);
		System.out.println(bean1.getBeanFactory());
		System.out.println(bean.toString());
	}
}
