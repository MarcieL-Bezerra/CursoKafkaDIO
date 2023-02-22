package com.marcielbezerra.cursoKafkaDioConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class CursoKafkaDioConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoKafkaDioConsumerApplication.class, args);
	}

}
