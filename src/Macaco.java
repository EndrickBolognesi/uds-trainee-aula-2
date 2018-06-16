public class Macaco extends Animal {
    Integer banana = 0;

    public void comerBanana(){
        this.banana += 1;
    }


    @Override
    public void andar() {
        this.velocidade += 2;
    }
}
