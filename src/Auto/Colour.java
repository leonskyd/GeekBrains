package Auto;

public enum Colour {
    BLACK("черный"), RED("красный"),
    WHITE("белый"), BROWN("коричневый");

    Colour(String russianColor) {
        this.russianColor = russianColor;
    }

    private String russianColor;
    public String getRussian() {
        return russianColor;
    }
}
