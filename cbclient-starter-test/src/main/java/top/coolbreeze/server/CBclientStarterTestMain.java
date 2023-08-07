package top.coolbreeze.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import top.coolbreeze4j.cbclient.starter.CBclient;

/**
 * @author CoolBreeze
 * @date 2023/7/14 10:26.
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = {"top.coolbreeze.server"})
public class CBclientStarterTestMain {
    @Autowired
    CBclient cbclient;
    public static void main(String[] args) {
        SpringApplication.run(CBclientStarterTestMain.class, args);
    }

    //ContextRefreshedEvent可以用于在Spring容器完全初始化之后执行一些操作
    @EventListener(ContextRefreshedEvent.class)
    public void contextRefreshed(){
        System.out.println(cbclient.toString());
    }
}
