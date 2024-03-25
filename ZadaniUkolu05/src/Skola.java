import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Skola {
    List<Trida> tridy;

    public Skola(List<Trida> tridy) {
        this.tridy = tridy;
    }

    public List<Trida> getTridy() {
        return tridy;
    }

    public void setTridy(List<Trida> tridy) {
        this.tridy = tridy;
    }

    public void nactiStudenty(String soubor) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(soubor));
        String line;
        String zkratka = "";
        List<Student> studenti = new ArrayList<>();
        while((line = br.readLine()) != null){
            line.replaceAll("\\s","");
            if(line == "") return;
            if(!line.contains(";") && zkratka == ""){
                zkratka = line;
                return;
            }else{
                tridy.add(new Trida(zkratka,studenti));
                zkratka = line;
                studenti.clear();
            }
            String[] data = line.split(";");
            studenti.add(new Student(data[0],data[1]));
        }
        br.close();

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
