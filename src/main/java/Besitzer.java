import java.util.ArrayList;
public class Besitzer {
    //Anfang Atrribute
    private String name;

    private String ip;

    private ArrayList<String> geraet;
    // Ende Atrribute
    public Besitzer(String name, String ip, ArrayList<String> geraet) {
        this.name = name;
        this.ip = ip;
        this.geraet = geraet;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ArrayList<String> getGeraet() {
        return geraet;
    }

    public void setGeraet(ArrayList<String> geraet) {
        this.geraet = geraet;
    }

    @Override
    public String toString() {
        return "Besitzer{" + "name='" + name + '\'' + ", ip='" + ip + '\'' + ", geraet=" + geraet + '}';
    }
}

