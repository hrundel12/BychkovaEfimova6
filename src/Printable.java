interface Printable {
    String getTitle();
}

// Класс Magazine, реализующий интерфейс Printable
class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println("Журнал: " + printable.getTitle());
            }
        }
    }
}