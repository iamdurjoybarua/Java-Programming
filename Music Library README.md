# Simple Music Library System in Java

This repository contains a basic Java program that simulates a simple music library. It includes two main classes: `MusicLibrary` to manage a collection of songs and `Song` to represent individual songs.

## Overview

The system consists of the following classes:

-   **`MusicLibrary`**: This class manages a list of `Song` objects. It provides functionalities to:
    -   Add new songs to the library.
    -   Remove songs from the library based on their title.
    -   Play a random song from the library.
    -   Display all songs currently in the library.
-   **`Song`**: This class represents a song with a title, artist, and genre.

The `main` method within the `MusicLibrary` class demonstrates the usage of these functionalities by creating a music library, adding some songs, displaying them, playing random songs, removing a song, and then displaying the updated library.

## Getting Started

To run this program, you need to have Java Development Kit (JDK) installed on your system.

1.  **Save the code:** Save the provided Java code into two files: `MusicLibrary.java` and `Song.java` in the same directory.
2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the files, and compile the Java files using the following command:

    ```bash
    javac MusicLibrary.java Song.java
    ```

    This will generate `MusicLibrary.class` and `Song.class` files.
3.  **Run the program:** Execute the `MusicLibrary` class using the following command:

    ```bash
    java MusicLibrary
    ```

    This will run the `main` method in the `MusicLibrary` class and you will see the output in your console.

## Functionality

### Creating a MusicLibrary Object

The `MusicLibrary` class constructor initializes a new music library with an empty list of songs and a `Random` object for playing random songs.

```java
public MusicLibrary() {
    this.songs = new ArrayList<>();
    this.random = new Random();
}
```

**Usage:**

```java
MusicLibrary myLibrary = new MusicLibrary();
```

### Adding Songs

The `addSong(Song song)` method adds a `Song` object to the music library's list of songs. It checks if the provided song is not null before adding it.

```java
public void addSong(Song song) {
    if (song != null) {
        this.songs.add(song);
        System.out.println(song.getTitle() + " by " + song.getArtist() + " has been added to the library.");
    } else {
        System.out.println("Cannot add a null song.");
    }
}
```

**Usage:**

```java
Song bohemianRhapsody = new Song("Bohemian Rhapsody", "Queen", "Rock");
myLibrary.addSong(bohemianRhapsody);
```

### Removing Songs

The `removeSong(String title)` method removes a song from the music library based on its title. It iterates through the list of songs and removes the first song it finds with a matching title (case-insensitive).

```java
public void removeSong(String title) {
    for (int i = 0; i < this.songs.size(); i++) {
        if (this.songs.get(i).getTitle().equalsIgnoreCase(title)) {
            Song removedSong = this.songs.remove(i);
            System.out.println(removedSong.getTitle() + " by " + removedSong.getArtist() + " has been removed from the library.");
            return; // Exit the method once the song is found and removed
        }
    }
    System.out.println("Song with title '" + title + "' not found in the library.");
}
```

**Usage:**

```java
myLibrary.removeSong("Imagine");
```

### Playing a Random Song

The `playRandomSong()` method selects and prints information about a random song from the library. If the library is empty, it prints a соответствующее message.

```java
public void playRandomSong() {
    if (this.songs.isEmpty()) {
        System.out.println("The music library is empty. Please add some songs to play.");
        return;
    }

    int randomIndex = random.nextInt(this.songs.size());
    Song randomSong = this.songs.get(randomIndex);

    System.out.println("\nNow playing a random song:");
    System.out.println("Title: " + randomSong.getTitle());
    System.out.println("Artist: " + randomSong.getArtist());
    System.out.println("Genre: " + randomSong.getGenre());
}
```

**Usage:**

```java
myLibrary.playRandomSong();
```

### Displaying Songs

The `displaySongs()` method displays the title, artist, and genre of all songs currently in the music library. If the library is empty, it prints a соответствующее message.

```java
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
```

**Usage:**

```java
myLibrary.displaySongs();
```

## `Song` Class

The `Song` class represents a song with a title, artist, and genre.

```java
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
```

## Example Usage

The `main` method in the `MusicLibrary` class demonstrates the creation of a music library, adding and removing songs, playing random songs, and displaying the library's contents.

```java
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
```

## Potential Enhancements

  - **Search Functionality:** Implement a feature to search for songs by title, artist, or genre.
  - **Play Specific Song:** Add a method to play a song by its title.
  - **Create Playlists:** Allow users to create and manage playlists of songs.
  - **Shuffle Mode:** Implement a shuffle mode that plays all songs in a random order without repetition until all have been played.
  - **Data Persistence:** Implement saving and loading the music library data to a file or database.
  - **User Interface:** Develop a command-line interface (CLI) or a graphical user interface (GUI) for easier interaction.
  - **Rating System:** Allow users to rate songs and sort or filter by rating.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
