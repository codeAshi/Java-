
public class pr8 {
//     Question 1: Odd Ticket Prices Analysis
// Problem Statement
// A movie theatre has ticket prices stored in
// an array of size N.
// You need to:
// 1.Find all odd ticket prices
// 2.Compute:
// o Sum of odd prices
// o Count of odd prices
// o Average of odd prices

// Input Format
// • First line: Integer N (number of ticket
// prices)

// • Second line: N space-separated integers
// (ticket prices)
// Output Format
// Print 3 values:
// sum count average
// • Average should be printed with 2
// decimal places

// Example
// Input
// 4
// 20 25 30 35
// Output
// 60 2 30.00
public static void main(String[] args){
    int[] ticket={20,25,30,35};
    int sum=0;
    int count=0;
    for(int i=0;i<ticket.length;i++){
        if(ticket[i]%2==1){
            sum+=ticket[i];
            count++;

        }
    }
    System.out.println(sum);
    System.out.println(count);
    float a=2f;
    a=sum/count;
    System.out.println(a);
}
}
