package src;

public class RobertHolderTester {
    public static void main(String[] args) {
        RobertHolder<String> robert = new RobertHolder<>();

        robert.addToBucket("HI");
        System.out.println(robert.size());
        robert.addToBucket("HELLO");
        System.out.println(robert.size());
        robert.addToBucket("HI THERE");
        System.out.println(robert.size());
        robert.addToBucket("HELLO THERE");
        System.out.println(robert.size());
        robert.addToBucket("WHAT");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.addToBucket("IS UP");
        System.out.println(robert.size());
        robert.getStringAtIndex(3);
        robert.removeAtIndex(3);
        robert.addAtIndex(3, "Please");
        robert.getStringAtIndex(3);
        robert.replaceAtIndex(3, "No");
        robert.getStringAtIndex(3);
        System.out.println(robert.size());
        robert.addToEnd("End?");
        robert.find("WHAT");
        robert.findCount("IS UP");
        robert.printAll();
        RobertHolder<String> robertClone = robert.cloneClass();
        robert.clearBucket();
        robert.printAll();
        System.out.println("\n\nCleared print spacer");
        robertClone.printAll();
        Object[] robertCloneBucket = robertClone.getBucket();
        System.out.println("\n\n" + robertCloneBucket[0]);
    }
}
