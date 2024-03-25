import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Skola {
    List<Trida> tridy;

    public Skola() {
        tridy = new ArrayList<>();
    }

    public List<Trida> getTridy() {
        return tridy;
    }

    public void setTridy(List<Trida> tridy) {
        this.tridy = tridy;
    }

    public void nactiStudenty(String soubor) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(soubor));
            String line;
            String zkratka = "";
            List<Student> studenti = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                line.replaceAll("\\s", "");
                if (line.isBlank()) continue;
                if (!line.contains(";")) {
                    if (zkratka == "") {
                        zkratka = line;
                    } else {
                        tridy.add(new Trida(zkratka, studenti));
                        zkratka = line;
                        studenti.clear();
                    }
                    continue;
                }
                String[] data = line.split(";");
                studenti.add(new Student(data[0], data[1]));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Soubor neexistuje");
        }

    }

    public void nactiZnamky(String soubor) throws IOException {

    }

    public void exportTrid() {

    }

    public void vypoctiPrumer() {

    }

    public void exportVysledku(String soubor) throws IOException {

    }
}
