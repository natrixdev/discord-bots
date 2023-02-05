import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class HelpBot : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.message.contentRaw != "!help") {
            return
        }

        event.channel.sendMessage("Help!").queue()
    }
}

fun main() {
    JDABuilder.createDefault("YOUR_BOT_TOKEN_HERE")
        .addEventListeners(HelpBot())
        .build()
}
