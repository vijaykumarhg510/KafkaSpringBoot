package com.example.Prod.configuration;



import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class TopicCreation {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("newTopic").build();
    }
}
