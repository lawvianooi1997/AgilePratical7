package part2;

public class Employee {

  private String name;
  private String id;
  

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * @return the name
     */
    private String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    private String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(String id) {
        this.id = id;
    }
  
}

   
