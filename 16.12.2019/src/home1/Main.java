package home1;

public class Main {

    public static void main(String[] args) {

        int[] arr = {7,3,6,35,1,8};
        int[] secondArr = {2,5,4,7,8,3};
        Collection collection = new Collection(arr,secondArr);
        collection.firstClass.hasNext();
        collection.firstClass.next();

        collection.secondClass.hasNext();
        collection.secondClass.next();


    }

}
