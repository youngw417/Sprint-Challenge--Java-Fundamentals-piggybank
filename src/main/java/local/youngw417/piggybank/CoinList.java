package local.youngw417.piggybank;

import java.util.ArrayList;
import java.util.List;

public class CoinList {

    public List<Coin> myCoin = new ArrayList<>();

    public CoinList(){
        myCoin.add( new Coin("Quarter", "Quarters", 0.25, 1));
        myCoin.add(new Coin("Dime", "Dimes", 0.10, 1));
        myCoin.add(new Coin("Dollar", "Dollars", 1.00, 5));
        myCoin.add(new Coin("Nickel", "Nickels", 0.05, 3));
        myCoin.add(new Coin("Dime", "Dimes", 0.10, 7));
        myCoin.add(new Coin("Dollar", "Dollars", 1.00, 1));
        myCoin.add(new Coin("Penny", "Pennies", 0.01, 10));
    }



    public String coinReport(){
        String container = "";
        double total = 0;
        for (Coin e: myCoin) {
            if (e.getQuantity() > 1) {
                container += "\n" + e.getQuantity() + " " + e.getNameplural();
            } else if (e.getQuantity() == 1){
                container += "\n" + e.getQuantity() + " " + e.getName();
            }
            total += e.getQuantity() * e.getValue();
        }
        container += "\nThe piggy bank holds " + total;

        return container;
    }
}
