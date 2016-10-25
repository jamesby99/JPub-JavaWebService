package info.thecodinglive;

import info.thecodinglive.model.UserEntity;
import info.thecodinglive.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JPAMain {
        public static void main(String[] args) {
                ConfigurableApplicationContext context = SpringApplication.run(JPAMain.class, args);
                UserRepository userRepository = context.getBean(UserRepository.class);

                userRepository.save(new UserEntity("홍길동"));
                userRepository.save(new UserEntity("강감찬"));
                userRepository.save(new UserEntity("척준경"));

        }
}