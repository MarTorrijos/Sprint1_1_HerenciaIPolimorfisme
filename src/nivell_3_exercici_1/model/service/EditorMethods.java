package nivell_3_exercici_1.model.service;

import nivell_3_exercici_1.model.entity.Editor;
import java.util.ArrayList;

public class EditorMethods {

    public static ArrayList<Editor> editors = new ArrayList<>();
    public static boolean editorExists = false;

    public static boolean checkIfEditorExists(int editorId) {
        editorExists = false;
        if (editorId >= 0 && editorId < editors.size()) {
            editorExists = true;
        }
        return editorExists;
    }

    public static String createEditor(String name, String dni) {
        Editor editor = new Editor(name, dni);
        editors.add(editor);
        return "Editor " + name + " with DNI " + dni + " created";
    }

    public static String deleteEditor(int editorId) {
        String result = "Editor does not exist";

        if (checkIfEditorExists(editorId)) {
            Editor editorToDelete = editors.get(editorId);
            editors.remove(editorId);
            result = "Editor " + editorToDelete.getName() + " deleted";
        }
        return result;
    }

    public static String viewEditors() {
        StringBuilder result = new StringBuilder();
        int editorNumber = 1;

        for (Editor editor : editors) {
            result.append(editorNumber).append(" - ").append(editor.getName()).append(" - Salary of: ").append(editor.getSalary()).append("\n");
            editorNumber++;
        }
        return result.toString();
    }

}
