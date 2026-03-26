package com.example.webapp.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

//@Route("")
@PageTitle("Hello, Vaadin!") 
public class MainView extends VerticalLayout { 
    public MainView() {
        add(new H1("Hello, Vaadin!"));
        var nameField = new TextField("What is your name?");
        add(nameField);
        add(new Button("Say Hello", event ->
                add(new Paragraph("Hello, %s!".formatted(nameField.getValue())))
        ));
    }
}