#include<iostream>
#include<vector>
using namespace std ;
int main()
{
    //For 1-D matrix
//     vector<int> v(5,3) ;
// cout<<v[0]<<endl ;
// cout<<v[1]<<endl ;
// cout<<v[2]<<endl ;
// cout<<v[3]<<endl ;
// For 2-D matrix 
vector<vector<int> > v(3,vector<int> (4,20));
for(int i =0;i<3;i++){
    for(int j =0;j<4;j++){
        cout<<v[i][j]<<" ";
    }
    cout<<endl;
}

}