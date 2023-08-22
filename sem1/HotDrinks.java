package sem1;

import java.math.BigDecimal;


public class HotDrinks extends Drinks {
    private int temp;
    
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    
    public int getTemp() {
        return temp;
    }

    
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}