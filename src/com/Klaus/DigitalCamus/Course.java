package com.Klaus.DigitalCamus;

import java.util.Vector;

public class Course {
    private String name;
    private Room room;
    private Vector<Student> students = new Vector<Student>();
    private Vector<Trainer> trainers = new Vector<Trainer>();

    public Course(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public void setStudents(Student s) {
        students.add(s);
    }

    public void setTrainers(Trainer t) {
        trainers.add(t);
    }

    public String trainersToString(Vector<Trainer> trainers){
        String t = "";
        for (var trainer:trainers
        ) {
            t += trainer.getName() + " ";
        }
        return t;
    }

    public String studentsToString(Vector<Student> students){
        String s = "";
        for (var student:students
        ) {
            s += student.getName() + " ";
        }
        return s;
    }


}
