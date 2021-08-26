package br.com.lucascp1.msvmanagerteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsvManagerTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvManagerTeamApplication.class, args);
	}

}
