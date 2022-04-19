/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
import static com.mycompany.dev_j110_2_p2.ConvertDuration.timeToString;

public class MultimediaFile extends File{
    private String fileContents; // описание содержащегося в файле
    private int duration; // Длительность

    public MultimediaFile(String name, int size, String fileContents, int secs) {
        super(name, size);
        setFileContents(fileContents);
        setDuration(secs);
        this.formatFile = "audio";
    }

    public String getFileContents() {
        return fileContents;
    }

    public void setFileContents(String fileContents) {
        if (fileContents != null && !fileContents.trim().isEmpty())
        this.fileContents = fileContents;
        else
            throw new IllegalArgumentException("Описание содержимого не может быть пустой ссылкой, пустым значением или пробелом");
    }

    public int getDuration() {
        return duration;
    }

    public String getDurationToString() {
        return timeToString (getDuration());
    }

    public void setDuration(int duration) {
        if (duration<0)
            throw new IllegalArgumentException("Длительность мультимедии не может быть меньше нуля");
        this.duration = duration;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getFileContents() + ", " + getDurationToString()+ ",");
    }
}
