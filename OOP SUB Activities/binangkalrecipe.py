
# Name: Noel Jhumel G. Blanco
# Section IT2R13
# Subject: Object-Oriented Programming

# Note: sorry sir for the late submission. I've already messaged you the reason for the late submission. I've also sent the medical certificate in messenger as proof. Thank you sir.

# Answer to questions

# 1. What can you observe in the binangkal recipe flowchart?

    # The flowchart starts with gathering the ingredients which are divided into two parts namely dry and wet mixtures.
    # In the flowchart, it can be seen that the dry and wet ingredients are mixed separately before combining them into a dough.
    # The dough is then kneaded if it is not smooth and sticky it will be kneaded until it is smooth and not sticky.
    # Once it is smooth and not sticky it will be shaped into balls and coated with sesame seeds.
    # After the balls are shaped, they are fried in hot oil until golden brown and then served.


# 2. Can you identify a specific type of control structure in the flowchart?

    # The control structure that can be seen in the flowchart are conditional statements and looping
    # The flowchart includes decision-making points like for example in the "While not smooth and sticky" part there is a conditional statement that can be seen.
    # If the dough is not smooth and sticky it will then knead the dough. Otherwise, it will be shaped into a ball and coated with sesame seeds.
    # Moreover, in the process of frying the binangkal until it turns into golden brown is an example of looping. Because frying will continue until a certain condition (golden brown) is met.


# 3. Try to implement this in your previous programming language.
class BinangkalRecipe:
    def __init__(self):
        self.ingredients = {
            "oil": "For deep frying",
            "all_purpose_flour": 2,  # cups
            "powdered_milk": 1,  # cup
            "baking_powder": 1,  # teaspoon
            "sugar": 1,  # cup
            "evaporated_milk": 1,  # can
            "melted_butter": 0.5,  # cup
            "egg": 1,
            "sesame_seeds": "For coating"
        }
        self.dough = None
        self.binangkal_balls = None
        self.kneading_counter = 0
        self.frying_counter = 0
        print("Ingredients gathered.")

    def mix_dry_ingredients(self):
        dry_mixture = (
            self.ingredients["all_purpose_flour"]
            + self.ingredients["powdered_milk"]
            + self.ingredients["baking_powder"]
        )
        print("Dry ingredients mixed.")
        return dry_mixture

    def mix_wet_ingredients(self):
        wet_mixture = (
            self.ingredients["sugar"]
            + self.ingredients["evaporated_milk"]
            + self.ingredients["melted_butter"]
            + self.ingredients["egg"]
        )
        print("Wet ingredients mixed.")
        return wet_mixture

    def combine_ingredients(self, dry_mixture, wet_mixture):
        combined_mixture = dry_mixture + wet_mixture
        print("Dry and wet ingredients mixed.")
        return combined_mixture

    def dough_is_smooth_and_not_sticky(self):
        if self.kneading_counter >= 3:
            return True
        else:
            return False

    def knead(self):
        print("Kneading dough...")
        self.kneading_counter += 1

    def knead_dough(self, combined_mixture):
        self.dough = combined_mixture
        self.kneading_counter = 0  
        while not self.dough_is_smooth_and_not_sticky():
            self.knead()
        print("Dough is smooth and not sticky after kneading.")
        self.shape_and_coat()

    def shape_and_coat(self):
        self.binangkal_balls = ["binangkal ball"]  
        print("Dough shaped into balls and coated with sesame seeds.")

    def prepare_oil(self):
        print("Oil is heating for deep frying.")
        return "hot oil"
    
    def while_not_golden_brown(self):
        if self.frying_counter >= 3:
            return True
        else:
            return False

    def fry(self, hot_oil):
        for ball in self.binangkal_balls:
            print(f"Starting to fry {ball}.")
            self.frying_counter = 0  

            while not self.while_not_golden_brown():
                self.frying_counter += 1
                print(f"{ball} is still frying...")
                
            print(f"{ball} is golden brown.")
        
        print("All Binangkal fried.")

    def serve(self):
        print("Serving Binangkal. Enjoy!")

    def make_binangkal(self):
        dry_mixture = self.mix_dry_ingredients()
        wet_mixture = self.mix_wet_ingredients()
        combined_mixture = self.combine_ingredients(dry_mixture, wet_mixture)
        self.knead_dough(combined_mixture)
        hot_oil = self.prepare_oil()
        self.fry(hot_oil)
        self.serve()

binangkal = BinangkalRecipe()
binangkal.make_binangkal()
