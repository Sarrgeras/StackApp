package util;

import java.util.Random;

public class RandomGenerating {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String stackGenerate(){
        Random rnd = new Random();
        return Integer.toString(rnd.nextInt(0, 255));
    }
}
