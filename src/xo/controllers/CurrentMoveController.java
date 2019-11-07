package xo.controllers;

import xo.model.Field;
import xo.model.Point;

public class CurrentMoveController {

    public String currentMove(final Field field) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < field.getSize(); i++)
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                final Point p = new Point();
                p.x = i;
                p.y = i2;
                final String figure = field.getFigure(p);
                if (figure == null) continue;
                if (figure.equals("X")) x++;
                if (figure.equals("O")) y++;
            }
        return x == y ? "X" : "O";
    }
}
