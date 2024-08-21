package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
