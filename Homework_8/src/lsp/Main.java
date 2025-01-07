package lsp;

import java.util.List;

/**
 * Refactor the code to ensure it adheres to LSP.
 */
public class Main {

    public static void main(String[] args) {

        Bird pigeon1 = new Pigeon("can fly test");
        Bird penguin1 = new Penguin("can't fly test");

        List<Bird> birds = List.of(pigeon1, penguin1);

//        for(Bird bird : birds) {
//            if (bird instanceof BirdFlying birdFlying) {
//                System.out.println("Flying ? " + birdFlying);
//            }
//
//            if (bird instanceof BirdNotFlying birdNotFlying) {
//                System.out.println("Flying ? " + birdNotFlying);
//            }
//        }

    }

}