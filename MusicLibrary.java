import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {

    private List<Song> songs; // A list to hold the songs in the music library
    private Random random;    // For selecting a random song

    // Constructor to initialize the MusicLibrary with an empty list of songs and a Random object
    public MusicLibrary() {
        this.songs = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Adds a song to the music library.
     *
     * @param song The Song object to be added.
     */
    public void addSong(Song song) {
        if (song != null) {
            this.songs.add(song);
            System.out.println(song.getTitle() + " by " + song.getArtist() + " has been added to the library.");
        } else {
            System.out.println("Cannot add a null song.");
        }
    }

    /**
     * Removes a song from the music library based on its title.
     *
     * @param title The title of the song to be removed.
     */
    public void removeSong(String title) {
        // Iterate through the list of songs to find the song with the given title
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getTitle().equalsIgnoreCase(title)) {
                Song removedSong = this.songs.remove(i);
                System.out.println(removedSong.getTitle() + " by " + removedSong.getArtist() + " has been removed from the library.");
                return; // Exit the method once the song is found and removed
            }
        }
        System.out.println("Song with title '" + title + "' not found in the library.");
    }

    /**
     * Plays a random song from the music library.
     * If the library is empty, it prints a message.
     */
    public void playRandomSong() {
        if (this.songs.isEmpty()) {
            System.out.println("The music library is empty. Please add some songs to play.");
            return;
        }

        // Generate a random index within the bounds of the songs list
        int randomIndex = random.nextInt(this.songs.size());

        // Get the song at the random index
        Song randomSong = this.songs.get(randomIndex);

        // Print the information of the song being played
        System.out.println("\nNow playing a random song:");
        System.out.println("Title: " + randomSong.getTitle());
        System.out.println("Artist: " + randomSong.getArtist());
        System.out.println("Genre: " + randomSong.getGenre());
    }

    /**
     * Displays all the songs currently in the music library.
     */
    public void displaySongs() {
        if (this.songs.isEmpty()) {
            System.out.println("The music library is empty.");
        } else {
            System.out.println("\nSongs in the music library:");
            for (Song song : this.songs) {
                System.out.println("- Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
            }
        }
    }

    public static void main(String[] args) {
        // Create a new MusicLibrary object
        MusicLibrary library = new MusicLibrary();

        // Create some Song objects
        Song song1 = new Song("Bohemian Rhapsody", "Queen", "Rock");
        Song song2 = new Song("Imagine", "John Lennon", "Pop");
        Song song3 = new Song("Hotel California", "Eagles", "Rock");
        Song song4 = new Song("Billie Jean", "Michael Jackson", "Pop");

        // Add songs to the library
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addSong(null); // Try adding a null song

        // Display all songs in the library
        library.displaySongs();

        // Play a random song
        library.playRandomSong();
        library.playRandomSong(); // Play another random song

        // Remove a song
        library.removeSong("Imagine");

        // Display the songs after removal
        library.displaySongs();

        // Try to play a random song after removal
        library.playRandomSong();

        // Remove a song that doesn't exist
        library.removeSong("Stairway to Heaven");

        // Create an empty library and try to play a random song
        MusicLibrary emptyLibrary = new MusicLibrary();
        emptyLibrary.playRandomSong();
    }
}

// A simple Song class to represent a song with a title, artist, and genre
class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
}