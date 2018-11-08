package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
/**
 * entity for Deposit
 * have only getters and setters, allArgsConstructor, noArgsConstructor, equals,hashcode,to string methods
 */
public class Deposit {
    private long id;

    private String bankName;
    private long prcntInOneMonthUAH;
    private long prcntInSixMonthUAH;
    private long prcntInTwelveMonthUAH;
    private long prcntInOneMonthUSD;
    private long prcntInSixMonthUSD;
    private long prcntInTwelveMonthUSD;
    private boolean takeOffImmediately;
    private long minMoneyQuantity;
    private long maxMoneyQuantity;

    public Deposit() {
    }

    public Deposit(String bankName, long prcntInOneMonthUAH,
                   long prcntInSixMonthUAH, long prcntInTwelveMonthUAH, long prcntInOneMonthUSD,
                   long prcntInSixMonthUSD, long prcntInTwelveMonthUSD, boolean takeOffImmediately,
                   long minMoneyQuantity, long maxMoneyQuantity) {
        this.bankName = bankName;
        this.prcntInOneMonthUAH = prcntInOneMonthUAH;
        this.prcntInSixMonthUAH = prcntInSixMonthUAH;
        this.prcntInTwelveMonthUAH = prcntInTwelveMonthUAH;
        this.prcntInOneMonthUSD = prcntInOneMonthUSD;
        this.prcntInSixMonthUSD = prcntInSixMonthUSD;
        this.prcntInTwelveMonthUSD = prcntInTwelveMonthUSD;
        this.takeOffImmediately = takeOffImmediately;
        this.minMoneyQuantity = minMoneyQuantity;
        this.maxMoneyQuantity = maxMoneyQuantity;
    }

    public Deposit(ResultSet resultSet) throws SQLException {
        this.id=resultSet.getInt(1);
        this.bankName = resultSet.getString(2);
        this.prcntInOneMonthUAH = resultSet.getInt(3);
        this.prcntInSixMonthUAH = resultSet.getInt(4);
        this.prcntInTwelveMonthUAH = resultSet.getInt(5);
        this.prcntInOneMonthUSD = resultSet.getInt(6);
        this.prcntInSixMonthUSD = resultSet.getInt(7);
        this.prcntInTwelveMonthUSD = resultSet.getInt(8);
        this.takeOffImmediately = resultSet.getBoolean(9);
        this.minMoneyQuantity = resultSet.getInt(10);
        this.maxMoneyQuantity = resultSet.getInt(11);
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

    public long getPrcntInOneMonthUAH() {
        return prcntInOneMonthUAH;
    }

    public void setPrcntInOneMonthUAH(long prcntInOneMonthUAH) {
        this.prcntInOneMonthUAH = prcntInOneMonthUAH;
    }

    public long getPrcntInSixMonthUAH() {
        return prcntInSixMonthUAH;
    }

    public void setPrcntInSixMonthUAH(long prcntInSixMonthUAH) {
        this.prcntInSixMonthUAH = prcntInSixMonthUAH;
    }

    public long getPrcntInTwelveMonthUAH() {
        return prcntInTwelveMonthUAH;
    }

    public void setPrcntInTwelveMonthUAH(long prcntInTwelveMonthUAH) {
        this.prcntInTwelveMonthUAH = prcntInTwelveMonthUAH;
    }

    public long getPrcntInOneMonthUSD() {
        return prcntInOneMonthUSD;
    }

    public void setPrcntInOneMonthUSD(long prcntInOneMonthUSD) {
        this.prcntInOneMonthUSD = prcntInOneMonthUSD;
    }

    public long getPrcntInSixMonthUSD() {
        return prcntInSixMonthUSD;
    }

    public void setPrcntInSixMonthUSD(long prcntInSixMonthUSD) {
        this.prcntInSixMonthUSD = prcntInSixMonthUSD;
    }

    public long getPrcntInTwelveMonthUSD() {
        return prcntInTwelveMonthUSD;
    }

    public void setPrcntInTwelveMonthUSD(long prcntInTwelveMonthUSD) {
        this.prcntInTwelveMonthUSD = prcntInTwelveMonthUSD;
    }

    public boolean isTakeOffImmediately() {
        return takeOffImmediately;
    }

    public void setTakeOffImmediately(boolean takeOffImmediately) {
        this.takeOffImmediately = takeOffImmediately;
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

    @Override
    public String toString() {
        return "\nDeposit{" +
                "bankName=" + bankName +
                ", prcntInOneMonthUAH=" + prcntInOneMonthUAH +
                ", prcntInSixMonthUAH=" + prcntInSixMonthUAH +
                ", prcntInTwelveMonthUAH=" + prcntInTwelveMonthUAH +
                ", prcntInOneMonthUSD=" + prcntInOneMonthUSD +
                ", prcntInSixMonthUSD=" + prcntInSixMonthUSD +
                ", prcntInTwelveMonthUSD=" + prcntInTwelveMonthUSD +
                ", takeOffImmediately=" + takeOffImmediately +
                ", minMoneyQuantity=" + minMoneyQuantity +
                ", maxMoneyQuantity=" + maxMoneyQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit)) return false;
        Deposit deposit = (Deposit) o;
        return prcntInOneMonthUAH == deposit.prcntInOneMonthUAH &&
                prcntInSixMonthUAH == deposit.prcntInSixMonthUAH &&
                prcntInTwelveMonthUAH == deposit.prcntInTwelveMonthUAH &&
                prcntInOneMonthUSD == deposit.prcntInOneMonthUSD &&
                prcntInSixMonthUSD == deposit.prcntInSixMonthUSD &&
                prcntInTwelveMonthUSD == deposit.prcntInTwelveMonthUSD &&
                takeOffImmediately == deposit.takeOffImmediately &&
                minMoneyQuantity == deposit.minMoneyQuantity &&
                maxMoneyQuantity == deposit.maxMoneyQuantity &&
                bankName == deposit.bankName;
    }

    @Override
    public int hashCode() {

        return Objects.hash(bankName, prcntInOneMonthUAH, prcntInSixMonthUAH, prcntInTwelveMonthUAH, prcntInOneMonthUSD, prcntInSixMonthUSD, prcntInTwelveMonthUSD, takeOffImmediately, minMoneyQuantity, maxMoneyQuantity);
    }
}
