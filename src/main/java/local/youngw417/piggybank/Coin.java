package local.youngw417.piggybank;

import java.util.concurrent.atomic.AtomicLong;

public class Coin {
    private static final AtomicLong counter = new AtomicLong();
//    coinid, name, nameplural, value, quantity
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coin(String name, String nameplural, double value, int quantity) {
        this.coinid = counter.incrementAndGet();
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getCoidid() {
        return coinid;
    }

    public String getName() {
        return name;
    }

    public String getNameplural() {
        return nameplural;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coidid=" + coinid +
                ", name='" + name + '\'' +
                ", nameplural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
