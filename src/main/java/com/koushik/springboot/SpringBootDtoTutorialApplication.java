package com.koushik.springboot;

import com.koushik.springboot.model.Location;
import com.koushik.springboot.model.User;
import com.koushik.springboot.repository.LocationRepository;
import com.koushik.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);

		locationRepository.save(location);

		User user = new User();
		user.setFirstName("Koushik");
		user.setLastName("Goenka");
		user.setEmail("koushik@gmail.com");
		user.setPassword("password");
		user.setLocation(location);
		userRepository.save(user);


		User user1 = new User();
		user1.setFirstName("Jay");
		user1.setLastName("Goenka");
		user1.setEmail("jay@gmail.com");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);

	}
}
