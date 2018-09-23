import com.treehouse.Machine;
import com.treehouse.model.SongBook;


public class Karoke {
    public  static void main(String[] args) {
        SongBook songBook = new SongBook();
        songBook.importFrom("songs.txt");
        Machine machine = new Machine(songBook);
        machine.run();
        System.out.println("Saving book. . . .");
        songBook.exportTo("songs.txt");
    }
}
