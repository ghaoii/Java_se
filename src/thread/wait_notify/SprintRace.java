package thread.wait_notify;

import java.util.Random;

public class SprintRace {
    private static class Sprint implements Runnable{
        int runningTime;
        Object lock;

        public Sprint(int runningTime, Object lock) {
            this.runningTime = runningTime;
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock){
                try {
                    wait(runningTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class Judge implements Runnable{
        @Override
        public void run() {
            return;
        }
    }
}
