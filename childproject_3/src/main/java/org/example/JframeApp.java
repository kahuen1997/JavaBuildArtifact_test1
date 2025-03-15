package org.example;

import javax.swing.*;
import java.awt.*;

public class JframeApp {

    // 建構函式
    JframeApp() {
        JFrame frame = new JFrame("BOJI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.BLACK);

        // 設定圖片
        String imagePath = "C:\\Program Files\\Intellij\\IdeaProjects\\Build_Artifact\\childproject_3\\src\\Photo_1\\pexels-adi-k-182036-1471294.jpg";
        ImageIcon image1 = new ImageIcon(imagePath);

        // 確認圖片是否載入成功
        if (image1.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("⚠️ 圖片無法載入，請確認路徑正確：" + imagePath);
        }

        JLabel label = new JLabel(image1);
        frame.add(label);

        // 自動調整大小後顯示
        frame.pack();
        frame.setVisible(true);
    }

    // 🔹 main 方法，程式從這裡開始執行
    public static void main(String[] args) {
        new JframeApp(); // 創建 org.example.JframeApp 物件，執行建構函式
    }
}