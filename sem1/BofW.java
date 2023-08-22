package sem1;

import java.math.BigDecimal;

/**
 * Класс бутилированных напитков
 */
public class BofW extends Drinks {
    /**
     * Перегруженный конструктор класса Бутилированных напитков
     *
     * @param name   Наименование напитка
     * @param price  Стоимость напитка
     * @param volume Объем напитка
     */
    public BofW(String name, BigDecimal price, Double volume) {
        super(name, price, volume);
    }
}
