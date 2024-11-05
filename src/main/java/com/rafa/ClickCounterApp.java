package com.rafa;

import com.rafa.controller.ClickCounterController;
import com.rafa.model.ClickCounterModel;
import com.rafa.view.ClickCounterView;

public class ClickCounterApp {
    public static void main(String[] args) {
        ClickCounterModel model = new ClickCounterModel();
        ClickCounterView view = new ClickCounterView();
        new ClickCounterController(model, view);

        view.setVisible(true);
    }
}
