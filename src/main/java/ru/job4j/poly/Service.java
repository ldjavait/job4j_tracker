package ru.job4j.poly;

/**
 * 1. Что такое полиморфизм. [#3819 #252056]
 */
public class Service {
    private final Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStore fileStore = new FileStore();
        MemStore memStore = new MemStore();
        Service fileService = new Service(fileStore);
        fileService.add();
        Service memService = new Service(memStore);
        memService.add();
        System.out.println(memStore.read());
        System.out.println(fileStore.read());
    }
}
