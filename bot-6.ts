import { Client, Message } from "discord.js";

const client = new Client();

client.on("ready", () => {
  console.log(`Logged in as ${client.user.tag}!`);
});

client.on("message", (message: Message) => {
  if (message.content === "!help") {
    message.channel.send("Help!");
  }
});

client.login("YOUR_BOT_TOKEN_HERE");
