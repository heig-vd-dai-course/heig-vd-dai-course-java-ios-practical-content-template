package ch.heigvd.ios.text;

import ch.heigvd.ios.Readable;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */
public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
