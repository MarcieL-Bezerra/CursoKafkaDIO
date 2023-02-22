package com.marcielbezerra.cursoKafkaDio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class CursoKafkaDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoKafkaDioApplication.class, args);
	}

}
