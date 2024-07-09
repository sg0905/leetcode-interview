// public class averageWaitingTime {
//     public void main(String args[]){
//         int [][] customers = {
//                                 {5,2}, 
//                                 {5,4}, 
//                                 {10,3},
//                                 {20,1}
                                
//                             };
//         int n =customers.length;
//         int m = customers[0].length;
//         System.out.println(m + " " + n );
//         // int arrival_time = 0;
//         int waiting_time = 0;
//         int completed_time = 0;
//         int WT[] = new int [n];

//         for(int i = 0 ; i < n ; i++){
//             int arrival_time = customers[i][0];
//             int burst_time = customers[i][1];
//             arrival_time = Math.max(arrival_time,completed_time);
//             completed_time = burst_time + arrival_time ;
//             waiting_time = completed_time  - customers[i][0];
//             WT[i] = waiting_time;
//         }
//         double avg = 0.0;
//         for(int i = 0 ; i < n ; i++){  
//             avg =WT[i] + avg;
//         }
//         System.out.println(" AVG Waiting time: " + avg/n );
        

//     }
// }


public class averageWaitingTime {
    public double solution(int [][] customers){
        // int [][] customers = {
        //                         {5,2}, 
        //                         {5,4}, 
        //                         {10,3},
        //                         {20,1}
                                
        //                     };
        int n =customers.length;
        int m = customers[0].length;
        System.out.println(m + " " + n );
        // int arrival_time = 0;
        int waiting_time = 0;
        int completed_time = 0;
        int WT[] = new int [n];
        double avg = 0.0;
        for(int i = 0 ; i < n ; i++){
            int arrival_time = customers[i][0];
            int burst_time = customers[i][1];
            arrival_time = Math.max(arrival_time,completed_time);
            completed_time = burst_time + arrival_time ;
            waiting_time = completed_time  - customers[i][0];
            WT[i] = waiting_time;
            avg = WT[i] + avg;
        }
        return avg/n;

    } 
    public static void main(String args[]) {
        int [][] customers = {
                                {5,2}, 
                                {5,4}, 
                                {10,3},
                                {20,1}
                                
                            };
        averageWaitingTime av =new averageWaitingTime();
        System.out.println(av.solution(customers));
    }
}
