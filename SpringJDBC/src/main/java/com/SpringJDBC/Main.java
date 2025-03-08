package com.SpringJDBC;

import com.SpringJDBC.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("jdbcConfig.xml");
//      JdbcTemplate template=  context.getBean("JdbcTemplate1", JdbcTemplate.class);
      // sql query
//        String q="insert into Student(sName,sCity) values(?,?)";
//       int result= template.update(q,"Tina","Bombay");
//        System.out.println("Number of row inserted" + " "+  result);

       // _______________________________________________________________
       StudentDao dao= context.getBean("student1", StudentDao.class);
//          Student st=new Student();
//          st.setId(8);
//          st.setName("Sonia");
//          st.setCity("Kerela");
//        System.out.println( dao.insert(st));
//     Student st1=new Student();
//
//        st1.setName("Dhruv");
//        st1.setCity("USA");
//        st1.setId(4); //this is correct
//        System.out.println( dao.update(st1));

        System.out.println( dao.delete(5));
        System.out.println(dao.getStudent(3));
    }
}
