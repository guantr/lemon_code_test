package com.guan.day08.hashmap;

/**
 * @author xiyi
 * @date 2021/5/13 - 0:03
 */
public class StudentClass {
    private String className;
    public StudentClass() {
    }

    public StudentClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "className='" + className + '\'' +
                '}';
    }
}
