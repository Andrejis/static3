//znovu static trieda - class ......{


class InfoOblubene {

    private static String aOblubenyJazyk;

    private static String aOblubeneVydavatelstvo;

    private static String aOblubelnyZaner;



    static {

        aOblubenyJazyk = "slovenský";

        aOblubeneVydavatelstvo = "Slovart";

        aOblubelnyZaner = "dobrodružný";

    }



    public InfoOblubene() {



    }



    public static String getaOblubenyJazyk() {

        return aOblubenyJazyk;

    }



    public static void setaOblubenyJazyk(String aOblubenyJazyk) {

        InfoOblubene.aOblubenyJazyk = aOblubenyJazyk;

    }



    public static String getaOblubeneVydavatelstvo() {

        return aOblubeneVydavatelstvo;

    }



    public static void setaOblubeneVydavatelstvo(String aOblubeneVydavatelstvo) {

        InfoOblubene.aOblubeneVydavatelstvo = aOblubeneVydavatelstvo;

    }



    public static String getaOblubelnyZaner() {

        return aOblubelnyZaner;

    }



    public static void setaOblubelnyZaner(String aOblubelnyZaner) {

        InfoOblubene.aOblubelnyZaner = aOblubelnyZaner;

    }



}