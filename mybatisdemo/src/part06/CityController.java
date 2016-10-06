package part06;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cityList")
public class CityController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ListDAO dao = new ListDAO();
//
		req.setAttribute("aList", dao.listMethod());

		RequestDispatcher dis = req.getRequestDispatcher("/view/city.jsp");
		dis.forward(req, resp);

	}
}
