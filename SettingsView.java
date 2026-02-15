package com.tradenova;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SettingsView extends VBox {

    public SettingsView() {

        setPadding(new Insets(25));
        setSpacing(20);

        Label title = new Label("Settings");
        title.getStyleClass().add("view-title");

        VBox container = new VBox();
        container.setSpacing(15);
        container.setPadding(new Insets(20));
        container.getStyleClass().add("settings-container");

        Button editProfile = new Button("Edit Profile");
        editProfile.getStyleClass().add("primary-button");

        editProfile.setOnAction(e -> openProfileWindow());

        container.getChildren().add(editProfile);

        getChildren().addAll(title, container);
    }

    private void openProfileWindow() {

        Stage stage = new Stage();

        VBox root = new VBox();
        root.setSpacing(15);
        root.setPadding(new Insets(20));
        root.getStyleClass().add("profile-window");

        Label heading = new Label("Edit Profile");
        heading.getStyleClass().add("profile-title");

        TextField name = new TextField();
        name.setPromptText("Full Name");

        TextField email = new TextField();
        email.setPromptText("Email Address");

        Button save = new Button("Save Changes");
        save.getStyleClass().add("save-button");

        save.setOnAction(e -> stage.close());

        root.getChildren().addAll(heading, name, email, save);

        Scene scene = new Scene(root, 360, 260);
        scene.getStylesheets().add(
                getClass().getResource("/styles.css").toExternalForm()
        );

        stage.setTitle("Profile Settings");
        stage.setScene(scene);
        stage.show();
    }
}