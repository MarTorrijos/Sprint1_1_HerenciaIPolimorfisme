package nivell_3_exercici_1.model.entity;

public abstract class Article {

    private String title;
    private String text = "";
    protected int score;
    protected int price;
    private Editor editor;

    public Article(String title, String text, Editor editor) {
        this.title = title;
        this.text = text;
        this.editor = editor;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public int getPrice() {
        return price;
    }

    public Editor getEditor() {
        return editor;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public abstract int scoreTotal();

    public abstract int priceTotal();

}
