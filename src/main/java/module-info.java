module com.example.projetofinal_poo_bd {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.inatel.projeto_final to javafx.fxml;
    exports br.inatel.projeto_final;
    exports br.inatel.projeto_final.food;
    opens br.inatel.projeto_final.food to javafx.fxml;
    exports br.inatel.projeto_final.canvas_utils_square;
    opens br.inatel.projeto_final.canvas_utils_square to javafx.fxml;
    exports br.inatel.projeto_final.config;
    opens br.inatel.projeto_final.config to javafx.fxml;
    exports br.inatel.projeto_final.try_again_button;
    opens br.inatel.projeto_final.try_again_button to javafx.fxml;
    exports br.inatel.projeto_final.key_event_loop;
    opens br.inatel.projeto_final.key_event_loop to javafx.fxml;
    exports br.inatel.projeto_final.scenario;
    opens br.inatel.projeto_final.scenario to javafx.fxml;
    exports br.inatel.projeto_final.snake;
    opens br.inatel.projeto_final.snake to javafx.fxml;
}