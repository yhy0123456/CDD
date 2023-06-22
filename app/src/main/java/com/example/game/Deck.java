package com.example.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards;//牌堆中的牌

    public Deck() {
        cards = new ArrayList<>();
        //创建牌堆中的牌
        for (Suit suit : Suit.values()) {          //遍历花色
            for (Rank rank : Rank.values()) {     //遍历牌面值
                cards.add(new Card(rank, suit));  //加入牌堆
            }
        }
        shuffle();//洗牌
    }

    //洗牌函数
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //抽一张牌
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public int getRemainingCardCount() {
        return cards.size();
    }
}
