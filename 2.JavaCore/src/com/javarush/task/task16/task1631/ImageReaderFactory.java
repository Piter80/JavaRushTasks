package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by ux on 07.08.2018.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes i) {
        if (i != null) {
            if (i.equals(ImageTypes.BMP)) return new BmpReader();
            else if (i.equals(ImageTypes.JPG)) return new JpgReader();
            else if (i.equals(ImageTypes.PNG)) return new PngReader();
        }

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
