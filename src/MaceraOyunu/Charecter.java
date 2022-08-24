package MaceraOyunu;

public abstract class Charecter {
    private int id;
    private int damage;
    private int healty;
    private int money;

    private String name;

    public Charecter(int id,String name,int damage,int healty,int money){
        this.damage=damage;
        this.healty=healty;
        this.money=money;
        this.name=name;
        this.id=id;
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

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
