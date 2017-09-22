package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		String fline = " ";
		String[] lines = new String[model.getWidth()];
		for(int i = 0; i < model.getWidth(); i++){
			fline = fline + i;
		}	
		System.out.println("\n"+fline+"\n");
		for(int i = 0; i < model.getWidth(); i++){
			lines[i] = "" + i;
			for(int j = 0; j < model.getWidth(); j++){
				lines[i] = lines[i] + model.getMark(i,j);	
			}	
			System.out.println(lines[i]);
		}
			System.out.println("\n");
		

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		if(model.isXTurn()){
			System.out.println("Player 1 (X) Move: "+"\n" + "Enter Row and colum numbers, separated by a space:");
		}
		else System.out.println("Player 2 (O) Move: "+"\n" + "Enter Row and colum numbers, separated by a space:");
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		System.out.println("That input was invalid, please reenter your move");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}