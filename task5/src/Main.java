import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем менеджер событий
        EventManager eventManager = new EventManager();

        // Создаем пользователей
        User user1 = new User("Александр");
        User user2 = new User("Дарья");

        // Подписываем пользователей на уведомления о событиях
        eventManager.subscribe(user1);
        eventManager.subscribe(user2);

        // Создаем события, на которые будут подписаны пользователи
        eventManager.createEvent("Важная встреча", "2023-10-15");
        eventManager.createEvent("Конференция по разработке", "2023-10-20");

        // Отменяем подписку одного из пользователей и создаем еще одно событие
        eventManager.unsubscribe(user1);
        eventManager.createEvent("Семинар по Java", "2023-10-25");
    }
}