public class Logic_2 {
    //Given three ints, a b c, one of them is small, one is medium and one is large.
    // Return true if the three values are evenly spaced,
    // so the difference between small and medium is the same as the difference between medium and large.
    public boolean evenlySpaced(int a, int b, int c) {
        float maximum = Math.max(Math.max(a, b), c);
        float minimum = Math.min(Math.min(a, b), c);

        float sum = a + b + c;
        float dif =  Math.abs(maximum - minimum);

        if(maximum == minimum) {
            return true;
        }
        else if( sum / 3.0 == minimum + dif / 2.0){
            return true;
        }
        return false;
    }

    // We want to make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    // Return the number of small bars to use, assuming we always use big bars before small bars.
    // Return -1 if it can't be done.
    public int makeChocolate(int small, int big, int goal) {
        int smallNeeded = 0;
        if (goal - big * 5 >= 0){
            smallNeeded = goal - big * 5;
        }
        else{
            smallNeeded = goal % 5;
        }

        if (smallNeeded <= small){
            return smallNeeded;
        }
        return -1;
    }
}
