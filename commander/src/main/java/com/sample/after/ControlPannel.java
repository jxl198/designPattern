package com.sample.after;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 11:21
 **/
public class ControlPannel {
    private int slot;
    private Commander[] onCommanders;
    private Commander[] offCommanders = new Commander[5];

    private Deque<Commander> stack;

    public ControlPannel() {
        onCommanders = new Commander[5];
        offCommanders = new Commander[5];
        Commander noCommander = new NoCommander();
        for (int i = 0; i < 5; i++) {
            onCommanders[i] = noCommander;
            offCommanders[i] = noCommander;
        }
        stack = new ArrayDeque<Commander>();
    }

    public void setCommanders(Commander onCommande, Commander offCommander, int slot) {
        onCommanders[slot] = onCommande;
        offCommanders[slot] = offCommander;
    }

    public void onButton(int slot) {
        onCommanders[slot].execute();
        stack.push(onCommanders[slot]);
    }

    public void offButton(int slot) {
        offCommanders[slot].execute();
        stack.push(offCommanders[slot]);
    }

    public void undoCommander() {
        stack.pop().undo();
    }
}
