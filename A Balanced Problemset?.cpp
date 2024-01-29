#include <bits/stdc++.h>
using namespace std;
void solve()
{
   int n,x;
   int ans=1;
   cin>>n>>x;
   for(int i=1;i*i<=n;i++)
   {
      if(n%i==0)
      {
      int z1=(n/i);
      if(z1>=x)
      {
	 ans=max(ans,i);
      }
      if(i>=x)
      {
         ans=max(ans,z1);
      }
      }
   }
   cout<<ans<<endl;
   return;
}

 
int main() {
 
    int t;
    cin >> t;
    
    while (t--) 
    {
        solve();
    }
    return 0;
}
