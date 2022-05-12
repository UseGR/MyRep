package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return (user.isSubscribed(this) & this.isSubscribed(user)); //пользователи "дружат" если подписаны друг на друга
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user,text);
    }

    @Override
    public String toString() {
        return userName;
    }
}
