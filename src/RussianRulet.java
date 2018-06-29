import java.util.Scanner;



public class RussianRulet {
    private static int[] generateNumber(int level1) {

        int[] arr = new int[level1];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                int randomNumber = (int) ((Math.random() * 6) + 1);
                if (!checkNumber(arr, randomNumber)) {
                    arr[i] = randomNumber;
                    break;
                }
            }


        }

        return arr;
    }

    private static boolean checkNumber(int[] arr, int randomNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == randomNumber) {
                return true;
            }
        }
        return false;
    }

    public static int getLevel() {
        int level;
        do {

            System.out.println("Выберите уровень. 1 - легкий, 2 - средний, 3 - сложный");
            Scanner scan = new Scanner(System.in);
            level = Integer.valueOf(scan.next());
            if (level <1 || level  >3 ) {
                System.out.println("Вы ввели не верное число");
            }
            else{}
        }
        while (level <1 || level  >3 );
        switch (level)  {
            case 1 :
                System.out.println("Выбраный уровень сложности Легкий");
                break;
            case 2 :
                System.out.println("Выбраный уровень сложности Средний");
                break;
            case 3 :
                System.out.println("Выбраный уровень сложности Сложный");
                break;
        }






        System.out.println("Загадано " + level + " числа(о) от 1 до 6... Не попади в них");

        return level;
    }

    public static void main(String[] args) {

        int level1, chance;
        int score = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет!"+"\n"+"Набери 10 баллов чтобы победить!"+"\n"+"Введи свое имя");
        String player = scanner.next();
        while (score < 10) {
            level1 = getLevel();
            int[] shot = generateNumber(level1);

            {

                System.out.println("Введите число от 1 до 6");

                do {
                    do {
                        chance = Integer.valueOf(scanner.next());

                        {
                            if (chance > 0 && chance < 7) {

                                System.out.println("Игрок " + player);
                                System.out.println("Выбрал чило " + chance);

                            } else {
                                System.out.println("Вы ввели число не из нужного диапазона. Введите число  от 1 до 6");

                            }

                        }
                    }
                    while (chance < 1);
                } while (chance > 6);
                for (int i = 0; i < shot.length; i++)
                    if (shot[i] != chance) {

                    }else {

                        System.out.println("Вы проиграли!");
                        System.out.println("Число " + shot[i]+" было загадано");
                        System.exit(0);
                    }
                score += level1;
                System.out.println("Вам повезло! Вы заработали" + level1 + " балл(а). Сумма баллов " + score);

            }

        }

        System.out.println("Вы победили! Поздравляем");


    }
}
