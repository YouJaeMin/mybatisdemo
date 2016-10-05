package part02.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part02.dto.MemDTO;

public class MemDAO {
	SqlSession session;

	public MemDAO() {
		String resource = "config/configuration.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactoryBuilder build = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = build.build(reader);
			session = factory.openSession(true);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<MemDTO> allMethod() {
		return session.selectList("mem.all");

	}

	public void insertMethod(MemDTO dto) {
		session.insert("mem.ins", dto);
	}

	public void updateMethod(HashMap<String, Object> map) {
		session.update("mem.upt", map);
	}

	public void deleteMethod(int num) {
		session.delete("mem.del", num);
	}

	public int keyMethod() {
		return session.selectOne("mem.keyNum");
	}

	public void multiInsertMethod(List<MemDTO> list) {
		session.insert("mem.multIns", list);
	}

	public int multiDeleteMethod(List<Integer> list) {
		return session.delete("mem.multiDel", list);
	}

	public int multiDeleteMethod2(Integer list[]) {
		return session.delete("mem.multiDel2", list);
	}

	public List<MemDTO> searchMethod(MemDTO mt){
		return session.selectList("mem.search", mt);
	}
	
	public void multiUptMethod(MemDTO dto){
		session.update("mem.multiUpt", dto);
	}
	
	public void locInsMethod(MemDTO dto){
		session.insert("mem.insData", dto);
	}
}
