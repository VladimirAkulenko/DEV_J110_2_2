/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class DocFile extends File {
    private int numberPages; // Количество страниц

    public DocFile(String name, int size, String formatFile, int numberPages) {
        super(name, size, formatFile);
        setNumberPages(numberPages);
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        if (numberPages<1)
            throw new IllegalArgumentException("Количество страниц не может быть меньше одной");
        this.numberPages = numberPages;
    }
}
