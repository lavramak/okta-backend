package com.aegon.pension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class PensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionApplication.class, args);
	}

	@Bean("threadPoolTaskExecutor")
	public TaskExecutor getAsyncExecutor() {
		ThreadPoolTaskExecutor asyncExecutor = new ThreadPoolTaskExecutor();
		asyncExecutor.setCorePoolSize(5);
		asyncExecutor.setMaxPoolSize(20);
		asyncExecutor.setWaitForTasksToCompleteOnShutdown(true);
		asyncExecutor.setThreadNamePrefix("Async-");
		asyncExecutor.initialize();
        return asyncExecutor;		
		
	}
}