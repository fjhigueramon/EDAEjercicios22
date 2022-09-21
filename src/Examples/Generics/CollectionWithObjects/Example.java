package Examples.Generics.CollectionWithObjects;

public class Example {

    public static void main(String[] args) {
        ObjectList myList = new ArrayObjectList();
        myList.add(0, 3.0f);
        myList.add(1, 4.0f);
        myList.add(2, 5.0f);
        System.out.println(myList.toString());
        float result = (float) myList.remove(0);
        System.out.println(myList.toString());
        float replaced = (float) myList.set(1, 3.0f);
        System.out.println(myList.toString());

        myList.add(0, "A");
        System.out.println(myList.toString());
    }

}
