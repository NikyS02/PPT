import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Trida {
    String zkratkaTridy;
    List<Student> Studenti;

    public Trida(String zkratkaTridy, List<Student> studenti) {
        this.zkratkaTridy = zkratkaTridy;
        Studenti = studenti;
    }

    public String getZkratkaTridy() {
        return zkratkaTridy;
    }

    public void setZkratkaTridy(String zkratkaTridy) {
        this.zkratkaTridy = zkratkaTridy;
    }

    public List<Student> getStudenti() {
        return Studenti;
    }

    public void setStudenti(List<Student> studenti) {
        Studenti = studenti;
    }
}
