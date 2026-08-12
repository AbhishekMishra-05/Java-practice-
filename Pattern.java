import java.util.*;

public class Pattern {

    void square(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangle(Scanner sc) {
        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void invertedtriangle(Scanner sc) {
        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    void pyramid(Scanner sc) {
        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int spaces = 1; spaces <= row - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    void invertedpyramid(Scanner sc) {
        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (row - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void Hollowsquare(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || j == 1) || (i == row || j == col)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void Flyodstriangle(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    void Diamond(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (row - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void NumberTriangle(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    void InvertedNumbertriangle(Scanner sc) {

        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pascalstriangle(Scanner sc) {
        System.out.println("Enter the rows number: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int space = 1; space <= row - i - 1; space++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+ " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pattern p = new Pattern();
        int choice;

        do {

            System.out.println("1. square pattern.");
            System.out.println("2. Triangle pattern.");
            System.out.println("3. Inverted triangle pattern.");
            System.out.println("4. pyramid");
            System.out.println("5. Inverted pyramid.");
            System.out.println("6. Hollow square");
            System.out.println("7. Floyds triangle");
            System.out.println("8. Diamond.");
            System.out.println("9. NumberTriangle");
            System.out.println("10.InvertedNumbertriangle.");
            System.out.println("11.pascalstriangle");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting");
                    break;
                case 1:
                    p.square(sc);
                    break;
                case 2:
                    p.triangle(sc);
                    break;
                case 3:
                    p.invertedtriangle(sc);
                    break;
                case 4:
                    p.pyramid(sc);
                    break;
                case 5:
                    p.invertedpyramid(sc);
                    break;
                case 6:
                    p.Hollowsquare(sc);
                    break;
                case 7:
                    p.Flyodstriangle(sc);
                    break;

                case 8:
                    p.Diamond(sc);
                    break;
                case 9:
                    p.NumberTriangle(sc);
                    break;
                case 10:
                    p.InvertedNumbertriangle(sc);
                    break;
                case 11:
                    p.pascalstriangle(sc);
                    break;

                default:
                    System.out.println("Invalid");
            }
        } while (choice != 0);
        sc.close();
    }
}