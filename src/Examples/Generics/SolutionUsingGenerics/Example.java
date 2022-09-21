package Examples.Generics.SolutionUsingGenerics;

public class Example {

    public static void main(String[] args) {
        GeneralList<Float> myList = new ArrayGeneralList<>();
        myList.add(0, 3.0f);
        myList.add(1, 4.0f);
        myList.add(2, 5.0f);
        System.out.println(myList.toString());
        float result = myList.remove(0);
        System.out.println(myList.toString());
        float replaced = myList.set(1, 3.0f);
        System.out.println(myList.toString());
//        myList.add(0, "A");

        GeneralList<String> myListStrings = new ArrayGeneralList<>();
        myListStrings.add(0, "A");
        myListStrings.add(0, "D");
        myListStrings.add(0, "E");
        System.out.println(myListStrings.toString());
    }

}
