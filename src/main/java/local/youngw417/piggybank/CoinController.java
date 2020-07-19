package local.youngw417.piggybank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/total")
public class CoinController {

    @GetMapping(value="", produces="application/json")
    public ResponseEntity<?> getCoinReport(){
        String myReport = PiggybankApplication.myCoinList.coinReport();
        System.out.println(myReport);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
