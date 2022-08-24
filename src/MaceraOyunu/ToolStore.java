package MaceraOyunu;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("-----Magazaya hosgeldiniz !!-----");
        System.out.println("1-Silahlar\n2-Zirhlar\n3-Cikis yap");
        System.out.print("Seciminiz :");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.print("Gecersiz deger,tekrar giriniz");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz !! ");
                return true;

        }
        return true;
    }

    public void printWeapon() {
        System.out.println("----Silahlar-------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getName() + "<Para :" + w.getPrice() + ", Hasar : " + w.getDamage() + ">");
        }
        System.out.println("Silah secin");
        int selectWeapon= input.nextInt();

        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
            System.out.print("Gecersiz deger,tekrar giriniz");
            selectWeapon = input.nextInt();
        }

        Weapon selectedWeapon=Weapon.getWeaponObjById(selectWeapon);

        if(selectedWeapon != null){

        }
    }

    public void printArmor() {
        System.out.println("Zırhlar");
    }

}
