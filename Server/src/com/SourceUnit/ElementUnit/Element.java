package com.SourceUnit.ElementUnit;

import java.awt.*;

/**
 * <p>
 *
 * @author BowenDeng
 * @version 1.0
 * @date 2021/12/7 19:37
 **/
public interface Element {

    void draw(Graphics g);

    void move();

    Rectangle getBorder();
}
