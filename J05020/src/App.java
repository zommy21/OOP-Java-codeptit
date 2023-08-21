import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student >{
    private String code,name,classes , mail ;

    Student(String code , String name , String classes , String mail){
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + classes + " " + mail;
    }

    @Override
    public int compareTo(Student other) {
        if(this.getClasses().compareTo(other.getClasses()) != 0){
                    return this.getClasses().compareTo(other.getClasses());
                }
                return this.getCode().compareTo(other.getCode());
    }

}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String classes = sc.nextLine();
            String mail = sc.nextLine();
            list.add(new Student(code, name, classes, mail));
        }

        list.sort(null);
        for (Student e : list) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
