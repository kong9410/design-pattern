package project.personal.design.pattern.memento.caketaker;

import project.personal.design.pattern.memento.memento.EditorState;

import java.util.ArrayList;

public class History {
    private final ArrayList<EditorState> contents = new ArrayList<>();

    public void push(EditorState editorState) {
        contents.add(editorState);
    }

    public EditorState pop() {
        return contents.remove(contents.size() - 1);
    }
}
