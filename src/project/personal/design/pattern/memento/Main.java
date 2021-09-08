package project.personal.design.pattern.memento;

import project.personal.design.pattern.memento.caketaker.History;
import project.personal.design.pattern.memento.memento.Editor;
import project.personal.design.pattern.memento.memento.EditorState;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("test1");

        EditorState test1 = editor.storeInMemento();

        History history = new History();
        history.push(test1);

        editor.setContent("test2");
        EditorState test2 = editor.storeInMemento();
        history.push(test2);

        editor.setContent("test3");
        EditorState test3 = editor.storeInMemento();
        history.push(test3);

        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.pop());
    }
}
