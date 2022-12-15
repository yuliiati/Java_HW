public class Reverse {
    public static void main(String[] args) {


       String[] strings = new String[5];
        strings[0] = "One";
        strings[1] = "Two";
        strings[2] = "Three";
        strings[3] = "Four";
        strings[4] = "Five";
        //ctrl+d

        printArray(strings);
        String[] revertedStrings = revertArray(strings);
    }

    private static String[] revertArray(String[] strings) {

        String[] revertedArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
           strings[i] = strings[strings.length -1];
        }

    }

    private static void printArray(String[] strings) {
        for(int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}