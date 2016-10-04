package part02;

import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemTest {
	public static void main(String[] args) {
		MemDAO dao = new MemDAO();

		dao.insertMethod(new MemDTO("박사랑", 30, "평야"));
		// dao.insertMethod(new MemDTO("유대리", 30));

		List<MemDTO> list = dao.allMethod();
		for (MemDTO dto : list) {
			System.out.printf("%d %s %d %s \n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}
	}
}
