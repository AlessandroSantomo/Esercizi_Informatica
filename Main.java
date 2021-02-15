public class Main {
    public static void main(String[] args) {

        Studente p1 = new Studente();
        p1.set_Sesso("m");
        p1.nome("Alessandro");
        p1.set_anni(15);
        p1.set_Numero_di_scarpe(40);

        System.out.println("Ciao, io sono "+p1.nome+".");
        System.out.println("Ho "+p1.get_anni()+" anni.");
        System.out.println("Sono di sesso "+p1.get_Sesso()+".");
        System.out.println("Di scarpe porto il numero "+ p1.get_Numero_di_scarpe()+".");


        //p1.Presentazione();





    }


}
