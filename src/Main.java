import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        main12();
    }

    public static void main1() {
        int[][] mas = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        int[] tmp = mas[0];
        mas[0] = mas[1];
        mas[1] = tmp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main2() {
        int[][] mas = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        for (int i = 0; i < 2; i++) {
            int temp = mas[i][0];
            mas[i][0] = mas[i][4];
            mas[i][4] = temp;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов: ");
        int y = scann.nextInt();
        int[][] mas = new int[x][y];
        int s = 0, max = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                s = s + mas[i][j];
            }
            System.out.println(s);
            if (s > max) {
                max = s;
            }
            s = 0;
        }
        System.out.println("Максимальная сумма строки - " + max);
    }

    public static void main4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов: ");
        int y = scann.nextInt();
        int[][] mas = new int[x][y];
        int s = 0, max = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                s = s + mas[i][j];
            }
            System.out.println(s);
            if (s > max) {
                max = s;
            }
            s = 0;
        }
        System.out.println("Максимальная сумма столбца - " + max);
    }

    public static void main5() {
        int[][] mas = new int[4][8];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] % 2 == 0) {
                    s = s + mas[i][j];
                }
            }
        }
        System.out.println("Сумма чётных элементов = " + s);
    }

    public static void main6() {
        int[][] mas = new int[5][5];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    s = s + mas[i][j];
                }
            }
        }
        System.out.println("Сумма элементов на главной диагонали = " + s);
    }

    public static void main7() {
        int[][] mas = new int[7][4];
        int max = mas[0][0];
        int stroka = 0;
        int stolbec = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] >= max) {
                    max = mas[i][j];
                    stroka = i + 1;
                    stolbec = j + 1;
                }
            }
        }
        System.out.println("Максимальное - " + max);
        System.out.println("Номер строки максимального - " + stroka);
        System.out.println("Номер столбца максимального - " + stolbec);
    }

    public static void main8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите размерность: ");
        int y = scann.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность: ");
        int z = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число на которое нужно увеличить элементы массива: ");
        int n = sc.nextInt();
        int[][][] mas = new int[x][y][z];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] = random.nextInt(1, 20);
                }
            }
        }
        System.out.println(Arrays.deepToString(mas));
        System.out.println("Новый массив : ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] += n;
                }
            }
        }
        System.out.println(Arrays.deepToString(mas));
    }

    public static void main9() {
        String[][] mas = new String[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    mas[i][j] = "W";
                } else {
                    mas[i][j] = "B";
                }
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main10() {
        int[][] mas1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] mas2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] mas = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 4; j++) {
                    mas[i][k] += mas1[i][j] * mas2[j][k];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов: ");
        int y = scann.nextInt();
        int[][] mas = new int[x][y];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                s = s + mas[i][j];
            }
        }
        System.out.println("Cумма всех элементов - " + s);
    }

    public static void main12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов: ");
        int x = scanner.nextInt();
        int[][] mas = new int[x][x];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Диагонали: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i == j) || (i + j == x - 1)) {
                    System.out.print(mas[i][j] + "\t");
                } else System.out.print("   " + "\t");
            }
            System.out.println();
        }
    }

    public static void main13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов: ");
        int y = scann.nextInt();
        int[][] mas = new int[x][y];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(1, 20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        int[] arr = new int[x * y];
        int t = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[t++] = mas[i][j];
            }
        }
        Arrays.sort(arr);
        t = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mas[i][j] = arr[t++];
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}