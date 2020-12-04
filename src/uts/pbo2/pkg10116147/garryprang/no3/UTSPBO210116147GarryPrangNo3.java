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
public class UTSPBO210116147GarryPrangNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MusicGenre mg = new MusicGenre();
        
        Rnb rnb = new Rnb();
        
        mg.setArtistName("Jimmy Hendrix");
        rnb.genreBlues(mg.getArtistName());
        mg.setArtistName("Chad Baker");
        rnb.genreJazz(mg.getArtistName());
        
        Rockabilly rbl = new Rockabilly();
        mg.setArtistName("Elvis Presley");
        rbl.genreRockabilly(mg.getArtistName());
        
        HardRock hr = new HardRock();
        mg.setArtistName("Dream Theater");
        hr.genreProgressiveRock(mg.getArtistName());
        mg.setArtistName("The Doors");
        hr.genrePsychedelicRock(mg.getArtistName());
        mg.setArtistName("Kiss");
        hr.genrePopRock(mg.getArtistName());
        
        Metal m = new Metal();
        mg.setArtistName("MXPX");
        m.genrePunk(mg.getArtistName());
        mg.setArtistName("Metallica");
        m.genreHeavyMetal(mg.getArtistName());
        
        Grindcore gm = new Grindcore();
        mg.setArtistName("Mesin Tempur");
        gm.genreGrindcore(mg.getArtistName());
        
        DeathMetal dm = new DeathMetal();
        mg.setArtistName("JASAD");
        dm.genreDeathMetal(mg.getArtistName());
        
        DeathCoreKepiting dck = new DeathCoreKepiting();
        mg.setArtistName("Revenge the Fate");
        dck.genreDeathCoreKepiting(mg.getArtistName());
        
        BlackMetal bm = new BlackMetal();
        mg.setArtistName("Behemoth");
        bm.genreBlackMetal(mg.getArtistName());
        
        NewSkul ns = new NewSkul();
        mg.setArtistName("HATEBREED");
        ns.genreNewSkul(mg.getArtistName());
    }
    
}
