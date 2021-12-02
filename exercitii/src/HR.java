class HR extends echipa {
    public HR(String name, int max) {
        super(name, max);
    }

    private double getCostMember(Membru member) {
        int exp = member.getExp();

        if(member.equals(lider))
            return (double) 1350 + exp * 300;
        if (exp >= 2 && exp <= 5)
            return (double) 1000 + (double) 25 / 100 * 1000;
        else if (exp > 5)
            return (double) 1000 + (double) 50 / 100 * 1000;
        return 1000.0;
    }

    public double getCost() {
        double s = 0.0;
        for (Membru member : membri) {
            s = s + getCostMember(member);
        }
        return s;
    }
}