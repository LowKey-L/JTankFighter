package com.SourceUnit;

import java.awt.*;

/**
 * <p>
 *
 * @author BowenDeng
 * @version 1.0
 * @date 2021/12/7 19:37
 **/
public interface Entity {

    void draw(Graphics g);

    void move();

    Rectangle getBorder();

    Rectangle[] getDetailedBorder();
}
