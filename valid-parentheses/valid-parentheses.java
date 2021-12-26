class Solution {
    public boolean isValid(String s) {
       Deque<Character> st
            = new ArrayDeque<Character>();
        int flag=0;char check;
        if(s.length()==1)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                st.push(s.charAt(i));
            
                if(st.isEmpty())
                    return false;
                char x= s.charAt(i);
                switch (x) 
                {
            case ')':
                check = st.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = st.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = st.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            
        }
        }
        return(st.isEmpty());
    }
}