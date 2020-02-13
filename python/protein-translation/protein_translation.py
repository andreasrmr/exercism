codonToProtein = {
    "AUG": "Methionine",
    "UUU": "Phenylalanine",
    "UUC": "Phenylalanine",
    "UUA": "Leucine",
    "UUG": "Leucine",
    "UCU": "Serine",
    "UCC": "Serine",
    "UCA": "Serine",
    "UCG": "Serine",
    "UAU": "Tyrosine",
    "UAC": "Tyrosine",
    "UGU": "Cysteine",
    "UGC": "Cysteine",
    "UGG": "Tryptophan",
    "UAA": None,
    "UAG": None,
    "UGA": None
}
def proteins(strand):
    proteinsFound = []
    for i in range(0,len(strand), 3):
        protein = codonToProtein.get(strand[i:i+3])
        if(protein == None):
            return proteinsFound
        else:
            proteinsFound.append(protein)
    return proteinsFound 