package com.example.activitydemo.bundle;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public final class SizeCalculator {
    public static int calcSize(java.io.Serializable o) {
        int ret = 0;
        class DumbOutputStream extends OutputStream {
            int count = 0;

            public void write(int b) throws IOException {
                count ++; // 只计数，不产生字节转移
            }
        }

        DumbOutputStream buf = new DumbOutputStream();
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(buf);
            os.writeObject(o);
            ret = buf.count;
        } catch (IOException e) {
            // No need handle this exception
            e.printStackTrace();
            ret = -1;
        } finally {
            try {
                os.close();
            } catch (Exception e) {
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.err.println(calcSize(1));
    }
}
