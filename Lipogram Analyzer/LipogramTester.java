public class LipogramTester {
    public static void main(String[] args) {tester(); }
    public static void tester() {
        LipogramAnalyzer test = new LipogramAnalyzer("She came home after she went to the movies!");

        System.out.println("Test One: ");
        System.out.println(test.mark('e'));
        System.out.println(test.allWordsWith('e'));

        LipogramAnalyzer test2 = new LipogramAnalyzer("I have a mathematics exam tomorrow, so I need to study!");

        System.out.println("Test Two: ");
        System.out.println(test2.mark('e'));
        System.out.println(test2.allWordsWith('e'));

        LipogramAnalyzer test3 = new LipogramAnalyzer("How will we get there on time?");

        System.out.println("Test Three: ");
        System.out.println(test3.mark('e'));
        System.out.println(test3.allWordsWith('e'));


    }
}
