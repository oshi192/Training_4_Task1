<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
        }
        .filter{
        max-width:100px;
        }
        table, th, td {
        border: 1px solid black;
        }
    </style>
</head>
<body>
<form method="post" action="">
    <h2>Credits</h2>
    <table>
        <tr>
          <td><input type="submit" value="go" name="buttonCredit"></td>
          <td></td>
          <td><input class="filter" type="number" name="filter_firstInstallmentC_start"><input class="filter" type="number" name="filter_firstInstallmentC_end"></td>
          <td><input class="filter" type="number" name="filter_insurancePrcntC_start"><input class="filter" type="number" name="filter_insurancePrcntC_end"></td>
          <td><input class="filter" type="number" name="filter_commission_start"><input class="filter" type="number" name="filter_commission_end"></td>
          <td></td>
          <td><input class="filter" type="number" name="filter_minMoneyQuantity_start"><input class="filter" type="number" name="filter_minMoneyQuantity_end"></td>
          <td><input class="filter" type="number" name="filter_maxMoneyQuantity_start"><input class="filter" type="number" name="filter_maxMoneyQuantity_end"></td>
          <td><input class="filter" type="number" name="filter_minMonth_start"><input class="filter" type="number" name="filter_minMonth_end"></td>
          <td><input class="filter" type="number" name="filter_maxMonth_start"><input class="filter" type="number" name="filter_maxMonth_end"></td>
        </tr>
        <tr>
          <td></td>
          <td><a href="?CsortBy=bankName">Bank</a></td>
          <td><a href="?CsortBy=firstInstallmentC">firstInstallment</a></td>
          <td><a href="?CsortBy=insurancePrcntC">insurancePrcnt</a></td>
          <td><a href="?CsortBy=commission">commission</a></td>
          <td>top Up Account Immediately</td>
          <td><a href="?CsortBy=minMoneyQuantity">minMoney</a></td>
          <td><a href="?CsortBy=maxMoneyQuantity">maxMoney</a></td>
          <td><a href="?CsortBy=minMonth">minMonth</a></td>
          <td><a href="?CsortBy=maxMonth">maxMonth</a></td>
        </tr>
        <c:forEach var="d" items="${requestScope.credits}">
            <tr>
                <td><input type="radio" name="creditAnswer" value="${d.id}"></td>
                <td><c:out value="${d.bankName}"/></td>
                <td><c:out value="${d.firstInstallmentC}"/></td>
                <td><c:out value="${d.insurancePrcntC}"/></td>
                <td><c:out value="${d.commission}"/></td>
                <td><c:out value="${d.topUpAccountImmediately}"/></td>
                <td><c:out value="${d.minMoneyQuantity}"/></td>
                <td><c:out value="${d.maxMoneyQuantity}"/></td>
                <td><c:out value="${d.minMonth}"/></td>
                <td><c:out value="${d.maxMonth}"/></td>
            </tr>
        </c:forEach>
    </table>
    <h2>Deposits</h2>
    <table>
        <tr>
          <td><input type="submit" value="go" name="buttonDeposit"></td>
          <td></td>
          <td><input class="filter" type="number" name="filter_prcntInOneMonthUAH_start"><input class="filter" type="number" name="filter_prcntInOneMonthUAH_end"></td>
          <td><input class="filter" type="number" name="filter_prcntInSixMonthUAH_start"><input class="filter" type="number" name="filter_prcntInSixMonthUAH_end"></td>
          <td><input class="filter" type="number" name="filter_prcntInTwelveMonthUAH_start"><input class="filter" type="number" name="filter_prcntInTwelveMonthUAH_end"></td>
          <td><input class="filter" type="number" name="filter_prcntInOneMonthUSD_start"><input class="filter" type="number" name="filter_prcntInOneMonthUSD_end"></td>
          <td><input class="filter" type="number" name="filter_prcntInSixMonthUSD_start"><input class="filter" type="number" name="filter_prcntInSixMonthUSD_end"></td>
          <td><input class="filter" type="number" name="filter_prcntInTwelveMonthUSD_start"><input class="filter" type="number" name="filter_prcntInTwelveMonthUSD_end"></td>
          <td></td>
          <td><input class="filter" type="number" name="filter_DminMoneyQuantity_start"><input class="filter" type="number" name="filter_DminMoneyQuantity_end"></td>
          <td><input class="filter" type="number" name="filter_DmaxMoneyQuantity_start"><input class="filter" type="number" name="filter_DmaxMoneyQuantity_end"></td>
        </tr>
        <tr>
          <td></td>
          <td><a href="?DsortBy=bankNameD">Bank</a></td>
          <td><a href="?DsortBy=prcntInOneMonthUAH">1m% UAH</a></td>
          <td><a href="?DsortBy=prcntInSixMonthUAH">6m% UAH</a></td>
          <td><a href="?DsortBy=prcntInTwelveMonthUAH">12m% UAH</a></td>
          <td><a href="?DsortBy=prcntInOneMonthUSD">1m% USD</a></td>
          <td><a href="?DsortBy=prcntInSixMonthUSD">6m% USD</a></td>
          <td><a href="?DsortBy=prcntInTwelveMonthUSD">12m% USD</a></td>
          <td>take Off Immediately</td>
          <td><a href="?DsortBy=DminMoneyQuantity">minMoney</a></td>
          <td><a href="?DsortBy=DmaxMoneyQuantity">maxMoney</a></td>
        </tr>
        <c:forEach var="d" items="${requestScope.deposits}">
            <tr>
                <td><input type="radio" name="depositAnswer" value="${d.id}"></td>
                <td><c:out value="${d.bankName}"/></td>
                <td><c:out value="${d.prcntInOneMonthUAH}"/></td>
                <td><c:out value="${d.prcntInSixMonthUAH}"/></td>
                <td><c:out value="${d.prcntInTwelveMonthUAH}"/></td>
                <td><c:out value="${d.prcntInOneMonthUSD}"/></td>
                <td><c:out value="${d.prcntInSixMonthUSD}"/></td>
                <td><c:out value="${d.prcntInTwelveMonthUSD}"/></td>
                <td><c:out value="${d.takeOffImmediately}"/></td>
                <td><c:out value="${d.minMoneyQuantity}"/></td>
                <td><c:out value="${d.maxMoneyQuantity}"/></td>
            </tr>
        </c:forEach>
    </table>
        <input type="submit" value="Sent" name="choose" method="post"><br>
    </form>
</body>
</html>