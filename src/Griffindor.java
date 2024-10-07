public class Griffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

    public Griffindor(String name, int magicPower, int transgress, int nobility, int honor, int bravery) {
        super(name, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "name='" + name + '\'' +
                ", transgress=" + transgress +
                ", magicPower=" + magicPower +
                ", bravery=" + bravery +
                ", honor=" + honor +
                ", nobility=" + nobility +
                '}';
    }
}
