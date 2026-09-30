package src;

public class RobertHolderTester {
    public static void main(String[] args) {
        CustomArrayList<String> robert = new CustomArrayList<>();

        robert.add("HI");
        System.out.println(robert.size());
        robert.add("HELLO");
        System.out.println(robert.size());
        robert.add("HI THERE");
        System.out.println(robert.size());
        robert.add("HELLO THERE");
        System.out.println(robert.size());
        robert.add("WHAT");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.add("IS UP");
        System.out.println(robert.size());
        robert.printStringAtIndex(3);
        robert.removeAtIndex(3);
        robert.addAtIndex(3, "Please");
        robert.printStringAtIndex(3);
        robert.replaceAtIndex(3, "No");
        robert.printStringAtIndex(3);
        System.out.println(robert.size());
        robert.add("End?");
        robert.find("WHAT");
        robert.findCount("IS UP");
        robert.printAll();
        CustomArrayList<String> robertClone = robert.cloneClass();
        robert.clear();
        robert.printAll();
        System.out.println("\n\nCleared print spacer");
        robertClone.printAll();
    }
}
