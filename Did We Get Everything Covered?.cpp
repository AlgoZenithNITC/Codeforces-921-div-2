#include<bits/stdc++.h>
using namespace std;

void solve(){
    int n,k,m;
    cin>>n>>k>>m;
    string s;
    cin>>s;
    set<char>st;
    string ans="";
    for(int i=0;i<m;i++){
        st.insert(s[i]);
        if(st.size()==k){
            ans+=s[i];
            st.clear();
        }
    }
    if(ans.length()>=n){
        // more than n blocks are present;
        cout<<"YES"<<'\n';
        return;
    }
    else{
        cout<<"NO"<<'\n';
        char miss;
        for(int i=0;i<k;i++){
            char ch=(char)('a'+i);
            if(st.find(ch)==st.end()){
                miss=ch;
            }
        }
        while(ans.length()<n){
            ans+=miss;
        }
        cout<<ans<<'\n';
        return;
    }
}

int main(){
    int t;cin>>t;
    while(t--) solve();
}
