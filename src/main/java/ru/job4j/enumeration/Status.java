package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Принят") {
        @Override
        public String getMessage() {
            return "Автомобиль принят на СТО";
        }

    },
    IN_WORK("В работе") {
        @Override
        public String getMessage() {
            return "Автомобиль в работе";
        }
    },
    WAITING("Ожидание") {
        @Override
        public String getMessage() {
            return "Автомобиль ожидает запчасти";
        }
    },
    FINISHED("Работы завершены") {
        @Override
        public String getMessage() {
            return "Все работы завершены";
        }
    };
    private final String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public abstract String getMessage();
}
