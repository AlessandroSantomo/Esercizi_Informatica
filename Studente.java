public class Studente {

    public   String nome;
    private int anni;
    private String sesso;
    private int numero_di_scarpe;


    public void set_Sesso(String sesso_input) {
        if ( sesso_input == "m" || sesso_input == "f") {
            sesso = sesso_input;
        }
        else {
            System.out.println("La parola '"+sesso_input+"' non è ammessa come sesso, scegli tra 'm' ed 'f'.");
        }
    }
    public String get_Sesso() {
        return sesso;
    }

    public void nome(String nome_input) {
        nome=nome_input;
    }

    public void set_anni(int anni_input) {
        if ( anni_input >= 1 && anni_input <= 100) {
            anni = anni_input;
        }
        else {
            System.out.println("L'età inserita non valida");
        }
    }
    public int get_anni() {
        return anni;
    }

    public void set_Numero_di_scarpe(int Numero_di_scarpe_input) {
     if (sesso == "m") {
         if (Numero_di_scarpe_input >= 40 && Numero_di_scarpe_input <= 49) {
             numero_di_scarpe=Numero_di_scarpe_input;
         }
         else {
             System.out.println("Il numero di scarpa inserito non è valido, riprova. ");
         }
     }
     else {
         if (Numero_di_scarpe_input >= 35 && Numero_di_scarpe_input <= 43) {
             numero_di_scarpe=Numero_di_scarpe_input;
         }
         else {
             System.out.println("Il numero di scarpa inserito non è valido, riprova. ");
         }
     }
    }
    public int get_Numero_di_scarpe() {
        return numero_di_scarpe;
    }

    public void Presentazione(){
        System.out.println("Ciao, io sono "+nome+", ho "+anni+" anni, sono di sesso "+sesso+" e di scarpa porto il numero "
                +numero_di_scarpe+".");
    }

}
