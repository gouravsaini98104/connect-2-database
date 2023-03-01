package com.example.demo.configuration.database;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mydbEntityManagerFactory",
        transactionManagerRef = "mydbTransactionManager",
        basePackages = {"com.example.demo.jpa.repository.mydb"} // jpa repository
)
public class MYDBConfig {

    @Autowired
    Environment env;
    @Primary
    @Bean(name = "mydbDataSource")
    public DataSource mydbDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }

    @Primary
    @Bean(name = "mydbEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mydbDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.demo.entities.mydb") // entity
                .persistenceUnit("db1")
                .build();
    }

    @Primary
    @Bean(name = "mydbTransactionManager")
    public PlatformTransactionManager mydbTransactionManager(
            @Qualifier("mydbEntityManagerFactory") EntityManagerFactory
                    mydbEntityManagerFactory
    ) {
        return new JpaTransactionManager(mydbEntityManagerFactory);
    }

}
