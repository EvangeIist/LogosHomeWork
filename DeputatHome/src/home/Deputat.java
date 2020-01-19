package home;

import java.util.Objects;

public class Deputat extends Person implements Comparable{

    private String secondName;

    private Integer weight;

    private boolean isBadGay;

    private Integer bribeSizes;


    public Deputat(String name,String secondName, Integer age,  Integer weight, boolean isBadGay, Integer bribeSizes) {
        super(name, age);
        this.secondName = secondName;
        this.weight = weight;
        this.isBadGay = isBadGay;
        this.bribeSizes = bribeSizes;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean isBadGay() {
        return isBadGay;
    }

    public void setBadGay(boolean badGay) {
        isBadGay = badGay;
    }

    public Integer getBribeSizes() {
        return bribeSizes;
    }

    public void giveBribe(int bribeSize){
        if(isBadGay) {

            if (bribeSize > 5000) {
                System.out.println(super.getName() + " посадили в тюрму за взятку");
                return;
            }
            System.out.println(super.getName() + " говорить: Дякую, я зроблю те що ви просите!");
            this.bribeSizes = bribeSize;
            return;
        }
        System.out.println("Я не беру хабарів!");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deputat deputat = (Deputat) o;
        return isBadGay == deputat.isBadGay &&
                Objects.equals(secondName, deputat.secondName) &&
                Objects.equals(weight, deputat.weight) &&
                Objects.equals(bribeSizes, deputat.bribeSizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), secondName, weight, isBadGay, bribeSizes);
    }


    public int compareTo(Object o) {

        Deputat d = (Deputat) o;
        if (weight == d.weight) return 0;
        if (weight > d.weight) return 1;
        return -1;

    }
}