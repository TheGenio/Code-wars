def get_count(sentence):
    VOWEL = ['a','e','i','o','u']
    count = 0
    for i in sentence:
        if i in VOWEL:
            count +=1
            
    return count