#include<iostream>
using namespace std ;
void swap(int &a , int &b){
    int temp = a ;
    a = b ;
    b = temp ;
    return ;
}
int main()
{
int a = 10 , b = 5 ;
cout<<"The elements before swapping :"<<a<<" "<<b<<endl ;
swap(a,b) ;
cout<<"The elements after swapping :"<<a<<" "<<b<<endl  ;

}