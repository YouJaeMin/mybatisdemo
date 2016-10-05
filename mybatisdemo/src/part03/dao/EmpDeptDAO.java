package part03.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part03.dto.EmpDTO;

public class EmpDeptDAO {
	SqlSession session;

	public EmpDeptDAO() {
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

	public List<EmpDTO> allMethod() {
		return session.selectList("empdept.all");
	}

}
