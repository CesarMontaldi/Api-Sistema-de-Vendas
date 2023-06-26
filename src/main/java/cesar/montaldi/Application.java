package cesar.montaldi;

import cesar.montaldi.domain.entity.Cliente;
import cesar.montaldi.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application  extends SpringBootServletInitializer {//Caso queira gerar um arquivo .war extender essa classe.

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
