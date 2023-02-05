import discord

client = discord.Client()

@client.event
async def on_ready():
    print(f'Bot is ready, logged in as {client.user}.')

@client.event
async def on_message(message):
    if message.content == '!help':
        await message.channel.send('Help!')

client.run('YOUR_BOT_TOKEN_HERE')
