/**
 * PullUntilRare
 * Name: ____________________
 * Date: ____________________
 *
 * AI Use Tier: 🤝 AI Co-Pilot
 * AI Attribution (required if you used AI): no AI help (all me!)
 */
public class App
{
    public static void main(String[] args)
    {
        PullMachine machine = new PullMachine();

        // ===== TODO 1: Pull Until Rare =====
        // Pull until you get a rare item. Count how many pulls it took.
        // Loop I'm using: ________  Why: ____________________

        int pullsToRare = 0;

        // write your loop here
        // while (machine.pullItem() == false){
        //     machine.pullItem();
        //     // System.out.println(machine.pullItem());
        //     pullsToRare ++;
        // }

        while (true){
            pullsToRare ++;
            if (machine.pullItem() == true){
                break;
            }
        }

        System.out.println("Part 1: It took " + pullsToRare + " pulls to get a rare item.");

        // ===== TODO 2: Exactly 100 Pulls =====
        // Pull exactly 100 times. Count how many were rare.
        // Loop I'm using: ________  Why: ____________________

        int rareCount = 0;
for (int pulls=0; pulls <=100; pulls++){
    if (machine.pullItem() == true){
        rareCount++;
    }
}
        // write your loop here


        System.out.println("Part 2: In 100 pulls, you got " + rareCount + " rare items.");

        // ===== TODO 3: Reflection =====
        // Run your program at least 5 times first. Then answer below in
        // complete sentences. Use these words somewhere: iteration,
        // condition, loop control variable (or counter).
        //
        // 1. Why does a while loop fit Part 1 and a for loop fit Part 2?
        //    What would go wrong if you swapped them?
        //    Answer: A while loop works well for Part 1 because you don't know how many times you'll have to pull to get a rare. The second part could work as a while loop. If you swapped,the first part would not work as intended and the second would be les efficient.
        //
        // 2. How did your five runs compare to each other? What surprised you?
        //    Answer: There was a lot of variability in the number of pulls it took to get a rare (ranging from 9 to 76), but not as much in the number of rare items in 100 pulls. I was surprised by how few rare items I drew, I wasn't expecting to average less than 10.
        //
        // 3. Describe one bug or wrong turn you hit and how you fixed it.
        //    (No bugs? Explain how you checked that your counter was correct.)
        //    Answer: Originally, in the while loop I was calling machine.pullItem() too many times, getting a different result each time. I solved this by restructuring so that I only called once per iteration, checking whether to break on this call after incrementing for the pull.
        //
        // 4. A 5% chance can feel very different depending on how it's
        //    presented. Who benefits when players keep pulling, and who
        //    might be harmed?
        //    Answer: A 5% chance is misleading - it's not statistically probable, but it feels very possible. Players will inevitably pull less than they expect too - this would generate the game more money if players were paying to pull.
    }
}
