public class Slytherin extends Hogwarts{
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(String name,int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name='" + name + '\'' +
                ", transgress=" + transgress +
                ", magicPower=" + magicPower +
                ", thirstForPower=" + thirstForPower +
                ", resourcefulness=" + resourcefulness +
                ", ambition=" + ambition +
                ", determination=" + determination +
                ", cunning=" + cunning +
                '}';
    }
}
