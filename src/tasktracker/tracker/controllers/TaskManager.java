package tracker.controllers;

import tracker.model.*;
import java.util.List;

public interface TaskManager {
    int createTask(Task task);
    int createEpic(Epic epic);
    int createSubtask(Subtask subtask);

    void updateTask(Task task);
    void updateEpic(Epic epic);
    void updateSubtask(Subtask subtask);

    void deleteTaskById(int id);
    void deleteEpicById(int id);
    void deleteSubtaskById(int id);

    void deleteTasks();
    void deleteSubtasks();
    void deleteEpics();

    List<Task> getAllTasks();
    List<Epic> getAllEpics();
    List<Subtask> getAllSubtasks();

    Task getTask(int id);
    Epic getEpic(int id);
    Subtask getSubtask(int id);
    List<Subtask> getEpicSubtasks(int epicId);

    List<Task> getHistory();
}
