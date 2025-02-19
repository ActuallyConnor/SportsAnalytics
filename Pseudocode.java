for (all games) {
    // we began the simulation with a total of 5000 as a comfortable buffer
    if (prediction > 0.5) { // if the model prediction is greater than 50%
        if (homeMoneyline < 0) { // if the Home team moneyline is less than zero (favourite)
            total += homeMoneyline; // add the Home team moneyline (a negative number) to the total
        } else { // if them model prediction is greater than zero
            total -= 100; // deduct 100 from the total
        }
    } else { // if the model prediction is less than 50%
        if (awayMoneyline < 0) { // if the Away team moneyline is less than zero
            total += homeMoneyline; // add the Away team moneyine (a negative number) to the total
        } else { // if the model prediction is greater than zero
            total -= 100; // deduct 100 from the total
        }
    }
}


for (all games) {
	if (prediction > 0.5 && homeWin == true) {
		total += 100 + absolute(homeMoneyline);
	} else if (prediction < 0.5 && homeWin == false) {
        total += 100 + absolute(awayMoneyline);
	}
}
