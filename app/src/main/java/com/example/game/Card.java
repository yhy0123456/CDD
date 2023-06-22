package com.example.game;

public class Card {
    private Rank rank;  //花色
    private Suit suit;  //牌面值

    //构造函数，初始化卡牌属性
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //获取花色
    public Rank getRank() {
        return rank;
    }

    //获取牌面值
    public Suit getSuit() {
        return suit;
    }

    // 设置花色
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    // 设置牌面值
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
