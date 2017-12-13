package lists;

public class SetUsingListMain {

    public static void main(String[] args) {

        SetUsingList sul = new SetUsingList();

        for (int i=0;i<10;i++)
        {
            sul.add(i);
        }

        System.out.println("sul contains " + sul.toString());

        System.out.println("sul add 7 returned " + sul.add(7));

        System.out.println("sul remove 9 returned " + sul.remove(9));

        System.out.println("sul remove 9 returned " + sul.remove(9));

        System.out.println("sul contains " + sul.toString());
    }

}
