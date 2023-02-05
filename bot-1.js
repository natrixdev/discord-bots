// Here is an example code to create a simple Discord bot that responds to the "!help" command with the message "Help!":


const Discord = require('discord.js');
const client = new Discord.Client();

client.on('ready', () => {
  console.log(`Logged in as ${client.user.tag}!`);
});

client.on('message', msg => {
  if (msg.content === '!help') {
    msg.reply('Help!');
  }
});

client.login('your_token_here');
