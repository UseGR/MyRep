package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String bandName;
    private int bandYear;
    private List<MusicArtist> musicArtist;

    public MusicBand(String bandName, int bandYear, List<MusicArtist> musicArtist) {
        this.bandName = bandName;
        this.bandYear = bandYear;
        this.musicArtist = musicArtist;
    }

    public int getBandYear() {
        return bandYear;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "bandName='" + bandName + '\'' +
                ", bandYear=" + bandYear +
                ", musicArtist=" + musicArtist +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<MusicArtist> transferList = new ArrayList<>(musicBand1.getMembers());
        for (int i = 0; i < transferList.size(); i++)
            musicBand2.getMembers().add(transferList.get(i));


        for (int i = transferList.size() - 1; i >= 0; i--)
            musicBand1.getMembers().remove(i);
    }

    public void printMembers() {
        for (int i = 0; i < musicArtist.size(); i++)
            System.out.println(musicArtist.get(i));
    }

    public List<MusicArtist> getMembers() {
        return musicArtist;
    }
}