package com.photographyagenda.backend.config;


import com.photographyagenda.backend.entity.Client;
import com.photographyagenda.backend.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(ClientRepository clientRepository){
        return  args -> {
            Client client = new Client(0,"Maria","51999999999");

            clientRepository.save(client);

            System.out.println("cliente salvo");
        };
    }
}
