class DevTeam extends echipa {
    public DevTeam(String name, int max) {
        super(name, max);
    }

    private double getCostMember(Membru member){
        int exp = member.getExp();
        if(member.equals(lider))
            return (double) 250 * (2500 + exp * 250);
        if (exp >= 2 && exp <= 5)
            return (double) 1500 + (double) 25 / 100 * 1500;
        else if (exp > 5)
            return (double) 1500 + (double) 50 / 100 * 1500;
        return 1500.0;
    }

    public double getCost() {
        double suma = 0.0;
        for (Membru member : membri) {
            suma = suma + getCostMember(member);
        }
        return suma;
    }
}