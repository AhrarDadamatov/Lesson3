import task24.MusicBand;

import java.util.*;

public class task25 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Asd",2007);
        MusicBand musicBand2 = new MusicBand("Asaas", 2007);
        MusicBand musicBand3 = new MusicBand("ADsda",2011);
        MusicBand musicBand4 = new MusicBand("ODsd",2015);
        MusicBand musicBand5 = new MusicBand("AFODA",2002);
        MusicBand musicBand6 = new MusicBand("Dasad",2020);
        MusicBand musicBand7 = new MusicBand("sdasd",2022);
        MusicBand musicBand8 = new MusicBand("FDjdsa",2023);
        MusicBand musicBand9 = new MusicBand("dFDS",2022);
        MusicBand musicBand10 = new MusicBand("DKSM",2005);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);
    }
}
