class Solution {
    public int passThePillow(int n, int time) {
        int id = 1;
        int dir = 1;

        while (time > 0) {
            if (id + dir >= 1 && id + dir <= n) {
                id += dir;
                time--;
            } else {
                dir *= -1;
            }
        }
        return id;
    }


    public static void main(String[] args) {
        int n = 4;
        int t = 5;
        Solution p = new Solution();
        System.out.println(p.passThePillow(n, t));
    }
}
