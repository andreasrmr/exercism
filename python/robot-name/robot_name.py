import random
import string

allRobots = set()

class Robot:
    def __init__(self):
        self.setAvailableName()
        allRobots.add(self.name)

    def reset(self):
        self.setAvailableName()
        allRobots.add(self.name)
            
    def setAvailableName(self):      
        self.name = self.genName()
        while(self.name in allRobots):
            self.name = self.genName()

    def genName(self):
        tempName = ""
        for i in range(2):
            tempName += random.choice(string.ascii_letters).upper()
        for i in range(3):
            tempName += str(random.randint(0, 9))
        return tempName