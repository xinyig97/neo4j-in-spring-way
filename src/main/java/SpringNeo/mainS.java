package SpringNeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class mainS {
    public static void main(String[] args){
        SpringApplication.run(mainS.class,args);
    }
}
