package CashMashine;

import java.util.HashMap;
import java.util.Map;

public final class CurrencyManipulatorFactory {

  Map<CurrencyManipulator,Integer> manipulators = new HashMap<>();

//  Подумай, где лучше хранить все манипуляторы?  Маленькая подсказка, поле должно называться map.



    private CurrencyManipulatorFactory() {
    }

    static void getManipulatorByCurrencyCode(String currencyCode) {
    }


}
