package com.labtest14.Labtest14.daoimpl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.labtest14.Labtest14.dao.Studentdao;
import com.labtest14.Labtest14.entities.Student;
import com.labtest14.Labtest14.hiberutil.HiberUtil;

public class Studentdaoimpl implements Studentdao {
	
	Session session=HiberUtil.getSession();
	@Override
	public int createStudent(Student st) throws SQLException {
		Transaction tr=session.beginTransaction();
        session.save(st);
        tr.commit();
        session.close();
        return 1;
	}

	@Override
	public Student getStudent(int sid) throws SQLException {
		return session.get(Student.class, sid);
	
	}

	@Override
	public boolean deleteStudent(int sid) throws SQLException {
		Transaction tr=session.beginTransaction();
		Student st=session.get(Student.class, sid);
		st.setSid(sid);
        session.delete(st);
        tr.commit();
        session.close();
		return true; 
	}

	@Override
	public boolean updateStudent(int sid,String sname) throws SQLException {
		Transaction tr=session.beginTransaction();
        Student st=session.get(Student.class, sid);
        st.setSname(sname);
        session.update(st);
        tr.commit();
        session.close();
		return true;
	}

}
