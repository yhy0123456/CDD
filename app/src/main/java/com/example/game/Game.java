package com.example.game;

import com.example.game.Card;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;//玩家名
    private Deck deck;    //牌堆

    //初始化玩家和牌堆
    public Game(List<String> playerNames) {
        players = new ArrayList<>();
        for (String name : playerNames) {
            players.add(new Player(name));
        }
        deck = new Deck();
    }

    //发牌
    public void dealCards() {
        for (Player player : players) {
            for (int i = 0; i < 13; i++) {
                Card card = deck.drawCard();
                if (card != null) {
                    player.addCardToHand(card);
                }
            }
        }
    }
    //获取牌堆
    public Deck getDeck() {
        return deck;
    }
    //获取玩家
    public List<Player> getPlayers() {
        return players;
    }
}
