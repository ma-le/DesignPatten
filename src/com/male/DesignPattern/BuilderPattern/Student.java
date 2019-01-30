package com.male.DesignPattern.BuilderPattern;

public class Student {

    private int status;
    private String name;
    private int age;

    public Student(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status=" + status +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class builder{
        private Student s;

        public builder(Student s) {
            this.s = s;
        }

        public builder(int status) {
            this(new Student(status));
        }

        public builder setName(String name){
            this.s.name = name;
            return this;
        }

        public builder setAge(int age){
            this.s.age = age;
            return this;
        }

        public Student build(){
            return this.s;
        }
    }
}
