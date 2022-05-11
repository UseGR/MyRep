package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String bandName;
    private int bandYear;
    private List<String> singerName;

    public MusicBand(String bandName, int bandYear, List<String> singerName) {
        this.bandName = bandName;
        this.bandYear = bandYear;
        this.singerName = singerName;
    }

    public int getBandYear() {
        return bandYear;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "bandName='" + bandName + '\'' +
                ", bandYear=" + bandYear +
                ", singerName=" + singerName +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<String> transferList = new ArrayList<>(musicBand1.getMembers());
        for (int i = 0; i < transferList.size(); i++)
            musicBand2.getMembers().add(transferList.get(i));


        for (int i = transferList.size() - 1; i >= 0; i--)
            musicBand1.getMembers().remove(i);
    }

    public void printMembers() {
        for (int i = 0; i < singerName.size(); i++)
            System.out.println(singerName.get(i));
    }

    public List<String> getMembers() {
        return singerName;
    }
}