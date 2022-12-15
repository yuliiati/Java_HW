public class Solver { // Вызываем в Классе Мейн, а этот просто обслуживающий(сервер)
    // Задача: Разработать метод в классе Solver

    public double linearEquation(double x, double a) {  // Линейные уравнения
        return a / x;
    }
    public double findDiscriminant(double a, double b, double c){
        return Math.pow(b, 2) - 4*a*c;             // b*b - 4*a*c; Альтернативный метод

    }

    public boolean isRoots(double discriminant){
        if(discriminant < 0){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean isTwoRoots(double discriminant){
        if(discriminant == 0){
            return false;
        }
        else {
            return true;
        }
    }
    public double SingleRoot(double a, double b, double discriminant){
        return (-b - Math.sqrt(discriminant))/(2*a);
    }
    public double[] doubleRoot(double a, double b, double discriminant){
        double[] arr = new double[2];                   // Находим два корня
        arr[0] = SingleRoot(a, b, discriminant);
        arr[1] = (-b + Math.sqrt(discriminant))/(2*a);

        return arr;
    }


}




