package CashMashine;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulator {

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private String currencyCode;

   private static Map<String,CurrencyManipulator> currencyManipulatorMap= new HashMap<>();

    public String getCurrencyCode() {
        return currencyCode;
    }
}
