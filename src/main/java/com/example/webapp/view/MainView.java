package com.example.webapp.view;

import com.example.webapp.entity.Reply;
import com.example.webapp.repository.ReplyRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("Hello, Vaadin!") 
public class MainView extends VerticalLayout {
    public MainView(ReplyRepository repository) {
        Grid<Reply> grid = new Grid<>(Reply.class);
        grid.setItems(repository.findAll());
        grid.setColumns("id", "title", "content");
        add(new H1("댓글 리스트"), grid);
    }
}