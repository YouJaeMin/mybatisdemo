package part02;

import java.util.ArrayList;
import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemTest {
	public static void main(String[] args) {
		MemDAO dao = new MemDAO();

		// dao.insertMethod(new MemDTO("박사랑", 30, "평야"));
		// dao.insertMethod(new MemDTO("유대리", 30));

		// HashMap<String, Object> map = new HashMap<String, Object>();
		// map.put("num", 10);
		// map.put("loc", "제주");
		// dao.updateMethod(map);

		// dao.deleteMethod(10);

		// List<MemDTO> alist = new ArrayList<MemDTO>();
		// alist.add(new MemDTO(dao.keyMethod(), "java", 20, "toronto"));
		// alist.add(new MemDTO(dao.keyMethod(), "jsp", 15, "summary"));
		// dao.multiInsertMethod(alist);

		// List<Integer> alist = new ArrayList<Integer>();
		// alist.add(6);
		// alist.add(7);
		// System.out.println("삭제 : " + dao.multiDeleteMethod(alist));

		// Integer array[] = new Integer[2];
		// array[0] = 12;
		// array[1] = 11;
		// System.out.println("삭제 : " + dao.multiDeleteMethod2(array));

		MemDTO mt = new MemDTO();
		// mt.setAge(2);
		// if
		// List<MemDTO> list = dao.searchMethod(mt);

		mt.setName("홍기기기");
		mt.setAge(28);
		 mt.setLoc("서울");
		// 멀티업데이트
		// dao.multiUptMethod(mt);

		// choose 동적 sql
		dao.locInsMethod(mt);

		List<MemDTO> list = dao.allMethod();
		for (MemDTO dto : list) {
			System.out.printf("%d %s %d %s \n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}
	}
}
