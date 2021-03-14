package day6;

import java.util.Random;

public class Teacher {
   private String name;
   private String subject;

   public Teacher(String name, String subject){
       this.name=name;
       this.subject=subject;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random rand = new Random();
        int randValue=rand.nextInt(4)+2;
        String evaluation="";
        switch (randValue){
            case 2: evaluation = "Плохо";
            break;
            case 3: evaluation = "Удовлетворительно";
            break;
            case 4: evaluation = "Хорошо";
            break;
            case 5: evaluation = "Отлично";
            break;
        }

        System.out.println("Преподаватель " + name+" оценил студента с именем "+ student.name+" по предмету "+subject+" на оценку "+evaluation);

    }
}
