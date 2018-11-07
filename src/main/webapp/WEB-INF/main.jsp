<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
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
          <td></td>
          <td><a href="?CsortBy=bankName">Bank</a></td>
          <td><a href="?CsortBy=firstInstallmentC">firstInstallmentC</a></td>
          <td><a href="?CsortBy=insurancePrcntC">insurancePrcntC</a></td>
          <td><a href="?CsortBy=commission">commission</a></td>
          <td>topUpAccountImmediately</td>
          <td><a href="?CsortBy=minMoneyQuantity">minMoneyQuantity%</a></td>
          <td><a href="?CsortBy=maxMoneyQuantity">maxMoneyQuantity</a></td>
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
          <td></td>
          <td><a href="?DsortBy=bankNameD">Bank</a></td>
          <td><a href="?DsortBy=prcntInOneMonthUAH">1m% UAH</a></td>
          <td><a href="?DsortBy=prcntInSixMonthUAH">6m% UAH</a></td>
          <td><a href="?DsortBy=prcntInTwelveMonthUAH">12m% UAH</a></td>
          <td><a href="?DsortBy=prcntInOneMonthUSD">1m% USD</a></td>
          <td><a href="?DsortBy=prcntInSixMonthUSD">6m% USD</a></td>
          <td><a href="?DsortBy=prcntInTwelveMonthUSD">12m% USD</a></td>
          <td>takeOffImmediately</td>
          <td><a href="?DsortBy=DminMoneyQuantity">minMoneyQuantity</a></td>
          <td><a href="?DsortBy=DmaxMoneyQuantity">maxMoneyQuantity</a></td>
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
        <input type="submit" value="Ok" name="post"><br>
    </form>
</body>
</html>