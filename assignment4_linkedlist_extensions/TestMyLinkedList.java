public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        System.out.println("Test 1: Both Lists Empty");
        list1.clear();
        list2.clear();
        System.out.println("List 1 = " + list1);
        System.out.println("List 2 = " + list2);

        System.out.println("Test 2: Unequal list");
        list1.append(10);
        list1.append(18);
        list1.append(23);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal? " + list1.equals(list2));

        System.out.println("Test 3: Lists with Same Elements");
        list2.append(10);
        list2.append(18);
        list2.append(23);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal? " + list1.equals(list2));

        System.out.println("Test 4: Lists with Different Elements");
        list1.append(5);
        list2.append(13);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal? " + list1.equals(list2));

    }
}
