package coursework.listofgames.main;

import coursework.listofgames.module.bot.ManagerBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class GameBotStarter {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new ManagerBot());
            System.out.println("Bot started successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}