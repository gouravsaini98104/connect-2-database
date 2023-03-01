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
        entityManagerFactoryRef = "gouravEntityManagerFactory",
        transactionManagerRef = "gouravTransactionManager",
        basePackages = {"com.example.demo.jpa.repository.gourav"}
)
public class GouravDBConfig {

    @Autowired
    Environment env;

    @Bean(name = "gouravDataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.second.datasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.second.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.second.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.second.datasource.password"));

        return dataSource;
    }

    @Bean(name = "gouravEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    barEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("gouravDataSource") DataSource dataSource
    ) {
        return
                builder
                        .dataSource(dataSource)
                        .packages("com.example.demo.entities.gourav")
                        .persistenceUnit("db2")
                        .build();
    }

    @Bean(name = "gouravTransactionManager")
    public PlatformTransactionManager gouravTransactionManager(
            @Qualifier("gouravEntityManagerFactory") EntityManagerFactory
                    gouravEntityManagerFactory
    ) {
        return new JpaTransactionManager(gouravEntityManagerFactory);
    }
}
