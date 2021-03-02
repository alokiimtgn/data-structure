/*
Problem Statement :  Given any array with some elements user will enter an element if it
is present in the array then find the size of array witthout the target elemnts.

Test Cases 
input = {1,2,2,4}
target = 2
output = 2
*/

class ArrayRemove{
static int ar [] = new int[]{1,2,2,4};
static int count = 0;
int target = 2;
public static void main(String []args){
for(int i = 0;i<ar.length;i++){
if(ar[i] == 2){
count++;
}
}
System.out.println(ar.length-count);
}
}