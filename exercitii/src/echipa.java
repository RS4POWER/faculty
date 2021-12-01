import java.util.ArrayList;

public abstract class echipa {
    private Membru lider;
    private ArrayList<Membru> membri = new ArrayList<Membru>();
    private String nume;
    private int nrmax;
    private int nr;

    public echipa (String n, int max){
        nume =n;
        nrmax = max;
    }

    public boolean addMember(Membru member){
if(nr >= nrmax)
    return false;
membri.add(member);
return true;
}

public boolean setLeader(Membru LiderNou){
        if(LiderNou.getExp() <5)
            return false;
        lider=LiderNou;
        return true;
}
public Membru removeMember(Membru member){
        if(membri.remove(member))
            return member;
        return null;
}
public String toString()
{
   String aux = "";
   for(Membru max:membri )
       aux= aux+ max.toString();
     return ("Lider echipa: " + lider.NP + " "+membri);
}
}
