package sem1;

import java.math.BigDecimal;


public class Drinks extends Product {
    private Double volume;

    
    public Drinks(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    
    public Double getVolume() {
        return volume;
    }


    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

    
    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}