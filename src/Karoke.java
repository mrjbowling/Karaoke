import com.treehouse.Machine;
import com.treehouse.model.SongBook;


public class Karoke {
    public  static void main(String[] args) {
        SongBook songBook = new SongBook();
        Machine machine = new Machine(songBook);
        machine.run();
    }
}
