package com.rafa.controller;

import com.rafa.model.ClickCounterModel;
import com.rafa.view.ClickCounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterController {
    private ClickCounterModel model;
    private ClickCounterView view;

    public ClickCounterController(ClickCounterModel model, ClickCounterView view) {
        this.model = model;
        this.view = view;

        this.view.addClickListener(new ClickListener());
    }


    class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.incrementCount();
            view.setCountLabel(model.getClickCount());
        }
    }
}
