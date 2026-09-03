class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        char_map = {}
        char_map = defaultdict(int)
        l = 0
        r = 0
        windowLen = 1
        maxLen = 0
        maxKey = None
        maxRep = 0
        char = None
        char = s[r]
        # default get val should be 0, if char is not in char_map yet
        char_map[char] = char_map.get(char, 0) + 1

        while r < len(s):


            maxKey = max(char_map, key=char_map.get)
            maxRep = char_map[maxKey]

            if windowLen - maxRep <= k:
                if windowLen > maxLen:
                    maxLen = windowLen
                r += 1
                if r < len(s):
                    char = s[r]
                    # default get val should be 0, if char is not in char_map yet
                    char_map[char] = char_map.get(char, 0) + 1

            else:
                char_map[s[l]] -= 1
                if char_map[s[l]] == 0:
                    char_map.pop(s[l])
                l += 1

            windowLen = r - l + 1


        return maxLen
                
            

