package part03;

import java.util.List;

import part03.dao.EmpDeptDAO;
import part03.dto.EmpDTO;

public class TestMain {
	public static void main(String[] args) {

		EmpDeptDAO dao = new EmpDeptDAO();

		List<EmpDTO> aList = dao.allMethod();
		for (EmpDTO dto : aList) {
			System.out.printf("%s %s %s %s\n", dto.getEmployee_id(), dto.getFirst_name(), dto.getJob_id(),
					dto.getDepartment_id());
		}

	}
}
