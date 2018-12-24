package part2;

public class Manager extends Employee {
  
  private int grade;

    public Manager(int grade, String name, String id) {
        
        super(name,id);
        this.grade = grade;
    }

  
}
