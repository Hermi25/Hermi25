public class Bug {

    String opis;
    String email;
    int priorytet;
    boolean open = true;


    public Bug(String opis, String email, int priorytet) {
        this.opis = opis;
        this.email = email;
        this.priorytet = priorytet;

    }


    void printAllInfo() {
        System.out.println( "Bug" +
                " opis = '" + opis + '\'' +
                ", email = '" + email + '\'' +
                ", priorytet = " + priorytet +
                ", open = " + open +
                '}');
    }

    void printEmail(){
        System.out.println(email);
    }

    void printStatus(){
        System.out.println("Czy bug jest otwarty? : " + open);
    }

    public int getPriorytet() {
        return priorytet;
    }
}
