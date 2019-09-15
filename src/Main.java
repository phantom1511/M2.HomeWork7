import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>(5);
        List<String> listB = new ArrayList<>(5);
        List<String> listC = new ArrayList<>(10);

        System.out.println("Please, input your 5 elements to the List A: ");
        Iterator<String> iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            listC.add(listA.iterator().next());
            System.out.println(listA.indexOf(iteratorA));
        }

        int i = 0;
        while (i < 5) {
            listA.add(scanner.nextLine());
            i++;
        }

        System.out.println("List A");
        System.out.println(listA);

        System.out.println("Please, input your 5 elements to the List B: ");
        Iterator<String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            listC.add(listB.iterator().next());
            System.out.println(listB);
        }

        int j = 0;
        while (j < 5) {
            listB.add(scanner.nextLine());
            j++;
        }

        System.out.println("List B");
        System.out.println(listB);

        Collections.sort(listA);
        Collections.reverse(listB);

        System.out.println("List C");
        listC.addAll(listA);
        listC.addAll(listB);
        System.out.println(listC);

        Iterator<String> iteratorC = listC.iterator();
        while (iteratorA.hasNext() || iteratorB.hasNext()) {
            if(iteratorA.hasNext()){
                listC.add(iteratorA.next());
            }
            if (iteratorB.hasNext()){
                listC.add(iteratorB.next());
            }
            System.out.println(listC.iterator());
        }
        System.out.println(listC);

        /*int j = 0;
        System.out.println("Please, input your 5 elements to the List B: ");
        while (j<listB.length){
            listB[j] = scanner.nextLine();
            j++;
        }
        System.out.println("List B");
        System.out.println(Arrays.toString(listB));

        Iterator<String> iterator = listC.iterator();
        while (iterator.hasNext()){
            Collections.addAll(listC, listA);
            Collections.addAll(listC, listB);
            Collections.sort(listC);
            System.out.println(listC);
        }
        System.out.println(Arrays.toString(new List[]{listC}));*/
    }
}
