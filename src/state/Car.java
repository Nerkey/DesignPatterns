package state;

/**
 * 环境角色
 */
public class Car {

    private State current;

    public Car() {
        current = new Off();
        System.out.println("新车生产出来, 现在是空挡");
    }

    protected void setState(State s) {
        current = s;
    }

    public void pull() {
        current.pull(this);
    }
}
