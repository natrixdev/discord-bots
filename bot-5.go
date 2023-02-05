package main

import (
	"github.com/bwmarrin/discordgo"
)

func main() {
	dg, err := discordgo.New("Bot " + "YOUR_BOT_TOKEN_HERE")
	if err != nil {
		println("Error creating Discord session: ", err)
		return
	}

	dg.AddHandler(commandHandler)

	err = dg.Open()
	if err != nil {
		println("Error opening Discord session: ", err)
		return
	}

	defer dg.Close()

	<-make(chan struct{})
}

func commandHandler(s *discordgo.Session, m *discordgo.MessageCreate) {
	if m.Content == "!help" {
		s.ChannelMessageSend(m.ChannelID, "Help!")
	}
}
