import java.util.ArrayList;
import java.util.LinkedList;

public class hw36 {
    public static void main(String[] args) {
       /* WeekDay someDay = WeekDay.Friday;
        switch (someDay) {
            case Monday:
                System.out.println("studies on monday");
                break;
            case Tuesday:
                System.out.println(" no studies");
                break;
            case Wednesday:
                System.out.println("studies on wednesday");
                break;
            case Thursday:
                System.out.println("no studies");
                break;
            case Friday:
                System.out.println("studies on friday");
                break;
            default:
                System.out.println("Holiday");
        }


        LinkedList<AbstractTechnics> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            if (i < 50) {
                list.add(new Notebook(ComputerModel.Acer, 100 * i + 10));
            } else list.add(new Computer(ComputerModel.ASUS, 50 * i + 10, 24));
        }
        ArrayList<AbstractTechnics> techArray = new ArrayList<>();
        techArray.addAll(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (techArray.get(i).getPrice() < techArray.get(i + 1).getPrice()) {
                AbstractTechnics t = techArray.get(i);
                techArray.set(i, techArray.get(i + 1));
                techArray.set(i + 1, t);
            } else
                System.out.println(techArray);

            // sohraneniye po ubıvaniyu
            LinkedList<Integer> list1 = new LinkedList<>();
            boolean isSorted = false;
            classwork.AbstractTechnics temp;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j).getPrice() < list.get(j + 1).getPrice()) {
                        isSorted = false;
                        temp = list.get(j);
                        list.set(j) = list.get(j + 1); //daet oshibku,prosit obyavit variable,kak pravilno initialize?
                        list.get(j + 1) = temp;
                        list1.add(i);
                    }
                }
            }
            System.out.println(list1);
        }
*/
    }
}