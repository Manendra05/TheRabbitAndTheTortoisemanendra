package thread.tortoise;

import javax.swing.*;
public class Tortoise implements Runnable {
    private static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise=new Thread(this,"Tortoise");

    }

    public Thread getTortoise() {
        return tortoise;
    }
    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    System.out.println("The Tortoise is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(18000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortoise's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}

