package coffee.synyx.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    DiscoveryApplication() {

        // hide implicit public constructor
    }

    @SuppressWarnings("checkstyle:uncommentedmain")
    public static void main(String[] args) {

        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
