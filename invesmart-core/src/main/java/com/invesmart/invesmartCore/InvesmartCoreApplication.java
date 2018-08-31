package com.invesmart.invesmartCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InvesmartCoreApplication {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(InvesmartCoreApplication.class, args);
    }

    /*@Bean
    public JMPCCoreApplication jmpcCoreApplication() {
        return new JMPCCoreApplicationImpl();
    }

    @Bean("portFolioManger")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PortFolioManger getAccountService() {
        return new PortFolioManger();
    }*/

}
