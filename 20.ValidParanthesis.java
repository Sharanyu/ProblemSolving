class Solution {
    public boolean isValid(String s) {
        HashMap <Character,Character> map = new HashMap <Character,Character>();
        Stack<Character> stk = new Stack<Character>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        map.put('0','0');
        
        stk.push('0');
        if(s.length()%2!=0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                stk.push(s.charAt(i));
            }
            else if(map.get(stk.peek())==s.charAt(i))
            {
                stk.pop();
            }
            else
                return false;
        }
        if(stk.peek()=='0')
        {
            return true;
        }
        return false;
    }
}