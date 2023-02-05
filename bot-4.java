import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpBot extends ListenerAdapter {
    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder("YOUR_BOT_TOKEN_HERE")
                .addEventListeners(new HelpBot())
                .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        if (!message.getContentDisplay().equals("!help")) {
            return;
        }

        MessageChannel channel = event.getChannel();
        channel.sendMessage("Help!").queue();
    }
}
