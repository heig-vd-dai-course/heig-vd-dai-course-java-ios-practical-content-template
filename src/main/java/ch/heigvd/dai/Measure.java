package ch.heigvd.dai;

import ch.heigvd.dai.binary.BinaryFileReader;
import ch.heigvd.dai.binary.BinaryFileWriter;
import ch.heigvd.dai.binary.BufferedBinaryFileReader;
import ch.heigvd.dai.binary.BufferedBinaryFileWriter;
import ch.heigvd.dai.text.BufferedTextFileReader;
import ch.heigvd.dai.text.BufferedTextFileWriter;
import ch.heigvd.dai.text.TextFileReader;
import ch.heigvd.dai.text.TextFileWriter;

import java.io.IOException;

public class Measure {

    public enum FileType {
        BINARY,
        TEXT
    }

    /**
     * Measure the time it takes to write a file of a given size, using a buffered or non-buffered stream and of a given type (binary or text)
     * @param filename The name of the file to write
     * @param sizeInBytes The size of the file to write
     * @param buffered Whether to use a buffered stream or not
     * @param type The type of file to write
     * @throws IOException If an error occurs while writing the file
     */
    public static void write(String filename, int sizeInBytes, boolean buffered, FileType type) throws IOException {
        Writable wr = switch (type) {
            case BINARY -> buffered ? new BufferedBinaryFileWriter() : new BinaryFileWriter();
            case TEXT -> buffered ? new BufferedTextFileWriter() : new TextFileWriter();
        };

        System.out.println("Writing " + sizeInBytes + " bytes to " + filename + " with a "
                + (buffered ? "buffered" : "non-buffered") + " stream...");
        long start = System.nanoTime();

        wr.write(filename, sizeInBytes);

        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + "ms / " + (end - start) + "ns");
    }

    /**
     * Measure the time it takes to read a file, using a buffered or non-buffered stream and of a given type (binary or text)
     * @param filename The name of the file to read (must exist)
     * @param buffered Whether to use a buffered stream or not
     * @param type The type of file to read
     * @throws IOException If an error occurs while reading the file
     */
    public static void read(String filename, boolean buffered, FileType type) throws IOException {
        Readable rd = switch (type) {
            case BINARY -> buffered ? new BufferedBinaryFileReader() : new BinaryFileReader();
            case TEXT -> buffered ? new BufferedTextFileReader() : new TextFileReader();
        };

        System.out.println("Reading " + filename + " with a "
                + (buffered ? "buffered" : "non-buffered") + " stream...");
        long start = System.nanoTime();

        rd.read(filename);

        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + "ms / " + (end - start) + "ns");
    }
}
