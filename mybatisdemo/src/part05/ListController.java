package part05;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testList")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ListDAO dao = new ListDAO();

		List<EmpDTO> list = dao.listMethod();

		req.setAttribute("aList", list);

		
		RequestDispatcher dis = req.getRequestDispatcher("/view/test.jsp");
		dis.forward(req, resp);

	}
}
