/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pbo2.pkg10116147.garryprang.no3;

/**
 *
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan musisi dan genre musiknya (UTS No. 3)
 *
 */
public class Rnb implements Jazz,Blues
{
    public void genreJazz(String artistName)
    {
        System.out.println(artistName + " adalah musisi Jazz");
    }
    
    public void genreBlues(String artistName)
    {
        System.out.println(artistName + " adalah musisi Blues");
    }
}
