def is_pangram(sentence):
    aSet = set()
    for char in sentence.upper():
        if(char.isalpha()):
            aSet.add(char)
    return True if len(aSet) == 26 else False