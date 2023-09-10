package ru.job4j.tracker;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    /**
     * Инициализирует приложение и запускает выполнение различных пользовательских действий
     *
     * @param input   input
     * @param tracker tracker
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Выводит на экран меню доступных пользовательских действий
     */
    private void showMenu(UserAction[] actions) {
        output.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            output.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new EditAction(out),
                new ShowAllAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
    }
}
