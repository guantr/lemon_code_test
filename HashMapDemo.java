package com.guan.day08.hashmap;

import java.util.*;

/**
 * @author xiyi
 * @date 2021/5/12 - 23:40
 */
public class HashMapDemo {
    public static void main(String[] args) {
 /*
1.有两个班级，一个是1801班，一个是1802班，1801班有三个学生studentA，studentB，studentC，
1802班有两个学生studentD，studentE。
studentA：name-张三，age-25，gender-男
studentB：name-李四，age-26，gender-男
studentC：name-小花，age-27，gender-女
studentD：name-小明，age-28，gender-男
studentE：name-小红，age-29，gender-女
请用map保存好两个班级的学生数据，每个班级底下保存对应的学生信息，
请思考map集合的键和值应该用什么类型
2.通过两种循环遍历map集合取出每个班级底下的学员数据，并输出。
*/
        Student stA = new Student("张三",25,"男");
        Student stB = new Student("李四",26,"男");
        Student stC = new Student("小花",27,"女");
        Student stD = new Student("小明",28,"男");
        Student stE = new Student("小红",29,"女");
        StudentClass class1 = new StudentClass("1801班");
        StudentClass class2 = new StudentClass("1802班");

//用map保存好两个班级的学生数据，每个班级底下保存对应的学生信息
        Student[] stuClass1 = {stA, stB, stC};
        Student[] stuClass2 = {stD,stE};
        HashMap<StudentClass,Student[]> hashMap = new HashMap<>();
        hashMap.put(class1,stuClass1);
        hashMap.put(class2,stuClass2);
//2.通过两种循环遍历map集合取出每个班级底下的学员数据，并输出。
        //增强for遍历
        Set<StudentClass> keys = hashMap.keySet();
        for (StudentClass key:keys){
            List<Student> value = Arrays.asList(hashMap.get(key));
            System.out.println(key + ":" + value);
        }
        //entrySet遍历  获取所有的键值对，自带getValue 和 getKey
        Set<Map.Entry<StudentClass,Student[]>> entrySet = hashMap.entrySet();
        for (Map.Entry<StudentClass,Student[]> entry:entrySet){
            System.out.println(entry.getKey() + ":" + Arrays.toString(entry.getValue()));
        }
    }
}
