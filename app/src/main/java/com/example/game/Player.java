package com.example.game;

import com.example.game.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;       //玩家名
    private List<Card> hand;   //玩家手牌

    //构造函数。初始化玩家名和手牌
    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    //将牌加入手牌
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    //出牌
    public void playCard() {//出牌
        System.out.println("请从手牌中选择要出的牌（输入牌的索引，多张牌以空格分隔）：");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(i + ": " + hand.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] indices = input.split(" ");

        List<Card> playedCards = new ArrayList<>();
        for (String indexStr : indices) {
            int index = Integer.parseInt(indexStr);

            while (index < 0 || index >= hand.size()) {
                System.out.println("输入的索引无效，请重新输入：");
                index = scanner.nextInt();
            }

            Card card = hand.remove(index);
            playedCards.add(card);
        }

        // 根据游戏规则处理出牌逻辑
        // ...

        System.out.println("出牌成功！出牌：");
        for (Card card : playedCards) {
            System.out.println(card);
        }
    }

    //获取玩家手牌
    public List<Card> getHand() {
        return hand;
    }

    //获取玩家名
    public String getName() {
        return name;
    }
}
