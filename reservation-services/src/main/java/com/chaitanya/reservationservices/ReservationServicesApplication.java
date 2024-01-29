package com.chaitanya.reservationservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@EnableDiscoveryClient
public class ReservationServicesApplication {

//	@Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("Reservations").select()
//                .apis(RequestHandlerSelectors.basePackage("com.frankmoley.services.reservation"))
//                .paths(any()).build().apiInfo(new ApiInfo("Reservation Services",
//                        "A set of services to provide data access to reservations", "1.0.0", null,
//                        new Contact("Frank Moley", "https://twitter.com/fpmoles", null),null, null));
//    }
	
	public static void main(String[] args) {
		SpringApplication.run(ReservationServicesApplication.class, args);
	}

}
