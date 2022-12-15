
public class Main {
    // 1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
//    2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
//    пока не будет дана команда на выход из цикла
//    3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
//    арифметическое значение
//    4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
//    5**) Создать метод, который будет применять строку и выводить из нее только гласные буквы

    public static void main(String[] args) {

//    3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
//    арифметическое значение


        static int[] arr = new int[15];

        static int[] sub;

        static int count;

        public static void main (String[]args){

            int[] a = new int[10];

            for (int i = 0; i < a.length; i++) {
                a[i] = i;
                System.out.print(a[i] + " ");
            }

            System.out.println();

            fillArray(a);

            System.out.println(average());

            Utils utils = new Utils(a);

            utils.arrayOut();

            utils.defineLength();

            utils.fillArray();

            System.out.println(utils.average());

            int[] b = utils.getSub();

            System.out.println("Подмассив: ");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i] + " ");
            }
            System.out.println();

            int[] c = {3, 4, 6, 7};
            utils.setSub(c);

            System.out.println("Среднее арифм");
            System.out.println(utils.average());

            c = utils.sort(c);

            for (int i = 0; i < c.length; i++) {
                System.out.println(c[i] + " ");
            }
            System.out.println();
        }

        public static void fillArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0 && arr[i] != 0) {
                    System.out.println("Элемент кратный 3: " + arr[i]);
                    count++;
                    System.out.println("Счетчик, определяющий размер подмассива: " + count);
                }
            }

            sub = new int[count];
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0 && arr[i] != 0) {
                    sub[count] = arr[i];
                    System.out.println("Добавленный элемент: " + sub[count]);
                    count++;
                }
            }

        }

        public static double average () {
            double av = 0;
            for (int i = 0; i < sub.length; i++) {
                av += sub[i];
            }
            return av / sub.length;
        }


    }
}