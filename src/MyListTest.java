public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        list.get(-1);
//        System.out.println("element -1: " + list.get(-1));
        System.out.println("Element 4: " + list.get(1));
        System.out.println("Element 1: " + list.get(2));
        System.out.println("Element 2: " + list.get(3));
//        list.add(6);
//        System.out.println("element 6: " + list.get(6));

    }
}
