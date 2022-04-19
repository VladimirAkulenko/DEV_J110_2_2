/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class DEV_J110_2_P2 {

    public static void main(String[] args) {
    File [] files = new File[4];

    files[0] = new DocFile("j110-lab2-hiers.docx",23212,2);
    files[1] = new ImageFile("spb-map.png",1703527, 1024,3072);
    files[2] = new MultimediaFile("06-PrettyGirl.mp3",7893454,"Eric Clapton, Pretty Girl",328);
    files[3] = new VideoFile("BackToTheFuture1.avi",1470984192,"Back to the future I, 1985",6488,640,352);



    File.printAll(files);
        System.out.println("---------------------------------------------------------------------------");
    }
}
