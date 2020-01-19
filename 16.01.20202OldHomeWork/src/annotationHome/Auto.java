package annotationHome;

public class Auto {

    @MyAnnotation
    String color;
    int price;
    @MyAnnotation
    int volume;

    public Auto(String color, int price, int volume) {
        this.color = color;
        this.price = price;
        this.volume = volume;
    }

    public void drive(){
        System.out.println("Turn on the car.");
    }


}
