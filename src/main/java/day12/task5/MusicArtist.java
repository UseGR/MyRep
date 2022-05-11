package day12.task5;

public class MusicArtist {
    private String singerName;
    private int singerAge;

    public MusicArtist(String singerName, int singerAge) {
        this.singerName = singerName;
        this.singerAge = singerAge;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "singerName='" + singerName + '\'' +
                ", singerAge=" + singerAge +
                '}';
    }
}
