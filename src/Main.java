import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nТренировка");
        int[] weights = {58, 59, 60, 61, 59, 58, 57, 0, 0, 0, 0, 0};
        weights[0] = 58;
        int januaryWeight = weights[0];
        System.out.println(weights[8]);
        System.out.println(weights[9]);
        System.out.println(januaryWeight);
        int january = 0;
        System.out.println(weights[january]);
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println(weights.length);
        System.out.println(Arrays.toString(weights));

        System.out.println("\nЗадача 1");
        {
            int[] massiv1 = new int[]{1, 2, 3};
            double[] massiv2 = {1.57, 7.654, 9.986};
            int[] myMassiv = {58, 59, 60, 57};

            System.out.println("\nЗадача 2");
            for (int index = 0; index < massiv1.length; index++) {
                if (index == massiv1.length - 1) {
                    System.out.println(massiv1[index]);
                    break;
                }
                System.out.print(massiv1[index] + ", ");
            }
            for (int index = 0; index < massiv2.length; index++) {
                if (index == massiv2.length - 1) {
                    System.out.println(massiv2[index]);
                    break;
                }
                System.out.print(massiv2[index] + ", ");
            }
            for (int index = 0; index < myMassiv.length; index++) {
                if (index == myMassiv.length - 1) {
                    System.out.println(myMassiv[index]);
                    break;
                }
                System.out.print(myMassiv[index] + ", ");
            }

            System.out.println("\nЗадача 3");
            for (int index = 2; index < massiv1.length; index--) {
                if (index < massiv1.length - 2) {
                    System.out.println(massiv1[index]);
                    break;
                }
                System.out.print(massiv1[index] + ", ");
            }

            for (int index = 2; index < massiv2.length; index--) {
                if (index < massiv2.length - 2) {
                    System.out.println(massiv2[index]);
                    break;
                }
                System.out.print(massiv2[index] + ", ");
            }
            for (int index = 3; index < myMassiv.length; index--) {
                if (index < myMassiv.length - 3) {
                    System.out.println(myMassiv[index]);
                    break;
                }
                System.out.print(myMassiv[index] + ", ");
            }
        }

        System.out.println("\nЗадача 4");
        {
            int[] massiv1 = new int[]{1, 2, 3};
            for (int index = 0; index < massiv1.length; index++) {
                if (massiv1[index] % 2 != 0) {
                    massiv1[index]++;
                    System.out.print(massiv1[index] + " ");
                } else {
                    System.out.print(massiv1[index] + " ");
                }
            }
        }
    }
}

