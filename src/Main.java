public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри Поттер",91, 87,53,64,63);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер",91, 75,75,46,86);
        Griffindor ronald = new Griffindor("Рон Уизли",53, 46,75,73,85);
        Slytherin draco = new Slytherin("Драко Малфой",81, 14, 52,74,52, 52, 21);
        Slytherin graham = new Slytherin("Грэхэм Монтегю",81, 14, 5,74,52, 52, 21);
        Slytherin gregory = new Slytherin("Грегори Гойл", 81, 14, 52,71,52, 52, 21);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 81, 14, 52,71,52, 52);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 81, 14, 52,71,52, 52);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 81, 14, 52,71,52, 52);
        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 81, 14, 52,71,52);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 81, 14, 52,70,52);
        Hufflepuff justin = new Hufflepuff("Седрик Диггори", 81, 14, 52,71,52);

        HogwartsBook.comparisonOfGryffindor(harry, hermione);
        HogwartsBook.comparisonOfHufflepuff(zakharia, justin);
        HogwartsBook.comparisonOfRavenclaw(marcus, padma);
        HogwartsBook.comparisonOfSlytherin(draco, gregory);
        HogwartsBook.printStudent(draco);
        HogwartsBook.comparingStudents(harry, draco);
    }


}