package ch.heigvd.ios.text;

import ch.heigvd.ios.Writable;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
