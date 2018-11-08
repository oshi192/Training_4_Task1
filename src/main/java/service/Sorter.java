package service;

import model.Credit;
import model.Deposit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Sorter {
    public static Map<String,Comparator> map= new HashMap<>();
    static {
        map.put("bankName",Comparator.comparing(Credit::getBankName));
        map.put("firstInstallmentC",Comparator.comparing(Credit::getFirstInstallmentC));
        map.put("insurancePrcntC",Comparator.comparing(Credit::getInsurancePrcntC));
        map.put("commission",Comparator.comparing(Credit::getCommission));
        map.put("minMoneyQuantity",Comparator.comparing(Credit::getMinMoneyQuantity));
        map.put("maxMoneyQuantity",Comparator.comparing(Credit::getMaxMoneyQuantity));
        map.put("minMonth",Comparator.comparing(Credit::getMinMonth));
        map.put("maxMonth",Comparator.comparing(Credit::getMaxMonth));
        map.put("bankNameD",Comparator.comparing(Deposit::getBankName));
        map.put("prcntInOneMonthUAH",Comparator.comparing(Deposit::getPrcntInOneMonthUAH));
        map.put("prcntInSixMonthUAH",Comparator.comparing(Deposit::getPrcntInSixMonthUAH));
        map.put("prcntInTwelveMonthUAH",Comparator.comparing(Deposit::getPrcntInTwelveMonthUAH));
        map.put("prcntInOneMonthUSD",Comparator.comparing(Deposit::getPrcntInOneMonthUSD));
        map.put("prcntInSixMonthUSD",Comparator.comparing(Deposit::getPrcntInSixMonthUSD));
        map.put("prcntInTwelveMonthUSD",Comparator.comparing(Deposit::getPrcntInTwelveMonthUSD));
        map.put("DminMoneyQuantity",Comparator.comparing(Deposit::getMinMoneyQuantity));
        map.put("DmaxMoneyQuantity",Comparator.comparing(Deposit::getMaxMoneyQuantity));
    }
    private Sorter(){}
}
