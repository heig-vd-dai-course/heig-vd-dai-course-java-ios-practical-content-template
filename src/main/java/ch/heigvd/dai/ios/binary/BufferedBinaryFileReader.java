package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

/**
 * A class that reads binary files. This implementation reads the file using a buffered input
 * stream. It manages the input stream and the buffered input stream properly with a
 * try-with-resources block.
 */
public class BufferedBinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
