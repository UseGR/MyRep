package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> singerName1 = new ArrayList<>();
        singerName1.add("Dan Reynolds");
        singerName1.add("Wayne Sermon");
        singerName1.add("Ben McKee");
        singerName1.add("Daniel Platzman");

        List<String> singerName2 = new ArrayList<>();
        singerName2.add("Andy Fletcher");
        singerName2.add("Martin Gore");
        singerName2.add("Dave Gahan");

        List<String> singerName3 = new ArrayList<>();
        singerName3.add("Rudolf Heinrich Schenker");
        singerName3.add("Klaus Meine");
        singerName3.add("Matthias Jabs");
        singerName3.add("Mikkey Dee");

        MusicBand imagineDragons = new MusicBand("Imagine Dragons", 2008, singerName1);
        MusicBand depecheMode = new MusicBand("Depeche Mode", 1980, singerName2);
        MusicBand scorpions = new MusicBand("Scorpions", 1965, singerName3);

        System.out.println(imagineDragons);
        System.out.println(depecheMode);
        System.out.println(scorpions);
        System.out.println("-----------");

        MusicBand.transferMembers(depecheMode, scorpions);
        System.out.println(depecheMode);
        System.out.println(scorpions);






    }
}
