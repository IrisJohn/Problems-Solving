class Solution:
    def reverse(self, x: int) -> int:
        
        
        
        sign = -1 if x < 0 else 1
        x *= sign

        # Remove leading zero in the reversed integer
        while x:
            if x % 10 == 0:
                x /= 10
            else:
                break

        # string manipulation
        y=x
        sum=0
        while y>0:
            dig=y%10
            sum=sum*10+dig
            y=y//10
            
        x= math.floor(sum*sign   ) 
        if x>(2**31-1):
            return 0
        if x<(-2**31):
            return 0
        return x
          
            
            
        