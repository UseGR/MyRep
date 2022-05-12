package day13;

import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Александр");
        User user2 = new User("Татьяна");
        User user3 = new User("Николай");

        user1.sendMessage(user2, "Привет, Таня");
        user1.sendMessage(user2, "Как ты? Обустроилась на новом месте?");
        user2.sendMessage(user1, "Здравствуй, папа!");
        user2.sendMessage(user1, "У меня все хорошо, работа очень нравится, начальство лояльое, хорошо относится");
        user2.sendMessage(user1, "Коллектив большой и сплоченный, с этим очень повезло");
        user3.sendMessage(user1, "Приветствую, Александр");
        user3.sendMessage(user1, "Ваша дочь просто находка для нашей компании");
        user3.sendMessage(user1, "Нам очень повезло, что она пришла к нам, с таким опытом перед нами нет ничего невозможного");
        user1.sendMessage(user3, "Добрый день, Николай");
        user1.sendMessage(user3, "Мне очень приятно, что вы высоко цените квалификацию Татьяны");
        user1.sendMessage(user3, "Был рад пообщаться, Николай, но мне пора идти");
        user3.sendMessage(user1, "Всего доброго");

        showDialog(user1, user3);
    }
}
