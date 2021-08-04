package section4.exercise056057task2;

import java.util.SortedMap;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int fullMegaBytes = kiloBytes/1024;
            int remainingKiloBytesFromMegaBytes = kiloBytes%1024;

            System.out.println(kiloBytes + " KB = " + fullMegaBytes + " MB and " + remainingKiloBytesFromMegaBytes + " KB");
        }
    }
}
