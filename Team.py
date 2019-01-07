class Team:
    record_win = 0
    record_loss = 0
    amos_correct = 0
    elo_correct = 0
    bing_correct = 0
    fpi_correct = 0
    def __init__(self, name, abbr):
        self.name = name
        self.abbr = abbr

    def add_win(self):
        self.record_win += 1

    def add_loss(self):
        self.record_loss += 1

    def add_amos_correct(self):
        self.amos_correct += 1

    def add_elo_correct(self):
        self.elo_correct += 1

    def add_bing_correct(self):
        self.bing_correct

    def add_fpi_correct(self):
        self.fpi_correct

