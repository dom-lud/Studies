#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a(0),b(0);
    int suma1=1,suma2=1;

    cout<<"Podaj liczby ktore chcesz sprawidzic: ";
    cin>>a>>b;

   for(int i=a;i<=b;i++)
    {

        for(int j=a;j<=b;j++)
        {
            suma1=1;
            suma2=1;
            for(int x=2;x<i;x++)
            {
                if(i%x==0)
                suma1+=x;
            }

            for(int x=2;x<j;x++)
            {
                if(j%x==0)
                suma2+=x;
            }
            if (i == suma2 && j == suma1 && i != j)
                cout<<i<<" "<<j<<endl;
        }
    }
    return 0;
}
