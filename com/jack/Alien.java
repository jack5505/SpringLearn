package jack;

/**
 * @author Sabirov Jakhongir
 */
public class Alien {
    private int age;
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("Alien ...");
    }

    public void code()
    {
        System.out.println("Coding...");
        comp.compile();
    }
}
