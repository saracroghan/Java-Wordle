import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
	private String [] word_bank;
	private String word;
	private int tally;
	
	
	public Wordle() {
		this.word_bank = new String [60];
		this.word = "";
		this.tally = 0;
		
	}
	
	public void getWordBank() {
		try {
			FileReader file = new FileReader("words.txt");
			Scanner input_file = new Scanner(file);
			int index = 0;
			while (input_file.hasNext()) {
				String word = input_file.nextLine();
				this.word_bank[index] = word;
				index ++;	
			}
			input_file.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
}
	}
	public void getWord() {
		Random rand = new Random();
		int rand_int = rand.nextInt(0,this.word_bank.length + 1);
		String word = this.word_bank[rand_int];
		this.word = word;
	}
	public void simulate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your guess:");
		String guess = input.nextLine();
		guess = guess.toUpperCase();
		if (guess.length() != word.length()) {
			System.out.println("Invalid input... try again");
			simulate();
		}
		this.tally += 1;
		if(word.equals(guess)&& tally < 6) {
			System.out.println("You got it!");
			System.out.println("That took "+tally+" guesses.");
			System.exit(0);
		}
		else if(!word.equals(guess) && tally < 6) {
			String emoji_output = "";
			for(int i = 0; i< word.length(); i++) {
				char word_letter = word.charAt(i);
				char guess_letter = guess.charAt(i);
				if(word_letter == guess_letter) {
				emoji_output += "✔️";	
			}
				else if(word.indexOf(guess_letter)!= -1) {
				emoji_output += "🟨";
			}
				else {
				emoji_output += "❌ ";
			}
		}			
			System.out.println(emoji_output);
			System.out.println("Incorrect!");
			System.out.println("You have "+(6-tally)+" guesses left.");
			simulate();
	}

		else{
			System.out.println("Game over");
			System.out.println("The word was "+this.word);
			System.exit(0);
		}
	}
	
}

	
