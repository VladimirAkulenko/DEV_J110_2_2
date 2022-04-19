/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class VideoFile extends MultimediaFile{
    private int width; //Ширина
    private int height; //Высота


    public VideoFile(String name, int size, String fileContents, int secs, int width, int height) {
        super(name, size, fileContents, secs);
        setWidth(width);
        setHeight(height);
        this.formatFile = "video";
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<1)
            throw new IllegalArgumentException("Размер видео файла по ширене должна быть больше нуля");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<1)
            throw new IllegalArgumentException("Размер видео файла по высоте должна быть больше нуля");
        this.height = height;
    }

    @Override
    public void print() {

        System.out.println(getName() +" | "+ getSize() +" | "+ getFormatFile() + ", "+ getFileContents() + ", " +
                getDurationToString() + ", "+ getWidth() + "x" + getHeight());
    }
}