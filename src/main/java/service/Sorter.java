package service;

import model.Credit;
import model.Deposit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Class contains only 1 field :  map with comparators to credit and deposits class
 * @see model.Credit
 * @see model.Deposit
 */

public final class Sorter {
    public static Map<String, Comparator> mapSort = new HashMap<>();

    static {
        mapSort.put("bankName", Comparator.comparing(Credit::getBankName));
        mapSort.put("firstInstallmentC", Comparator.comparing(Credit::getFirstInstallmentC));
        mapSort.put("insurancePrcntC", Comparator.comparing(Credit::getInsurancePrcntC));
        mapSort.put("commission", Comparator.comparing(Credit::getCommission));
        mapSort.put("minMoneyQuantity", Comparator.comparing(Credit::getMinMoneyQuantity));
        mapSort.put("maxMoneyQuantity", Comparator.comparing(Credit::getMaxMoneyQuantity));
        mapSort.put("minMonth", Comparator.comparing(Credit::getMinMonth));
        mapSort.put("maxMonth", Comparator.comparing(Credit::getMaxMonth));
        mapSort.put("bankNameD", Comparator.comparing(Deposit::getBankName));
        mapSort.put("prcntInOneMonthUAH", Comparator.comparing(Deposit::getPrcntInOneMonthUAH));
        mapSort.put("prcntInSixMonthUAH", Comparator.comparing(Deposit::getPrcntInSixMonthUAH));
        mapSort.put("prcntInTwelveMonthUAH", Comparator.comparing(Deposit::getPrcntInTwelveMonthUAH));
        mapSort.put("prcntInOneMonthUSD", Comparator.comparing(Deposit::getPrcntInOneMonthUSD));
        mapSort.put("prcntInSixMonthUSD", Comparator.comparing(Deposit::getPrcntInSixMonthUSD));
        mapSort.put("prcntInTwelveMonthUSD", Comparator.comparing(Deposit::getPrcntInTwelveMonthUSD));
        mapSort.put("DminMoneyQuantity", Comparator.comparing(Deposit::getMinMoneyQuantity));
        mapSort.put("DmaxMoneyQuantity", Comparator.comparing(Deposit::getMaxMoneyQuantity));
    }

    private Sorter() {
    }
}
