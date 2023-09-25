package ch.heigvd.dai;

import java.io.IOException;

public interface Writable {

    void write(String filename, int sizeInBytes) throws IOException;
}
