package be.vinci;

public class Text {

    private int id;
    private String content;
    private Level level;

    public Text(int id, String content , Level level) {
        this.id = id;
        this.content = content;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    private enum Level {
        EASY,
        MEDIUM,
        HARD
    }
}
