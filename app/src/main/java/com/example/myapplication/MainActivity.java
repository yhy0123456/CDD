package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.game.Game;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 创建游戏，并指定玩家名称
        List<String> playerNames = new ArrayList<>();
        playerNames.add("Player 1");
        playerNames.add("Player 2");
        playerNames.add("Player 3");
        playerNames.add("Player 4");
        game = new Game(playerNames);

        // 发牌
        game.dealCards();

        // 打印每位玩家的手牌
        for (Player player : game.getPlayers()) {
            Log.d("MainActivity", player.getName() + "'s hand: " + player.getHand());
        }

        // 打印剩余的牌数
        Log.d("MainActivity", "Remaining cards in deck: " + game.getDeck().getRemainingCardCount());
    }
}