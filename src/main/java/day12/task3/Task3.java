package day12.task3;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand theBlackEyedPeas = new MusicBand("The Black Eyed Peas", 1992);
        MusicBand bonJovi = new MusicBand("Bon Jovi", 1983);
        MusicBand coldplay = new MusicBand("Coldplay",1996);
        MusicBand depecheMode = new MusicBand("Depeche Mode", 1980);
        MusicBand scorpions = new MusicBand("Scorpions", 1965);
        MusicBand lmfao = new MusicBand("LMFAO",2006);
        MusicBand t9 = new MusicBand("T9", 2007);
        MusicBand dashBerlin = new MusicBand("Dash Berlin", 2007);
        MusicBand serebro = new MusicBand("Serebro", 2006);
        MusicBand imagineDragons = new MusicBand("Imagine Dragons",2008);

        List<MusicBand> list = new ArrayList<>();
        list.add(theBlackEyedPeas);
        list.add(bonJovi);
        list.add(coldplay);
        list.add(depecheMode);
        list.add(scorpions);
        list.add(lmfao);
        list.add(t9);
        list.add(dashBerlin);
        list.add(serebro);
        list.add(imagineDragons);

        Collections.shuffle(list);
        System.out.println("Перемешанный список групп: " + list);
        System.out.println("Группы, основанные после 2000 года: " + groupsAfter2000(list));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> sortedList = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                sortedList.add(band);
        }
        return sortedList;
    }
}