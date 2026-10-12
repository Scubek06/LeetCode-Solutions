class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        """answer = 0
        if ((len(s) >= 0) and (len(s) <= 1000)) and (len(t) == len(s)+1) :
            for i in range(len(s)):
                answer = answer ^ ord(s[i])

            for i in range(len(t)):
                answer = answer ^ ord(t[i])

        return chr(answer)"""
        count ={}

        for ch in s:
            if ch in count:
                count[ch] = count[ch] + 1
            else:
                count[ch] = 1
        for ch in t:
            if ch in count:
                count[ch] -= 1
            else:
                count[ch] = -1

        for ch in count:
            if count[ch] == -1:
                return ch


