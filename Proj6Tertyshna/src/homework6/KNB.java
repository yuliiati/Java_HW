
package homework6;

public class KNB {
     // import java.util.Random;
    // 5*) Реализовать игру "Камень, ножницы, бумага"

        Random random = new Random();

        public void randomGame(){            // Игра компьютера с компьютером
            int a = random.nextInt(3)+ 1; // Диапазон от 1 до 3
            int b = random.nextInt(3)+ 1; // Диапазон от 1 до 3

            String str1 = "";
            String str2 = "";

            if(a == 1){
                str1 = "Бумага";
            }
            else if(a == 2){
                str1 = "Ножницы";
            }
            else if(a == 3){
                str1 = "Камень";
            }

            if(b == 1){
                str2 = "Бумага";
            }
            else if(b == 2){
                str2 = "Ножницы";
            }
            else if(b == 3){
                str2 = "Камень";
            }

            System.out.println(str1 + " " + str2);
            System.out.println(rsp(str1, str2));

        }

        public String rsp(String str1, String str2){
            if(str1 == "Ножницы" && str2 == "Бумага"){
                return "Игрок 1 победил";
            }
            else if(str1 == "Ножницы" && str2 == "Камень"){
                return  "Игрок 2 победил";
            }
            if(str1 == "Камень" && str2 == "Бумага"){
                return "Игрок 2 победил";
            }
            else if(str1 == "Камень" && str2 == "Ножницы"){
                return  "Игрок 1 победил";
            }
            if(str1 == "Бумага" && str2 == "Ножницы"){
                return "Игрок 2 победил";
            }
            else if(str1 == "Бумага" && str2 == "Камень"){
                return  "Игрок 1 победил";
            }
            else
                return "Ничья";
        }
    }



