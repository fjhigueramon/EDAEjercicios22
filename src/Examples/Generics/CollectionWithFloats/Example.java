package Examples.Generics.CollectionWithFloats;

public class Example {

    public static void main(String[] args) {
        FloatList myList = new ArrayFloatList();
        myList.add(0, 3.0f);
        myList.add(1, 4.0f);
        myList.add(2, 5.0f);
        System.out.println(myList.toString());
        myList.remove(0);
        System.out.println(myList.toString());
        myList.set(1, 3.0f);
        System.out.println(myList.toString());
    }

}
