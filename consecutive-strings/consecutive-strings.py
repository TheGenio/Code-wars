def longest_consec(strarr, k):
    lenx = 0
    bigword = ""
    reword = ""
    count = 0

    if k < 0:
        return bigword
    elif k > len(strarr):
        if strarr == []:
            return ''
        elif k > len(strarr[0]) and len(strarr) == 1:
            return strarr
        else:
            return ''
    elif k == len(strarr):
        return ''
    elif k < len(strarr):
        while len(strarr) != count:
            for i in range(count, k):
                bigword = bigword + strarr[i]
            k = k + 1
            if len(bigword) > lenx:
                lenx = len(bigword)
                reword = bigword
            if k == len(strarr) + 1:
                break
            bigword = ""
            count = count + 1
        return reword