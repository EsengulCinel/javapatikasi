package MaceraOyunu;

import java.util.Scanner;

public class Player {

    private int damage;
    private int healty;
    private int money;
    private String playerName;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String playerName) {  //sadece bunu dışardan aldığımız için bunu constractor metota ekledik. Diğer değişkenler zaten tanımlı olacağı için.
        this.playerName = playerName;
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        Charecter[] charList = {new Samurai(), new Knight(), new Archer()};
        System.out.println("-----------------------");
        for (Charecter charecter : charList) {
            System.out.println("ID:"+charecter.getId()+
                    "\tKarakter " + charecter.getName() +
                    "\tHasar" + charecter.getDamage() +
                    "\tSaglik" + charecter.getHealty() +
                    "\tPara" + charecter.getMoney());
        }
        System.out.println("-------------------");
        System.out.print("Karakter secin:");
        int selectChar =input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter :"+this.getCharName() );
    }



    public void initPlayer(Charecter charecter){
        this.setDamage(charecter.getDamage() );
        this.setHealty(charecter.getHealty());
        this.setMoney(charecter.getMoney());
        this.setCharName(charecter.getName() );
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
