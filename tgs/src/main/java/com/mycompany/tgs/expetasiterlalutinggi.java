/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author FADLI
 */
public class expetasiterlalutinggi {
    public static void save(palingantahunyasayacumanurun settings, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(settings);
            out.close();
            fileOut.close();
            System.out.println("Settings saved successfully.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static palingantahunyasayacumanurun loadS(String fileName) {
        palingantahunyasayacumanurun settings = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            settings = (palingantahunyasayacumanurun) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Skill issue");
            c.printStackTrace();
        }
        return settings;
    }
}
