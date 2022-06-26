package com.barbeariatoledo.BarbeariaAPI.Config;

import com.barbeariatoledo.BarbeariaAPI.Tools.DateFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateTimeFormatterConfig {
        @Bean
        public DateFormatter dateFormatter(){
            DateFormatter dateFormatter = new DateFormatter();
            return dateFormatter;
        }

}
