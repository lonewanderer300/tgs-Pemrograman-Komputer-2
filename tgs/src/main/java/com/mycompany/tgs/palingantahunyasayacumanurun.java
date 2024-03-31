/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgs;

import java.io.Serializable;

/**
 *
 * @author FADLI
 */
public class palingantahunyasayacumanurun implements Serializable {
    String nggaktahu = "dasar nggak tahu apa apa";
    int sayaudahusaha = 820;
 public palingantahunyasayacumanurun (String nggaktahu, int sayaudahusaha) {
 this.nggaktahu = nggaktahu;
 this.sayaudahusaha = sayaudahusaha;
 }
 @Override
 public String toString() {
 return "Nama=" + nggaktahu + "No=" + sayaudahusaha + "";
 }
}
