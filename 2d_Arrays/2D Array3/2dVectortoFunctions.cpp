#include<iostream>
#include<vector>
using namespace std ;
void change2dvector(vector< vector <int> > &v){
    v[1][0] = 100 ;

}
void length(vector< vector <int> > &v)
{
    cout<<v.size() ;
}
int main()
{
 vector<int> v1 ;
 v1.push_back(1);
 v1.push_back(2);
 v1.push_back(3);
 v1.push_back(4);

 vector<int> v2 ;
 v2.push_back(4);
 v2.push_back(5);
 v2.push_back(6);
 v2.push_back(7);

  vector<int> v3 ;
 v3.push_back(4);
 v3.push_back(5);
 v3.push_back(6);
 v3.push_back(7);
 vector< vector<int> >v ; 
 v.push_back(v1);
  v.push_back(v2);
   v.push_back(v3);

   cout<<v[1][0]<<endl ;
   change2dvector(v) ;
   cout<<v[1][0]<<endl ;
   length(v) ;
 }

 