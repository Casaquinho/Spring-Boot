package com.br.manzo.restdemoh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
import lombok.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class Restdemoh2Application {

	public static void main(String[] args) {
		SpringApplication.run(Restdemoh2Application.class, args);
	}

}

@Data
@Builder //construtor com func pronta
class Demo{
	long id;
	String description;
}

@RestController
@RequestMapping("/demo")
class DemoController 
{

	DemoRepository DemoRepository = new DemoRepository();

	@GetMapping("/path")
	public Demo getDemo(@PathVariable("id") long id)
	{
		return DemoRepository.getDemo(id);
	}
	
}

]@Service
class DemoService
{

	public Demo getDemo(long id)
	{
		return Demo.builder().id(id).description("Demo").build();
	}
}

class DemoRepository
{
	public Demo getDemo(long id)
	{
		return Demo.builder().id(id).description("Demo").build();
	}
}