public class RockPaperScissors {
    public static void main(String[] args) {
        //make array of rock, paper, scissors
        String[] choices = {"rock", "paper", "scissors"};

        //tell user to pick a choice and enter index
        System.out.println("Pick a choice: ");
        int userChoice = Integer.parseInt(System.console().readLine());


        //get computer choice randomly with nextInt()
        int computerChoice = (int) (Math.random() * 3);

        //new line and say countdown is starting
        System.out.println("\n");
        System.out.println("Countdown: ");

        //count down from 3 to 1
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            //sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        //display user choice and computer choice in one line
        System.out.println(choices[userChoice] + " vs " + choices[computerChoice]);

        //determine winner
        if (choices[userChoice].equals(choices[computerChoice])) {
            System.out.println("It's a tie!");
        } else if (choices[userChoice].equals("rock")) {
            if (choices[computerChoice].equals("scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (choices[userChoice].equals("paper")) {
            if (choices[computerChoice].equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (choices[userChoice].equals("scissors")) {
            if (choices[computerChoice].equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }


    }
}
