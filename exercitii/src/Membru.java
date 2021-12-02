public class Membru {
    private String nume;
    private int varsta;
    private int salariu;
    protected int exp;

    public int getExp() {
        return exp;
    }

    public Membru(String n, int v, int s, int xp){
        nume = n;
        varsta = v;
        salariu = s;
        exp = xp;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Membru)
            return (((Membru) obj).nume == nume);
        else return false;
    }

    public String toString() {
        return nume;
    }
}