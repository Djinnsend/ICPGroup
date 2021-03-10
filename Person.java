public class Person {

    /**
     * 
     */
    private String name;
    private String dateofBirth;
    private String gender;
    private int age;

    public Person(String name, String dateofBirth, String gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dateofBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setGender(String gender) {
        if ((gender != "m") || (gender != "f")) {
            System.out.println("this person's gender is not valid");
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age <= 18) {
            System.out.println("this person is too young to vote");
        } else
            this.age = age;
    }
}
