NO_CONVERT = {
    3: "Pling",
    5: "Plang",
    7: "Plong"
}

def convert(number):
    result = "".join([v for k, v in NO_CONVERT.items() if number % k == 0])
    return (result or str(number))