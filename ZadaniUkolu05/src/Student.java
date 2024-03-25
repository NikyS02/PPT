import java.util.Map;

public class Student {
    String jmeno;
    String prijmeni;
    Map<String, Integer> znamky;

    public Student(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Map<String, Integer> getZnamky() {
        return znamky;
    }

    public void setZnamky(Map<String, Integer> znamky) {
        this.znamky = znamky;
    }
}
