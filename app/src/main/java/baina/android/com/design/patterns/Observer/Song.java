package baina.android.com.design.patterns.Observer;

public class Song {

    private String title;
    private String singer;
    private long seek;

    public Song(String title, String singer, long seek) {
        this.title = title;
        this.singer = singer;
        this.seek = seek;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public long getSeek() {
        return seek;
    }

    public void setSeek(long seek) {
        this.seek = seek;
    }

    @Override
    public String toString() {
        return "title: " + title + " singer: " + singer + " seek: " + String.valueOf(seek);
    }
}