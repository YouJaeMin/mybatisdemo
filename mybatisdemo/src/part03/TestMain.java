package part03;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import part03.dao.EmpDeptDAO;
import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class TestMain {
	public static void main(String[] args) {

		EmpDeptDAO dao = new EmpDeptDAO();

		// List<EmpDTO> aList = dao.allMethod();
		// for (EmpDTO dto : aList) {
		// System.out.printf("%s %s %s %s\n", dto.getEmployee_id(),
		// dto.getFirst_name(), dto.getJob_id(),
		// dto.getDepartment_id());
		// }

		// List<EmpDTO> aList = dao.emp_deptMethod();
		// for (EmpDTO dto : aList) {
		// System.out.printf("%s %s %s %s %s\n", dto.getEmployee_id(),
		// dto.getFirst_name(), dto.getJob_id(),
		// dto.getDepartment_id(), dto.getDept().getDepartment_name());
		// }

		List<DeptDTO> aList = dao.dept_empMethod();
		for (DeptDTO dto : aList) {
			for (EmpDTO edto : dto.getEmp()) {
				System.out.printf("%s %s %s %s\n", dto.getDepartment_id(), dto.getDepartment_name(), edto.getEmployee_id(), edto.getFirst_name());
			}
		}

	}
}
