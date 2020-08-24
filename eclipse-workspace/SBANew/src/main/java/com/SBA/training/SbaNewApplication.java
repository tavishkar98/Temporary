package com.SBA.training;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SBA.training.model.SBA;
import com.SBA.training.repo.SBArepo;

//(scanBasePackages = {"com.test", "com.bean"}) 
@SpringBootApplication
public class SbaNewApplication implements CommandLineRunner {

	private SBArepo sbaRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SbaNewApplication.class, args);
	}

	
	public SbaNewApplication(SBArepo sbaRepo) {
		super();
		this.sbaRepo = sbaRepo;
	}


	@Override
	public void run(String... args) throws Exception {
		
		sbaRepo.save(new SBA(UUID.randomUUID().toString(),"MyTitle","pending","description"));
		sbaRepo.save(new SBA(UUID.randomUUID().toString(),"MyTitle2","pending2","description2 termina"));
		
	}

	
}
