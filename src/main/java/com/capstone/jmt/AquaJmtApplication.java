package com.capstone.jmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jabito on 01/02/2017.
 */
@Configuration
@EnableAutoConfiguration(exclude = {JndiConnectionFactoryAutoConfiguration.class,DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan
public class AquaJmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(AquaJmtApplication.class, args);
    }
}
