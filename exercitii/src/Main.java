public class Main {
    public static void main(String[] args){
        DevTeam dev = new DevTeam("Dev", 5);
        HR hr = new HR("HR", 5);

        Membru membru1 = new Membru("JANNA", 21, 1, 2 );
        Membru membru2 = new Membru("MORGANA", 25, 20, 5 );
        Membru membru3 = new Membru("NAUTILIUS", 59, 30, 10 );
        Membru membru4 = new Membru("GRAVES", 29, 40, 3 );
        Membru membru5 = new Membru("AHRI", 21, 50, 0 );
        Membru membru6 = new Membru("ZED", 28, 60, 11 );
        Membru membru7 = new Membru("YONE", 26, 70, 7 );  /// report yone 0/10
        Membru membru8 = new Membru("SENNA", 23, 80, 3 );
        Membru membru9 = new Membru("LUCIAN", 24, 90, 6 );
        Membru membru10 = new Membru("DARIUS", 29, 100, 9 );

        System.out.println(dev.setLeader(membru1));
        System.out.println(dev.setLeader(membru6));
        System.out.println();
        hr.setLeader(membru9);

        dev.addMember(membru2);
        dev.addMember(membru4);
        dev.addMember(membru6);
        dev.addMember(membru8);
        dev.addMember(membru10);

        hr.addMember(membru1);
        hr.addMember(membru3);
        hr.addMember(membru5);
        hr.addMember(membru7);
        hr.addMember(membru9);

        System.out.println(dev.getCost());
        System.out.println(hr.getCost());
        System.out.println();
        System.out.println(dev.toString());
        System.out.println(hr.toString());
        System.out.println();
        System.out.println(dev.removeMember(membru4));
        System.out.println(dev.toString());
        System.out.println(dev.getCost());
    }
}