package tracker.model;

import tracker.Status;

public class Subtask extends Task {
    private final int epicId;

    public Subtask(String title, String description, int id, Status status, int epicId) {
        super(title, description, id, status);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    @Override
    public String toString() {
        return "Подзадача{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", epicId=" + epicId +
                '}';
    }
}