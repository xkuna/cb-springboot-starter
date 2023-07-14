package top.coolbreeze4j.cbclient.starter;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CoolBreeze
 * @date 2023/7/14 9:20.
 */
@SuppressWarnings("all")
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(CBclientProperties.class)
@ConditionalOnBean(ICBclientService.class)
public class CBclientAutoConfiguration {

    @Bean
    public CBclient cbclient(CBclientProperties cbclientProperties){
        CBclient cbclient = new CBclient();
        BeanUtils.copyProperties(cbclientProperties, cbclient);
        return cbclient;
    }
}
