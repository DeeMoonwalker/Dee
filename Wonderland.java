import java.awt.Font;

public class Wonderland {
	public static void main(String[] args) {

		GTerm gt = new GTerm(600, 400);

		gt.setBackgroundColor(51, 153, 255);

		gt.setFontColor(14, 0, 0);

		gt.setFont("Georgia (Heading)", Font.BOLD, 28);
		
		String name;

		String favColour;

		int age;

		boolean loveAnimals;

		String rawInput = gt
				.getInputString("Hi dear dreamer enter your name,favourite colour, and age,do you LOVE animals?");
		String[] childValues = rawInput.split(",");

		name = childValues[0];

		favColour = childValues[1];

		age = Integer.parseInt(childValues[2]);

		loveAnimals = Boolean.parseBoolean(childValues[3]);

		// THE GREEN BOOK

		if (favColour.equals("green")) {

			gt.setXY(30, 50);
			gt.print("Hello" + name + " welcome the green to wonderland");

			if (loveAnimals == true && age < 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");
			} else if (loveAnimals == true && age > 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");

			} else {

			}
		}

		// THE BLUE BOOK:

		if (favColour.equals("blue")) {

			gt.setXY(30, 50);
			gt.print("Hello" + name + " welcome the blue to wonderland");

			if (loveAnimals == true && age < 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");
			} else if (loveAnimals == true && age > 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");

			} else {

			}
		}

		// THE PINK BOOK

		if (favColour.equals("pink")) {

			gt.setXY(30, 50);
			gt.print("Hello" + name + " welcome the pink to wonderland");

			if (loveAnimals == true && age < 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");
			} else if (loveAnimals == true && age > 5) {
				gt.setXY(30, 50);
				gt.print("Animal wonderland");

			} else {

			}
		}

		gt.setXY(1000, 1000);

	}

}
