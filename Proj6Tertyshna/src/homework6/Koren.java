package homework6;
//    4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.

    public class Koren {

        public static void main(String[] args) {
            int x = 3;
            int y = 4;
            double z = powerMethod(x, y);
            double sqrt = sqrt3Method(x);

            System.out.println("z = " + z);
            System.out.println("sqrt = " + sqrt);
        }

        private static double sqrt3Method(int x) {
            double z = 1.0/3.0;
            return Math.pow(x, z);
        }

        private static double powerMethod(int x, int y) {

            return Math.pow(x, y);
        }

    }


