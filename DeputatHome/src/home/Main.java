package home;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int ask;
        Scanner scn = new Scanner(System.in);

        Deputat ivanSidorenko = new Deputat("Іван", "Сидоренко", 42, 96, false, 0);
        Deputat pavloKovalshuk = new Deputat("Павло", "Ковальчук", 61, 123, true, 12000);
        Deputat dmytroOstapchuk = new Deputat("Дмитро", "Остапчук", 56, 88, true, 7000);
        Deputat stepanKorovetskiy = new Deputat("Степан", "Коровецький", 52, 76, false, 0);
        Deputat tarasYarima = new Deputat("Тарас", "Ярима", 53, 97, false, 0);
        Deputat oleksandrTereshchenko = new Deputat("Олександр", "Терещенко", 44, 110, true, 32000);

        Set<Person> rada = new HashSet<>();
        rada.add(ivanSidorenko);
        rada.add(pavloKovalshuk);
        rada.add(dmytroOstapchuk);
        rada.add(stepanKorovetskiy);
        rada.add(tarasYarima);
        rada.add(oleksandrTereshchenko);


//        TreeSet<Deputat> sortedPeople = new TreeSet(rada);
//        for(Deputat sortedPerson : sortedPeople){
//            System.out.println(sortedPerson.getBribeSizes());
//        }

        System.out.println("Сьогодні в раді лише " + rada.size() + " депутатів.");
        TreeSet<Deputat> sortedByName = new TreeSet(rada);
        for (Deputat byName : sortedByName) {
            System.out.println("Депутат " + byName.getSecondName() + " " + byName.getName());
        }
        System.out.println("===================");
        System.out.println("Що бажаєте зробити?");
        System.out.println("1.Відсортувати.\n2.Дізнатись,через кого можна порішати.\n");
        ask = scn.nextInt();
        switch (ask) {
            case 1:
                System.out.println("1.По віку.\n2.По вазі.");
                ask = scn.nextInt();
                switch (ask){
                    case 1:
                        TreeSet<Deputat> sortedByAge = new TreeSet(rada);
                        for (Deputat byAge : sortedByAge){
                            System.out.println("Депутат " + byAge.getSecondName() + " - " + byAge.getAge() + " років.");
                        }
                        break;
                    case 2:
                        TreeSet<Deputat> sortedByWeight = new TreeSet(rada);
                        for (Deputat byWeight : sortedByWeight){
                            System.out.println("Депутат " + byWeight.getSecondName() + " - " + byWeight.getWeight() + " кілограмів.");
                        }
                        break;
                }
                break;
            case 2:
                TreeSet<Deputat> sortedByBribe = new TreeSet(rada);
                for (Deputat byBribe : sortedByBribe){
                    if(byBribe.isBadGay()){
                        System.out.println("Депутат " + byBribe.getSecondName() + " бере гроші.Він твій колєга");
                    } else {
                        System.out.println("Депутат " + byBribe.getSecondName() + " не бере.Святий чоловік.");
                    }
                }
                break;
        }

    }
}