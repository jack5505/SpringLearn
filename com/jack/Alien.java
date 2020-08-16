package jack;

/**
 * @author Sabirov Jakhongir
 */
public class Alien {
    private int age;
    private Laptop laptop;
    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){

    }

    public void code()
    {
        System.out.println("Coding...");
        laptop.compile();
    }
}
