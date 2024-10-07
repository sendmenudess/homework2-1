public class Ravenclaw extends Hogwarts {
    int smart;
    int wise;
    int witty;
    int creativity;

    public Ravenclaw(String name, int magicPower, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWitty() {
        return witty;
    }

    public int getWise() {
        return wise;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + name + '\'' +
                ", transgress=" + transgress +
                ", magicPower=" + magicPower +
                ", creativity=" + creativity +
                ", witty=" + witty +
                ", wise=" + wise +
                ", smart=" + smart +
                '}';
    }
}
