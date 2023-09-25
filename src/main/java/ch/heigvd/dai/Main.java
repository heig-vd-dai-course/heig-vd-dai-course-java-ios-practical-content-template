package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Measure the time to write a file (e.g : 1 byte, no buffer and binary file)

        Measure.write("binary_1B.bin", 1, false, Measure.FileType.BINARY);

        // Measure the time to read the same file

        Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);
    }
}
