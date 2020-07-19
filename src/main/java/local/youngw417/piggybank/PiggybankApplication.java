package local.youngw417.piggybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiggybankApplication {

    public static CoinList myCoinList;

    public static void main(String[] args) {
        myCoinList = new CoinList();
        SpringApplication.run(PiggybankApplication.class, args);
    }

}
