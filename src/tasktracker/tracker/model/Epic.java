package tracker.model;

import java.util.ArrayList;
import java.util.List;
import tracker.Status;

public class Epic extends Task {
    private final List<Integer> subtaskIds = new ArrayList<>();

    public Epic(String title, String description, int id) {
        super(title, description, id, Status.NEW);
    }

    public List<Integer> getSubtaskIds() {
        return subtaskIds;
    }

    public void addSubtaskId(int subtaskId) {
        subtaskIds.add(subtaskId);
    }

    public void clearSubtasks() {
        subtaskIds.clear();
    }

    @Override
    public String toString() {
        return "Эпик{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", подзадачи=" + subtaskIds +
                '}';
    }
}