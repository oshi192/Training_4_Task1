package web;

import jdbc.CreditDAO;
import jdbc.DepositDAO;
import model.Credit;
import model.Deposit;
import service.Sorter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Вклады. Сформировать набор предложений клиенту по вкладам
 * различных банков для оптимального выбора. Учитывать возможность
 * досрочного снятия кредита и\или пополнения. Реализовать поиск и
 * сортировку вкладов.
 */
public class Main extends HttpServlet {
    private final static String index = "/WEB-INF/main.jsp";
    CreditDAO creditDAO;
    DepositDAO depositDAO;
    private List<Deposit> deposits;
    private List<Credit> credits;

    @Override
    public void init() throws ServletException {
        creditDAO = new CreditDAO();
        depositDAO = new DepositDAO();
        try {
            credits = creditDAO.getAll();
            deposits = depositDAO.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("CsortBy") != null) {
            credits = (List<Credit>) credits.stream()
                    .sorted(Sorter.map.get(request.getParameter("CsortBy")))
                    .collect(Collectors.toList());
        }
        if (request.getParameter("DsortBy") != null) {
            deposits = (List<Deposit>) deposits.stream()
                    .sorted(Sorter.map.get(request.getParameter("DsortBy")))
                    .collect(Collectors.toList());
        }
        request.setAttribute("deposits", deposits);
        request.setAttribute("credits", credits);
        request.getRequestDispatcher(index)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("creditAnswer") != null) {
            System.out.println("credit id : " + req.getParameter("creditAnswer"));
        }
        if (req.getParameter("depositAnswer") != null) {
            System.out.println("deposit id : " + req.getParameter("depositAnswer"));
        }
        doGet(req, resp);
    }
}
