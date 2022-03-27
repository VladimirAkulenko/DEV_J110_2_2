/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class File {
    private String name; //Имя файла
    private int size; //Размер в байтах
    private String formatFile; // Формат файла

    public File(String name, int size, String formatFile) {
        setName(name);
        setSize(size);
        setFormatFile(formatFile);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
        this.name = name;
        else
            throw new IllegalArgumentException("Имя файла не может быть пустой ссылкой, пустым значением или пробелом");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size<=0)
            throw new IllegalArgumentException("Размер файла не может быть меньше или равен нуля");
        this.size = size;
    }

    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        if (formatFile != null && formatFile.trim().isEmpty())
        this.formatFile = formatFile;
        else
            throw new IllegalArgumentException("Формат файла не может быть пустой ссылкой, пустым значением или пробелом");
    }

    public void print(){
        System.out.println();
    }

    public static void printAll(File[] files){
        for (File file: files)
            file.print();
    }
}
