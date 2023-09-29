package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет пользователя в систему.
     *
     * @param user пользователь, которого добавляем.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Удаляет пользователя из системы.
     *
     * @param passport паспорт пользователя, которого нужно удалить.
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Добавляет новый счет к пользователю.
     *
     * @param passport паспорт пользователя.
     * @param account  аккаунт пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Осуществляет поиск пользователя по паспорту.
     *
     * @param passport паспорт пользователя, которого ищем.
     * @return возвращает пользователя, если пользователя нет - вернет null.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Осуществляет поиск по реквизитам.
     *
     * @param passport  паспорт пользователя, которого ищем.
     * @param requisite реквизиты пользователя, которого ищем.
     * @return возвращает пользователя, если пользователя нет - вернет null.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (requisite.equals(account.getRequisite())) {
                return account;
            }
        }
        return null;
    }

    /**
     * Для перечисления денег с одного счёта на другой счёт
     *
     * @param srcPassport   с какого паспорта.
     * @param srcRequisite  с каких реквизитов.
     * @param destPassport  на какой паспорт.
     * @param destRequisite на какие реквизиты.
     * @param amount        сумма.
     * @return true - если транзакция выполнена успешно.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null
                || srcAccount.getBalance() < amount) {
            return false;
        }
        destAccount.setBalance(destAccount.getBalance() + amount);
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        return true;
    }

    /**
     * Получает список аккаунтов пользователя.
     *
     * @param user пользователь
     * @return список аккаунтов.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
