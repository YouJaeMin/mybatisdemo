package part04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myList")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		MemDAO dao = new MemDAO();

		if (req.getParameterValues("chk") != null) {
			String chk[] = req.getParameterValues("chk");
			int num[] = new int[chk.length];
			for (int i = 0; i < chk.length; i++) {
				num[i] = Integer.parseInt(chk[i]);
			}
			dao.deleteMethod(num);
			resp.sendRedirect("myList");
		} else {
			req.setAttribute("aList", dao.listMethod());
			RequestDispatcher dis = req.getRequestDispatcher("/view/list.jsp");
			dis.forward(req, resp);
		}

	}

}
