public class Hufflepuff extends Hogwarts{
    int hardworking;
    int loyal;
    int honest;

    public Hufflepuff(String name, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + name + '\'' +
                ", transgress=" + transgress +
                ", magicPower=" + magicPower +
                ", honest=" + honest +
                ", loyal=" + loyal +
                ", hardworking=" + hardworking +
                '}';
    }
}
