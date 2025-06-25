import tracker.Status;
import tracker.model.*;
import tracker.controllers.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Переезд", "Собрать вещи", 0, Status.NEW);
        Task task2 = new Task("Учёба", "Выучить Java", 0, Status.IN_PROGRESS);
        manager.createTask(task1);
        manager.createTask(task2);

        Epic epic1 = new Epic("Организация вечеринки", "Подготовка ко дню рождения", 0);
        manager.createEpic(epic1);
        Subtask sub1 = new Subtask("Купить торт", "Выбрать в магазине", 0, Status.NEW, epic1.getId());
        Subtask sub2 = new Subtask("Позвать гостей", "Разослать приглашения", 0, Status.NEW, epic1.getId());
        manager.createSubtask(sub1);
        manager.createSubtask(sub2);

        Epic epic2 = new Epic("Ремонт", "Кухня", 0);
        manager.createEpic(epic2);
        Subtask sub3 = new Subtask("Покрасить стены", "Выбрать цвет", 0, Status.DONE, epic2.getId());
        manager.createSubtask(sub3);

        System.out.println("\nВсе задачи:");
        manager.getAllTasks().forEach(System.out::println);

        System.out.println("\nВсе эпики:");
        manager.getAllEpics().forEach(System.out::println);

        System.out.println("\nВсе подзадачи:");
        manager.getAllSubtasks().forEach(System.out::println);

        sub1.setStatus(Status.DONE);
        manager.updateSubtask(sub1);
        sub2.setStatus(Status.DONE);
        manager.updateSubtask(sub2);

        System.out.println("\nПосле обновления подзадач:");
        System.out.println(epic1);

        manager.deleteTaskById(task1.getId());
        manager.deleteEpicById(epic2.getId());

        System.out.println("\nПосле удаления задачи и эпика:");
        manager.getAllTasks().forEach(System.out::println);
        manager.getAllEpics().forEach(System.out::println);
        manager.getAllSubtasks().forEach(System.out::println);
    }
}