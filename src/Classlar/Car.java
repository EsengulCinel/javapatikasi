package Classlar;

class Car {
    String type;
    String model="TEST";
    String color;
    int speed;
    int speedLimit = 180;


    Car(String model,int speed,String color){

        this.model=model;                          //bu sınıfın niteliği eşit olmalı dışardan aldığıma
        this.color=color;
        this.speed=speed;
        this.type="SEDAN";
        this.speedLimit=180;

    }

    void increaseSpeed(int a) {
        if ((this.speed + a) < 180) {
            this.speed += a;

        }

    }

    void descreadSpeed(int b) {
        if (this.speed > 0) {
            this.speed -= b;

        }

    }
    void printSpeed(){
        System.out.println(this.model + " hiziniz :" +this.speed);
    }
    void printInfo(){
        System.out.println("model :\t"+ this.model);
        System.out.println("color :\t"+ this.color);
        System.out.println("type :\t"+ this.type);
        System.out.println("speed :\t"+ this.speed);


    }
}
