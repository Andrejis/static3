public class Main {

    public static void main(String[] args) {

        Kniha k1 = new Kniha("CestyNecesty", 1, "slovenský", "Slovart", "dobrodružný");

        Kniha k2 = new Kniha("Väzby", 2, "anglický", "Ikarus", "romantický");



        System.out.println(Kniha.getaMajitel());



        k1.VypisInfo();

        k2.VypisInfo();



        k1.setaNazov("RituályČarodejok");



        Kniha.setaMajitel("Ahmed Asalaj Abdi");



        System.out.println(Kniha.getaMajitel());



        System.out.println(Kniha.getaPocetKnih());



        Kniha.StatickaMetoda();





    }

}
