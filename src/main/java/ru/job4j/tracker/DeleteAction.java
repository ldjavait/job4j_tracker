package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output output;

    public DeleteAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        tracker.delete(id);
        Item item = tracker.findById(id);
        output.println(
                item == null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
        return true;
    }
}
