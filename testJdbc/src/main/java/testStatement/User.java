package testStatement;

public class User {
    private int id;
    private String name;
    private int age;
    private String password;

    public User(){

    }

    public User (String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User (int id, String name, String password, int age){
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"[id:" + id +
                ", username:" + name +
                ", password:" + password +
                ", age:" + age +
                "]";
    }
}
