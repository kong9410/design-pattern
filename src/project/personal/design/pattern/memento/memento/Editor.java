package project.personal.design.pattern.memento.memento;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState storeInMemento() {
        return new EditorState(content);
    }

    public String restore(EditorState editorState) {
        content = editorState.getContent();

        return content;
    }
}
