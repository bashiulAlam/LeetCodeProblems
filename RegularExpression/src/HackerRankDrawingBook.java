public class HackerRankDrawingBook {
    public int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        if (p == 1 || p == n)
            return 0;
        else if (p % 2 != 0 && p == n - 1 && n % 2 != 0)
            return 0;
        else {
            int front = 0, back = 0;
            front = p / 2;
            int temp = n - p;
            //System.out.println("temp " + temp);
            if (n % 2 == 0 && p % 2 != 0)
                back = (temp / 2) + 1;
            else back = temp / 2;

            if (front < back)
                return front;
            else return back;
        }


    }
}
