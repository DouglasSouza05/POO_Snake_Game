package br.inatel.projeto_final;

import br.inatel.projeto_final.food.apple.Apple;
import br.inatel.projeto_final.food.pineapple.Pineapple;
import br.inatel.projeto_final.scenario.Scenario;
import br.inatel.projeto_final.snake.Snake;
import javafx.application.Application;
import javafx.stage.Stage;

//Classe main "Game" extendendo Classe Application para criação do Snake Game
public class Game extends Application {

    public static void main(String[] args) {
        launch(args); //Comando para executarmos a Application
    }

    @Override
    public void start(Stage stage) throws Exception {
        Snake snake = new Snake();
        Apple apple = new Apple();
        Pineapple pineapple = new Pineapple();

        //head sendo desenhada como um square
        Scenario scenario = new Scenario(stage, snake, apple, pineapple);
    }
    
}
