public class HogwartsBook {

    public static void comparisonOfGryffindor(Griffindor firstStudent, Griffindor secondStudent) {
        int firstStudentScores = firstStudent.getHonor() + firstStudent.getBravery() + firstStudent.getNobility();
        int secondStudentScores = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();
        if (firstStudentScores > secondStudentScores) {
            System.out.println(firstStudent.getName() + " лучший гриффиндорец, чем " + secondStudent.getName());
        } else if (firstStudentScores < secondStudentScores) {
            System.out.println(secondStudent.getName() + " лучший гриффиндорец, чем " + firstStudent.getName());
        } else {
            System.out.println("Оба молодцы");
        }

    }

    public static void comparisonOfHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentScores = firstStudent.getHardworking() + firstStudent.getHonest() + firstStudent.getLoyal();
        int secondStudentScores = secondStudent.getHardworking() + secondStudent.getHonest() + secondStudent.getLoyal();
        if (firstStudentScores > secondStudentScores) {
            System.out.println(firstStudent.getName() + " лучший пуффендуец, чем " + secondStudent.getName());
        } else if (firstStudentScores < secondStudentScores) {
            System.out.println(secondStudent.getName() + " лучший пуффендуец, чем " + firstStudent.getName());
        } else {
            System.out.println("Оба молодцы");
        }

    }

    public static void comparisonOfRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentScores = firstStudent.getCreativity() + firstStudent.getSmart() + firstStudent.getWise() + firstStudent.getWitty();
        int secondStudentScores = secondStudent.getCreativity() + secondStudent.getSmart() + secondStudent.getWise() + secondStudent.getWitty();
        if (firstStudentScores > secondStudentScores) {
            System.out.println(firstStudent.getName() + " лучший когтевранец, чем " + secondStudent.getName());
        } else if (firstStudentScores < secondStudentScores) {
            System.out.println(secondStudent.getName() + " лучший когтевранец, чем " + firstStudent.getName());
        } else {
            System.out.println("Оба молодцы");
        }

    }

    public static void comparisonOfSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentScores = firstStudent.getAmbition() + firstStudent.getCunning() + firstStudent.getDetermination() + firstStudent.getResourcefulness() + firstStudent.getThirstForPower();
        int secondStudentScores = secondStudent.getAmbition() + secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getResourcefulness() + secondStudent.getThirstForPower();
        if (firstStudentScores > secondStudentScores) {
            System.out.println(firstStudent.getName() + " лучший слизеринец, чем " + secondStudent.getName());
        } else if (firstStudentScores < secondStudentScores) {
            System.out.println(secondStudent.getName() + " лучший слизеринец, чем " + firstStudent.getName());
        } else {
            System.out.println("Оба молодцы");
        }

    }

    public static void printStudent(Hogwarts student) {
        System.out.println(student);
    }

    public static void comparingStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstStudentScores = firstStudent.getTransgress() + firstStudent.getMagicPower();
        int secondStudentScores = secondStudent.getTransgress() + secondStudent.getMagicPower();
        if (firstStudentScores > secondStudentScores) {
            System.out.println(firstStudent.getName() + " обладает бОльшей мощностью магии, чем " + secondStudent.getName());
        } else if (firstStudentScores < secondStudentScores) {
            System.out.println(firstStudent.getName() + " обладает меньшей мощностью магии, чем " + secondStudent.getName());
        } else {
            System.out.println("Оба молодцы");
        }
    }
}
