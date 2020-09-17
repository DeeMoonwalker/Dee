import java.awt.Color;
import java.awt.Font;

public class BookofColours {
	public static void main(String[] args) {

		GTerm gt = new GTerm(600, 400);
		
		

		
		
		
		

		// THE PINK BOOK
		gt.setBackgroundColor(255, 102, 105);

		gt.setFontSize(67);

		gt.setFont("Georgia (Heading)", Font.ITALIC, 27);

		gt.setXY(60, 10);

		gt.setFontColor(Color.pink);

		String greeting = gt.getInputString("Hello dreamer, what is your name?");

		gt.println("Good morning, good afternoon or good evening wonderful " + greeting
				+ "! Have fun exploring this book!");

		gt.setXY(10, 50);
		gt.addImageIcon("header2.png");

		gt.setXY(420, 350);
		gt.addImageIcon("pink1.gif");

		gt.setXY(250, 900);
		gt.println("Down the road we go!!! Haha, tis a dream world of pink galahs, stars and\n    Mars. "
				+ "You'll learn new things, delight at the sights! But most of all,\n                     you'll have a ton of fun under our great pink sun!");

		gt.setXY(400, 1100);
		gt.addImageIcon("pink2.gif");

		gt.setXY(230, 1550);
		gt.println(
				"But first, here's a pink cake. One I didn't bake! The most popular birthday is \n      September 9! Is that your birthday? It's not mine!");

		gt.setXY(500, 1700);
		gt.addImageIcon("galah2.jpg");

		gt.setXY(240, 2190);
		gt.println(
				"Now for the pink galah! He's from Australia! His name is Cookie and he's 80\n          years old. But he's still cute as can be, and cheeky and bold!");

		gt.setXY(420, 2350);
		gt.addImageIcon("cherryblossom.gif");

		gt.setXY(310, 2650);
		gt.println(
				"Cherry blossom season is big in Japan! They have picnics\n                and games whenever they can!");

		gt.setXY(410, 2800);
		gt.addImageIcon("picnic.gif");

		gt.setXY(410, 3120);
		gt.println("Sushi and rice! And sweets that taste nice!");

		gt.setXY(490, 3250);
		gt.addImageIcon("mars.gif");

		gt.setXY(400, 3600);
		gt.println("Mars is pink! Yes Mars, so what do you think?");

		gt.setXY(430, 3750);
		gt.addImageIcon("astro.gif");

		gt.setXY(425, 4130);
		gt.println("You want to go there? You can, one day soon.\n     But first you'll have to fly to the Moon!");

		gt.setXY(430, 4280);
		gt.addImageIcon("cube.gif");

		gt.setXY(425, 4680);
		gt.println("To be an astronaut you'll need to know maths!\n You'll learn about cubes and all that!");

		gt.setXY(430, 4850);
		gt.addImageIcon("universe.gif");

		gt.setXY(400, 5150);
		gt.println(
				"Our universe is also pink! It's one giant galatic link!\n    There's so much to explore, so get up and\n  find some pink things to adore!");

		gt.setXY(10, 5300);
		gt.addImageIcon("ENDER.png");

		gt.setXY(10100, 11150);
		gt.addImageIcon("parallel.gif");
		
		gt.setXY(10000, 11700);
		gt.println("Here's one more treat for you my sweet. We live in a pink multiverse!"); 
	
		

	
	}
}
