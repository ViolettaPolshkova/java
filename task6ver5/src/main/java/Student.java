public class Student extends Human{
    private String departmentName;

    public Student(String lastName, String firstName, String middleName, int age, String departmentName){
        super(lastName, firstName, middleName, age);
        this.departmentName = departmentName;
    }

    public Student(Human human, String departmentName){
        super(human);
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
}