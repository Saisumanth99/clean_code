package single_response;
class Student {
    String name;
    String rollno;

    Student(String name, String rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return this.rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    
}
class StudentDataPrinter {
    public void printTheDetails(String data){
        System.out.println(data);
    }
}


class SingleResponse {
    public static void main(String[] args) {
        Student student = new Student("sumanth", "26");
        new StudentDataPrinter().printTheDetails("name : "+student.getName()+" rollno : "+student.getRollno());
    }
}