public class Hogwarts {
    int magicPower;
    int transgress;
    String name;

    public Hogwarts(String name,int magicPower, int transgress) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }
}
