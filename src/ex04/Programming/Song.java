package ex04.Programming;

class SongTest{
    String title;
    String artist;
    int length;

    public SongTest() {
		super();
	}
	public SongTest(String title) {
		super();
		this.title = title;
	}
	public SongTest(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	public SongTest(String title, String artist, int length) {
		super();
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
    @Override
    public String toString() {
        return "SongTest [title=" + title + ", artist=" + artist + ", length=" + length + "]";
    }
  
}

public class Song {
    public static void main(String[] args) {
        SongTest s1 = new SongTest("Outward Bound", "Nana", 180);
        SongTest s2 = new SongTest("Jambalya", "Carpenters", 0);
        SongTest s3 = new SongTest("Yesterday", null, 0);
        SongTest s4 = new SongTest(null, null, 0);
    }
}
