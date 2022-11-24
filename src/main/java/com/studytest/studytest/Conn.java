package com.studytest.studytest;

import java.sql.*;

public class Conn {
    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection("jdbc:mysql://10.1.1.153:3306/honglbtest","qjdadmin","QjdChina1");
            System.out.println("数据库连接成功");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        Conn c = new Conn();
        connection = c.getConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from honglbtest.students");
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String stu_no = resultSet.getString("stu_no");
                String stu_name = resultSet.getString("stu_name");
                String stu_class = resultSet.getString("stu_class");
                String stu_sex = resultSet.getString("stu_sex");
                String stu_point = resultSet.getString("stu_point");
                System.out.println("编号：" + id);
                System.out.println("学号：" + stu_no);
                System.out.println("姓名：" + stu_name);
                System.out.println("班级：" + stu_class);
                System.out.println("性别：" + stu_sex);
                System.out.println("分数：" + stu_point);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
