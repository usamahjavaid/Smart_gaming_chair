/*Gaming chair der vibrerer hver time
for at få brugeren til at skifte position,
så man ikke få ondt i ryggen.
Eventuelt tilføje vægt måler.
 */

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        //Everytime vibration hits 3600 change position
        int vibration_time = 3600;
        //Cycle gaming chair starts at 0
        int cycle_time = 0;
        //Make loop for gaming chair

        while (true) {
            cycle_time++;

                TimeUnit.SECONDS.sleep(1);


            if (cycle_time == vibration_time) {
                System.out.println("Change sitting position");
                cycle_time = 0;


            }
        }

    }


}
