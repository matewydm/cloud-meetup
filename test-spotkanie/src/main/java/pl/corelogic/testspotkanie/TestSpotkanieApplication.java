package pl.corelogic.testspotkanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestSpotkanieApplication extends SpringBootServletInitializer {

    private static Class<TestSpotkanieApplication> applicationClass = TestSpotkanieApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(TestSpotkanieApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}
