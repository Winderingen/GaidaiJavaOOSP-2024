public class User implements Observer{
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Event event) {
        System.out.println("Пользователь " + userName + " получил уведомление о событии: "
                + event.getName() + " на дату: " + event.getDate());
    }
}
