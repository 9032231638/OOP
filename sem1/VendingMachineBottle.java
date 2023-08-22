package sem1;

import java.util.ArrayList;
import java.util.List;


public class VendingMachineBottle implements VendingMachine {
    List<BofW> bottleOfWaterList = new ArrayList<>();

    
    public void initProduct() {
    }

   
    public void initProduct(List<BofW> bottle) {
        this.bottleOfWaterList = bottle;
    }

    
    public String getProduct() {
        return null;
    }

    
    public String getProduct(String name) {
        for (BofW el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}