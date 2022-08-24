package MaceraOyunu;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("macera oyununa hosgeldiniz !");
        System.out.print("Lutfen bir isim giriniz:");

        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayin\t" + player.getPlayerName() + "\tbu karanlik ve sisli adaya Hosgelniz !!");

        player.selectChar();

        Location location = null;

        while (true) {
            System.out.println();
            System.out.println("###Bolgeler#### ");
            System.out.println();
            System.out.println("1-Guvenli ev");
            System.out.println("2-Magaza");
            System.out.println("Lutfen gitmek istediginiz yeri secin");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation())
            {
                System.out.println("GAME OVER !!");
                break;
            }
        }
    }
}
