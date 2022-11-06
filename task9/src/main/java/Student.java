import java.util.Objects;

public class Student extends Human{
    private String university;
    private String department;
    private String speciality;

    public Student(String lastName, String name, String middleName, int age, String university, String department, String speciality){
        super(lastName, name, middleName, age);
        this.university = university;
        this.department = department;
        this.speciality = speciality;
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(department, student.department) && Objects.equals(speciality, student.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, department, speciality);
    }

}