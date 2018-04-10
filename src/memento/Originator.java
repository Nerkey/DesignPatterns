package memento;

public class Originator {

    public String name;

    public String phone;

    public double budget;

    /**
     * 保存
     * @return 备忘录
     */
    public Memento saveMemento() {
        return new Memento(name, phone, budget);
    }

    /**
     * 回复备忘录
     * @param memento 备忘录
     */
    public void restoreMemento(Memento memento) {
        this.name = memento.name;
        this.phone = memento.phone;
        this.budget = memento.budget;
    }

    /**
     * 显示信息
     */
    public void show() {
        System.out.println(this.name + " " + this.phone + " " + this.budget);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
