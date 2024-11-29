package com.example.manzo.damo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DamoApplication.class, args);
	}

}

@RestController()
@RequestMapping("/api")
class DamoController {
    @GetMapping("/teste")
    public String GetMethodName(@RequestParam String param) {
        return "this..." + param;
    }

	@GetMapping("/aluno")
	public String getAluno() {
		return Aluno.builder().RA("123").nome("Manzo").toString();
	}
	

}
																			\