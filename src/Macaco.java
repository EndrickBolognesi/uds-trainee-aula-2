public class Macaco extends Animal {
    Integer banana = 0;
    Integer bananasComidas = 0;

    public Integer comerBanana(){
        this.banana += 1;
        return this.banana;
    }
    public Integer setBananasComidas(){
        bananasComidas = comerBanana();
        return bananasComidas;
    }





}
