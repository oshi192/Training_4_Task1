package web;

import jdbc.CreditDAO;
import jdbc.DepositDAO;
import model.Credit;
import model.Deposit;
import org.apache.log4j.Logger;
import service.Sorter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class MainServlet extends HttpServlet {
    private final static String index = "/WEB-INF/main.jsp";
    private static Logger logger = Logger.getLogger(MainServlet.class);
    private CreditDAO creditDAO;
    private DepositDAO depositDAO;
    private List<Deposit> deposits;
    private List<Deposit> depositsTmp;
    private List<Credit> credits;
    private List<Credit> creditsTmp;

    @Override
    public void init() {
        creditDAO = new CreditDAO();
        depositDAO = new DepositDAO();
        try {
            credits = creditDAO.getAll();
            deposits = depositDAO.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("cannot find credits or deposits!");
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        canSort(request);
        request.setAttribute("deposits", depositsTmp);
        request.setAttribute("credits", creditsTmp);
        request.getRequestDispatcher(index).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("creditAnswer") != null) {
            logger.info("from get >> credit id : " + req.getParameter("creditAnswer"));
        }
        if (req.getParameter("depositAnswer") != null) {
            logger.info("from get >> deposit id : " + req.getParameter("depositAnswer"));
        }
        if(req.getParameter("buttonCredit")!=null){
            //todo filter credit
        }
        if(req.getParameter("buttonDeposit")!=null){
            //todo filterdeposit
        }
        doGet(req, resp);
    }

    private void canSort(HttpServletRequest request){
        if (request.getParameter("CsortBy") != null) {
            creditsTmp = (List<Credit>) credits.stream()
                    .sorted(Sorter.map.get(request.getParameter("CsortBy")))
                    .collect(Collectors.toList());
            logger.info("sorting credits by " + request.getParameter("CsortBy"));
        }
        if (request.getParameter("DsortBy") != null) {
            depositsTmp = (List<Deposit>) deposits.stream()
                    .sorted(Sorter.map.get(request.getParameter("DsortBy")))
                    .collect(Collectors.toList());
            logger.info("sorting deposits by " + request.getParameter("DsortBy"));

        }
    }
}
