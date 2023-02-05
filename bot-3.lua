local discordia = require('discordia')
local client = discordia.Client()

client:on('ready', function()
    print('Bot is ready, logged in as ' .. client.user.username)
end)

client:on('messageCreate', function(message)
    if message.content == '!help' then
        message.channel:send('Help!')
    end
end)

client:run('YOUR_BOT_TOKEN_HERE')
