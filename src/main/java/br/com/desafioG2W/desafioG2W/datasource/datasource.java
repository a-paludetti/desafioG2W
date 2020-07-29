package br.com.desafioG2W.desafioG2W.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class datasource {

    @Bean
    @ConfigurationProperties("app.datasource")
    public HikariDataSource getDataSource(){
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}
