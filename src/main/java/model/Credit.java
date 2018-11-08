package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * entity for Credit
 * have only getters and setters, allArgsConstructor, noArgsConstructor, to string methods
 */
public class Credit {
    private long id;

    private String bankName;
    private long firstInstallmentC;
    private int insurancePrcntC;
    private long commission;
    private int prcntInMounth;
    private boolean topUpAccountImmediately;
    private long minMoneyQuantity;
    private long maxMoneyQuantity;
    private long minMonth;
    private long maxMonth;

    public Credit() {
    }

    public Credit(String bankName, long firstInstallmentC, int insurancePrcntC,
                  long commission, int prcntInMounth, boolean topUpAccountImmediately, long minMoneyQuantity,
                  long maxMoneyQuantity, long minMonth, long maxMonth) {
        this.bankName = bankName;
        this.firstInstallmentC = firstInstallmentC;
        this.insurancePrcntC = insurancePrcntC;
        this.commission = commission;
        this.prcntInMounth = prcntInMounth;
        this.topUpAccountImmediately = topUpAccountImmediately;
        this.minMoneyQuantity = minMoneyQuantity;
        this.maxMoneyQuantity = maxMoneyQuantity;
        this.minMonth = minMonth;
        this.maxMonth = maxMonth;
    }

    public Credit(ResultSet resultSet) throws SQLException {
        this.id=resultSet.getInt(1);
        this.bankName = resultSet.getString(2);
        this.firstInstallmentC = resultSet.getInt(3);
        this.insurancePrcntC = resultSet.getInt(4);
        this.commission = resultSet.getInt(5);
        this.prcntInMounth = resultSet.getInt(6);
        this.topUpAccountImmediately = resultSet.getBoolean(7);
        this.minMoneyQuantity = resultSet.getInt(8);
        this.maxMoneyQuantity = resultSet.getInt(9);
        this.minMonth = resultSet.getInt(10);
        this.maxMonth = resultSet.getInt(11);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getFirstInstallmentC() {
        return firstInstallmentC;
    }

    public void setFirstInstallmentC(long firstInstallmentC) {
        this.firstInstallmentC = firstInstallmentC;
    }

    public int getInsurancePrcntC() {
        return insurancePrcntC;
    }

    public void setInsurancePrcntC(int insurancePrcntC) {
        this.insurancePrcntC = insurancePrcntC;
    }

    public long getCommission() {
        return commission;
    }

    public void setCommission(long commission) {
        this.commission = commission;
    }

    public int getPrcntInMounth() {
        return prcntInMounth;
    }

    public void setPrcntInMounth(int prcntInMounth) {
        this.prcntInMounth = prcntInMounth;
    }

    public boolean isTopUpAccountImmediately() {
        return topUpAccountImmediately;
    }

    public void setTopUpAccountImmediately(boolean topUpAccountImmediately) {
        this.topUpAccountImmediately = topUpAccountImmediately;
    }

    public long getMinMoneyQuantity() {
        return minMoneyQuantity;
    }

    public void setMinMoneyQuantity(long minMoneyQuantity) {
        this.minMoneyQuantity = minMoneyQuantity;
    }

    public long getMaxMoneyQuantity() {
        return maxMoneyQuantity;
    }

    public void setMaxMoneyQuantity(long maxMoneyQuantity) {
        this.maxMoneyQuantity = maxMoneyQuantity;
    }

    public long getMinMonth() {
        return minMonth;
    }

    public void setMinMonth(long minMonth) {
        this.minMonth = minMonth;
    }

    public long getMaxMonth() {
        return maxMonth;
    }

    public void setMaxMonth(long maxMonth) {
        this.maxMonth = maxMonth;
    }

    @Override
    public String toString() {
        return "\nCredit{" +
                "bankName=" + bankName +
                ", firstInstallmentC=" + firstInstallmentC +
                ", insurancePrcntC=" + insurancePrcntC +
                ", commission=" + commission +
                ", prcntInMounth=" + prcntInMounth +
                ", topUpAccountImmediately=" + topUpAccountImmediately +
                ", minMoneyQuantity=" + minMoneyQuantity +
                ", maxMoneyQuantity=" + maxMoneyQuantity +
                ", minMonth=" + minMonth +
                ", maxMonth=" + maxMonth +
                '}';
    }
}
