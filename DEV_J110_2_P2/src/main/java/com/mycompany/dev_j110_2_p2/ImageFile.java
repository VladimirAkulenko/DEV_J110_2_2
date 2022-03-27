/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class ImageFile extends File {
    private int width; //Ширина
    private int height; //Высота

    public ImageFile(String name, int size, String formatFile, int width, int height) {
        super(name, size, formatFile);
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<1)
            throw new IllegalArgumentException("Размер картинки по ширене должна быть больше нуля");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<1)
            throw new IllegalArgumentException("Размер картинки по высоте должна быть больше нуля");
        this.height = height;
    }
}
