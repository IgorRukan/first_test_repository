//ПАМЯТЬ
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {
            int soldiers = scanner.nextInt();
            int raw = scanner.nextInt();
            int[][] a = new int[raw][soldiers];
            int pushUps = 0;
            int curSoldier;
            for (int i = 0; i < raw; i++) {
                for (int j = 0; j < soldiers; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < raw; i++) {
                for (int j = 0; j < soldiers; j++) {
                    curSoldier = a[i][j];
                    for (int k = 0; k < j; k++) {
                        if (a[i][k] > curSoldier) {
                            pushUps++;
                        }
                    }
                }
            }
            fileWriter.write(Integer.toString(pushUps));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
