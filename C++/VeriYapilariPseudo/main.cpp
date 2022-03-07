#include <iostream>

using namespace std;

int main()
    {
    int a=3,b=8,c=24,d;
    d=a*4+b/4*(a-1);
    cout<<d++<<endl;
    c-=d-a+b%3;
    cout<<--c<<endl;
    cout<<c*a-d<<endl;

    return 0;
}
