package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistList1 = new ArrayList<>();
        List<MusicArtist> musicArtistList2 = new ArrayList<>();
        List<MusicArtist> musicArtistList3 = new ArrayList<>();

        musicArtistList1.add(new MusicArtist("Dan Reynolds", 34));
        musicArtistList1.add(new MusicArtist("Wayne Sermon", 37));
        musicArtistList1.add(new MusicArtist("Ben McKee", 37));
        musicArtistList1.add(new MusicArtist("Daniel Platzman", 35));

        musicArtistList2.add(new MusicArtist("Andy Fletcher", 60));
        musicArtistList2.add(new MusicArtist("Martin Gore", 60));
        musicArtistList2.add(new MusicArtist("Dave Gahan", 60));

        musicArtistList3.add(new MusicArtist("Rudolf Heinrich Schenker", 73));
        musicArtistList3.add(new MusicArtist("Klaus Meine", 73));
        musicArtistList3.add(new MusicArtist("Matthias Jabs", 66));
        musicArtistList3.add(new MusicArtist("Mikkey Dee", 58));

        MusicBand imagineDragons = new MusicBand("Imagine Dragons", 2008, musicArtistList1);
        MusicBand depecheMode = new MusicBand("Depeche Mode", 1980, musicArtistList2);
        MusicBand scorpions = new MusicBand("Scorpions", 1965, musicArtistList3);

        System.out.println(imagineDragons);
        System.out.println(depecheMode);
        MusicBand.transferMembers(imagineDragons, depecheMode);
        System.out.println(imagineDragons);
        System.out.println(depecheMode);


    }
}
