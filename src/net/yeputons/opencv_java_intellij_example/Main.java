package net.yeputons.opencv_java_intellij_example;

import nu.pattern.OpenCV;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Main {
    public static void main(String[] args) {
        OpenCV.loadLocally();
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat m = Imgcodecs.imread(args[0]);
        System.out.printf("w=%d h=%d\n", m.width(), m.height());
        System.out.printf("avg: %s\n", Core.mean(m));

        Imgproc.rectangle(
                m,
                new Point(80, 20),
                new Point(100, 100),
                new Scalar(0, 192, 255, 0)  // BGRA, Orange
        );
        Imgcodecs.imwrite("lena-rect.jpg", m);
    }
}
