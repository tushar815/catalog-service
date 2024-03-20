package com.polarbookshop.catalogservice.config;

import com.polarbookshop.catalogservice.domain.BookRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcAuditing
public class DataConfig {

}
