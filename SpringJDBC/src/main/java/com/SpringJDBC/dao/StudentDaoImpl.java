package com.SpringJDBC.dao;

import com.SpringJDBC.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl() {
        super();
    }

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        //insert query
        String q="insert into Student(sId,sName,sCity) values(?,?,?)";
      int result=  this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
       return result;
    }

    @Override
    public int update(Student student) {
        //update query
        String q="update Student set sName=? , sCity=? where sId=?";
        int result=jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        //delete query
        String q="delete from student where sId=?";
        int result=this.jdbcTemplate.update(q,studentId);
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        //select query
        String q="select * from student where sId=?";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        Student student=this.jdbcTemplate.queryForObject(q,rowMapper,studentId);
        return student;
    }

}
