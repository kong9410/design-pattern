package project.personal.design.pattern.memento.memento;

public class EditorState {
    private final String content;

    protected EditorState(String content) {
        this.content = content;
    }

    protected String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "EditorState{" +
                "content='" + content + '\'' +
                '}';
    }
}
