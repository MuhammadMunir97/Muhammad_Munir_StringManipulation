public class StringManipulationTest {
    public static void main(String[] args) {
        StringManipulation manipulator = new StringManipulation();
        // Part 1
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println("Answer to 1: ");
        System.out.println(str); // HelloWorld
        
        // Part 2
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println("Answer to 2: ");
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        // Part 3
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println("Answer to 3: ");
        System.out.println(d); // 2
        System.out.println(e); // null

        // Part 4
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println("Answer to 4: ");
        System.out.println(word1); // eworld
        
    }
}
