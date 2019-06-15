package javabasic.reflect;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader cl = Robot.class.getClassLoader();
//        Class r = Class.forName("javabasic.reflect.Robot");
        Class.forName("com.mysql.jdbc.Driver");
    }
}
