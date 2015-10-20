package com.patterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by PXV8340 on 10/20/2015.
 */
public class LowerCaseInputStream extends FilterInputStream {

    InputStream inputStream;

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
        if (in != null) {
            this.inputStream = in;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return ((c == -1) ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result  = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }



}
