package part04;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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

	public List<MemDTO> listMethod() {
		return session.selectList("member.all");
	}

	public void deleteMethod(int num[]) {
		session.delete("member.multiDel", num);
	}

}
