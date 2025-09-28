module coursework.listofgames {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires telegrambots.meta;
    requires telegrambots;

    opens coursework.listofgames.main to javafx.fxml;
    exports coursework.listofgames.main;
    exports coursework.listofgames.module.dao;
    exports coursework.listofgames.module.service;
    exports coursework.listofgames.module.desktop.managers;
    exports coursework.listofgames.module.desktop.util;
}