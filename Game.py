from Team import Team

class Game:
    teams = {"Arizona Cardinals" : "ARI", "Atlanta Falcons" : "ATL", "Baltimore Ravens" : "BAL", "Buffalo Bills" : "BUF", "Carolina Panthers" : "CAR", "Chicago Bears" : "CHI", "Cincinnati Bengals" : "CIN", "Cleveland Browns" : "CLE", "Dallas Cowboys" : "DAL", "Denver Broncos" : "DEN", "Detroit Liions" : "DET", "Green Bay Packers" : "GB", "Houston Texas" : "HOU", "Indianapolis Colts" : "IND", "Jacksonville Jaguars" : "JAX", "Kansas City Chiefs" : "KC", "Los Angeles Chargers" : "LAC", "Los Angeles Rams" : "LAR", "Miami Dolphins" : "MIA", "Minnesota Vikings" : "MIN", "New England Patriots" : "NEP", "New Orleans Saints" : "NO", "New York Giants" : "NYG", "New York Jets" : "NYJ", "Oakland Raiders" : "OAK", "Philadelphia Eagles" : "PHI", "Pittsburgh Steelers" : "PIT", "San Francisco 49ers" : "SF", "Seattle Seahawks" : "SEA", "Tampa Bay Buccaneers" : "TB", "Tennessee Titans" : "TEN", "Washington Redskins" : "WAS"}
    def __init(self, h, a, h_win):
        for x in self.teams:
            if h == x:
                home = Team(h, self.teams[h])
            if a == x:
                away = Team(a, self.teams[a])

        if h_win == True:
            home.add_win()