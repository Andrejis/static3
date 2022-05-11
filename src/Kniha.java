public class Kniha {

    private String aNazov;

    private int aID;



    private static int aPocetKnih = 0;

    private static String aMajitel = "Marián Daniš";



    private  String aOblubenyJazyk;

    private  String aOblubeneVydavatelstvo;

    private  String aOblubelnyZaner;



    public Kniha(String aNazov, int aID, String aOblubenyJazyk, String aOblubeneVydavatelstvo, String aOblubelnyZaner) {

        this.aNazov = aNazov;

        this.aID = aID;

        this.aOblubenyJazyk = aOblubenyJazyk;

        this.aOblubeneVydavatelstvo = aOblubeneVydavatelstvo;

        this.aOblubelnyZaner = aOblubelnyZaner;

        aPocetKnih++;



        if(!aOblubenyJazyk.equals("slovenský") || !aOblubeneVydavatelstvo.equals("Slovart") || !aOblubelnyZaner.equals("dobrodružný")){

            System.out.println( "Kniha " + aNazov + " nie je podľa mojích preferencíí !");

        }

    }



    public String getaNazov() {

        return aNazov;

    }



    public void setaNazov(String aNazov) {

        this.aNazov = aNazov;

    }



    public int getaID() {

        return aID;

    }



    public void setaID(int aID) {



        this.aID = aID;

    }



    public static int getaPocetKnih() {

        return aPocetKnih;

    }



    public static void setaPocetKnih(int aPocetKnih) {

        Kniha.aPocetKnih = aPocetKnih;

    }



    public static String getaMajitel() {

        return aMajitel;

    }



    public static void setaMajitel(String aMajitel) {

        Kniha.aMajitel = aMajitel;

    }



    public String getaOblubenyJazyk() {

        return aOblubenyJazyk;

    }



    public void setaOblubenyJazyk(String aOblubenyJazyk) {

        this.aOblubenyJazyk = aOblubenyJazyk;

    }



    public String getaOblubeneVydavatelstvo() {

        return aOblubeneVydavatelstvo;

    }



    public void setaOblubeneVydavatelstvo(String aOblubeneVydavatelstvo) {

        this.aOblubeneVydavatelstvo = aOblubeneVydavatelstvo;

    }



    public String getaOblubelnyZaner() {

        return aOblubelnyZaner;

    }



    public void setaOblubelnyZaner(String aOblubelnyZaner) {

        this.aOblubelnyZaner = aOblubelnyZaner;

    }



    public void VypisInfo(){

        System.out.println("Kniha " + aNazov + ", ktorú napísal " + aMajitel + " je v poradi " + aID + " z celkových " + aPocetKnih + " kníh.");

    }

    public static void StatickaMetoda(){

        System.out.println("------------------------");

        System.out.println("Majiteľ: " + aMajitel);

        System.out.println("Počet kníh: " + aPocetKnih);

    }

}
