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

    public DocFile(String name, int size, int numberPages) {
        super(name, size);
        setNumberPages(numberPages);
        this.formatFile = "docx";
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        if (numberPages<1)
            throw new IllegalArgumentException("Количество страниц не может быть меньше одной");
        this.numberPages = numberPages;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(getNumberPages() + (getNumberPages()>1 ? " pages" : " page"));
    }
}
