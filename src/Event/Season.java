package Event;

public class Season {
	public int gameCount = 256;
	public Game[] games = new Game[gameCount];
	public double amosTotal = 5000;
	public double eloTotal = 5000;
	public double bingTotal = 5000;
	public double fpiTotal = 5000;
	public Season() {
		// Week 1
		games[0] = new Game (1, "Philadelphia Eagles", -105, "Atlanta Falcons", -105, 0.692196488, 0.65, 0.53, 0.586, true);
		games[1] = new Game (1, "Baltimore Ravens", -340, "Buffalo Bills", 310, 0.725144863, 0.64, 0.66, 0.837, true);
		games[2] = new Game (1, "Cleveland Browns", 160, "Pittsburgh Steelers", -170, 0.315359563, 0.21, 0.27, 0.347, false);
		games[3] = new Game (1, "Indianapolis Colts", 102, "Cincinnati Bengals", -112, 0.376611531, 0.499, 0.61, 0.614, false);
		games[4] = new Game (1, "Miami Dolphins", -108, "Tennessee Titans", -102, 0.703173816, 0.53, 0.42, 0.492, true);
		games[5] = new Game (1, "Minnesota Vikings", -260, "San Francisco 49ers", 240, 0.69011724, 0.76, 0.61, 0.697, true);
		games[6] = new Game (1, "New England Patriots", -245, "Houston Texans", 225, 0.818423152, 0.86, 0.7, 0.726, true);
		games[7] = new Game (1, "New Orleans Saints", -450, "Tampa Bay Buccaneers", 400, 0.69011724, 0.74, 0.77, 0.819, false);
		games[8] = new Game (1, "New York Giants", 123, "Jacksonville Jaguars", -133, 0.411463469, 0.42, 0.42, 0.51, false);
		games[9] = new Game (1, "Los Angeles Chargers", -185, "Kansas City Chiefs", 170, 0.389966518, 0.56, 0.55, 0.624, false);
		games[10] = new Game (1, "Arizona Cardinals", -121, "Washington Redskins", 111, 0.69011724, 0.61, 0.61, 0.573, false);
		games[11] = new Game (1, "Carolina Panthers", -145, "Dallas Cowboys", 135, 0.690959275, 0.6, 0.55, 0.599, true);
		games[12] = new Game (1, "Denver Broncos", -170, "Seattle Seahawks", 160, 0.388516486, 0.46, 0.58, 0.546, true);
		games[13] = new Game (1, "Green Bay Packers", -280, "Chicago Bears", 255, 0.69011724, 0.63, 0.77, 0.731, true);
		games[14] = new Game (1, "Oakland Raiders", 230, "Los Angeles Rams", -250, 0.691402018, 0.499, 0.39, 0.427, false);
		games[15] = new Game (1, "Detroit Lions", -315, "New York Jets", 285, 0.69011724, 0.71, 0.78, 0.716, false);
		// Week 2
		games[16] = new Game (2, "Cincinnati Bengals", -106, "Baltimore Ravens", -104, 0.724119067, 0.501, 0.6, 0.438, true);
		games[17] = new Game (2, "Atlanta Falcons", -234, "Carolina Panthers", 209, 0.694606781, 0.62, 0.66, 0.652, true);
		games[18] = new Game (2, "Buffalo Bills", 270, "Los Angeles Chargers", -307, 0.513682663, 0.53, 0.3, 0.244, false);
		games[19] = new Game (2, "Green Bay Packers", 109, "Minnesota Vikings", -120, 0.302207798, 0.4, 0.47, 0.596, false);
		games[20] = new Game (2, "New Orleans Saints", -439, "Cleveland Browns", 376, 0.779422343, 0.85, 0.72, 0.744, true);
		games[21] = new Game (2, "New York Jets", -161, "Miami Dolphins", 145, 0.755173981, 0.61, 0.53, 0.621, false);
		games[22] = new Game (2, "Pittsburgh Steelers", -202, "Kansas City Chiefs", 181, 0.826536953, 0.58, 0.61, 0.646, false);
		games[23] = new Game (2, "Tampa Bay Buccaneers", 133, "Philadelphia Eagles", -147, 0.803180933, 0.37, 0.51, 0.401, true);
		games[24] = new Game (2, "Tennessee Titans", 159, "Houston Texans", -176, 0.667679667, 0.7, 0.4, 0.504, true);
		games[25] = new Game (2, "Washington Redskins", -239, "Indianapolis Colts", 213, 0.830723882, 0.75, 0.69, 0.699, false);
		games[26] = new Game (2, "Los Angeles Rams", -687, "Arizona Cardinals", 560, 0.751318514, 0.74, 0.79, 0.855, true);
		games[27] = new Game (2, "San Francisco 49ers", -236, "Detroit Lions", 210, 0.282898724, 0.58, 0.61, 0.744, true);
		games[28] = new Game (2, "Denver Broncos", -235, "Oakland Raiders", 209, 0.68825841, 0.63, 0.7, 0.636, true);
		games[29] = new Game (2, "Jacksonville Jaguars", 115, "New England Patriots", -127, 0.455849856, 0.44, 0.4, 0.503, true);
		games[30] = new Game (2, "Dallas Cowboys", -152, "New York Giants", 138,  0.693181217, 0.76, 0.6, 0.713, true);
		games[31] = new Game (2, "Chicago Bears", -234, "Seattle Seahawks", 209, 0.355490893, 0.46, 0.55, 0.578, true);
		// Week 3
		games[32] = new Game (3, "Cleveland Browns", -173,  "New York Jets", 163, 0.366145343, 0.38, 0.72, 0.606, true);
		games[33] = new Game (3, "Atlanta Falcons", -117, "New Orleans Saints", 107, 0.548553407, 0.66, 0.66, 0.642, false);
		games[34] = new Game (3, "Baltimore Ravens", -220, "Denver Broncos", 200, 0.511425376, 0.68, 0.68, 0.782, true);
		games[35] = new Game (3, "Carolina Panthers", -143, "Cincinnati Bengals", 133, 0.87452209, 0.63, 0.28, 0.576, true);
		games[36] = new Game (3, "Houston Texans", -255, "New York Giants", 235, 0.666123271, 0.59, 0.59, 0.692, false);
		games[37] = new Game (3, "Jacksonville Jaguars", -440, "Tennessee Titans", 390, 0.890880823, 0.71, 0.71, 0.769, false);
		games[38] = new Game (3, "Kansas City Chiefs", -245, "San Francisco 49ers", 225,  0.776609838, 0.77, 0.77, 0.645, true);
		games[39] = new Game (3, "Miami Dolphins", -138, "Oakland Raiders", 128, 0.605597079, 0.68, 0.63, 0.661, true);
		games[40] = new Game (3, "Minnesota Vikings", -1150, "Buffalo Bills", 950, 0.773922384, 0.78, 0.79, 0.907, false);
		games[41] = new Game (3, "Philadelphia Eagles", -270, "Indianapolis Colts", 248, 0.731303513, 0.83, 0.66, 0.729, true);
		games[42] = new Game (3, "Washington Redskins", 113, "Green Bay Packers", -123, 0.537835598, 0.57, 0.43, 0.517, true);
		games[43] = new Game (3, "Los Angeles Rams", -300, "Los Angeles Chargers", 270, 0.526342392, 0.64, 0.75, 0.728, true);
		games[44] = new Game (3, "Arizona Cardinals", 200, "Chicago Bears", -220, 0.295320421, 0.55, 0.43, 0.443, false);
		games[45] = new Game (3, "Seattle Seahawks", -118, "Dallas Cowboys", 108, 0.644714355, 0.55, 0.55, 0.536, true);
		games[46] = new Game (3, "Detroit Lions", 270, "New England Patriots", -300, 0.302207917, 0.36, 0.64, 0.389, true);
		games[47] = new Game (3, "Tampa Bay Buccaneers", -110, "Pittsburgh Steelers", 100, 0.474796951, 0.54, 0.43, 0.468, false);
		// Week 4
		games[48] = new Game (4, "Los Angeles Rams", -290, "Minnesota Vikings", 260, 0.780228436, 0.65, 0.73, 0.797, true);
		games[49] = new Game (4, "Atlanta Falcons", -175, "Cincinnati Bengals", 165, 0.845108032, 0.68, 0.6, 0.663, false);
		games[50] = new Game (4, "Chicago Bears", -135, "Tampa Bay Buccaneers", 125, 0.488132209, 0.53, 0.55, 0.576, true);
		games[51] = new Game (4, "Dallas Cowboys", -130, "Detroit Lions", 120, 0.221208528, 0.62, 0.64, 0.687, true);
		games[52] = new Game (4, "Green Bay Packers", -345, "Buffalo Bills", 315,  0.663021147, 0.53, 0.67, 0.755, true);
		games[53] = new Game (4, "Indianapolis Colts", 104, "Houston Texans", -114, 0.608602524, 0.67, 0.53, 0.605, false);
		games[54] = new Game (4, "Jacksonville Jaguars", -325, "New York Jets", 295, 0.709253013, 0.74, 0.7, 0.727, true);
		games[55] = new Game (4, "New England Patriots", -280, "Miami Dolphins", 255, 0.706515551, 0.7, 0.67, 0.722, true);
		games[56] = new Game (4, "Tennessee Titans", 125, "Philadelphia Eagles", -135, 0.360089689, 0.4, 0.42, 0.38, true);
		games[57] = new Game (4, "Arizona Cardinals", 170, "Seattle Seahawks", -185, 0.185039252, 0.43, 0.33, 0.323, false);
		games[58] = new Game (4, "Oakland Raiders", -133, "Cleveland Browns", 123, 0.716109514, 0.71, 0.57, 0.656, true);
		games[59] = new Game (4, "Los Angeles Chargers", -415, "San Francisco 49ers", 370, 0.54143101, 0.68, 0.67, 0.756, true);
		games[60] = new Game (4, "New York Giants", 152, "New Orleans Saints", -162, 0.356174171, 0.35, 0.57, 0.493, false);
		games[61] = new Game (4, "Pittsburgh Steelers", -155, "Baltimore Ravens", 145, 0.619617105, 0.63, 0.6, 0.556, false);
		games[62] = new Game (4, "Denver Broncos", 168,  "Kansas City Chiefs", -180, 0.900165498, 0.35, 0.33, 0.42, false);
		// Week 5
		games[63] = new Game (5, "New England Patriots", "Indianapolis Colts", 0.798925757, 0.83, 0.8, 0.767, true);
		games[64] = new Game (5, "Buffalo Bills", "Tennessee Titans", 0.185080439, 0.52, 0.34, 0.428, true);
		games[65] = new Game (5, "Carolina Panthers", "New York Giants", 0.798925757, 0.8, 0.7, 0.734, true);
		games[66] = new Game (5, "Cincinnati Bengals", "Miami Dolphins", 0.737158656, 0.63, 0.63, 0.759, true);
		games[67] = new Game (5, "Cleveland Browns", "Baltimore Ravens", 0.282898724, 0.24, 0.4, 0.278, true);
		games[68] = new Game (5, "Detroit Lions", "Green Bay Packers", 0.476007432, 0.6, 0.4, 0.496, true);
		games[69] = new Game (5, "Kansas City Chiefs", "Jacksonville Jaguars", 0.676464617, 0.68, 0.67, 0.589, true);
		games[70] = new Game (5, "New York Jets", "Denver Broncos", 0.282898813, 0.56, 0.63, 0.588, true);
		games[71] = new Game (5, "Pittsburgh Steelers", "Atlanta Falcons", 0.716278076, 0.57, 0.58, 0.584, true);
		games[72] = new Game (5, "Los Angeles Chargers", "Oakland Raiders", 0.421996087, 0.73, 0.61, 0.734, true);
		games[73] = new Game (5, "Philadelphia Eagles", "Minnesota Vikings", 0.780517459, 0.7, 0.64, 0.6, false);
		games[74] = new Game (5, "San Francisco 49ers", "Arizona Cardinals", 0.883117259, 0.66, 0.55, 0.756, false);
		games[75] = new Game (5, "Seattle Seahawks", "Los Angeles Rams", 0.518816292 ,0.501, 0.26, 0.344, false);
		games[76] = new Game (5, "Houston Texans", "Dallas Cowboys", 0.562096596, 0.39, 0.51, 0.581, true);
		games[77] = new Game (5, "New Orleans Saints", "Washington Redskins", 0.65462172, 0.73, 0.66, 0.618, true);
		// Week 6
		games[78] = new Game (6, "New York Giants", "Philadelphia Eagles", 0.336127788, 0.29, 0.43, 0.501, false);
		games[79] = new Game (6, "Atlanta Falcons", "Tampa Bay Buccaneers", 0.780185819, 0.67, 0.66, 0.651, true);
		games[80] = new Game (6, "Cincinnati Bengals", "Pittsburgh Steelers", 0.406416595, 0.54, 0.53, 0.529, false);
		games[81] = new Game (6, "Cleveland Browns", "Los Angeles Chargers", 0.282898724, 0.31, 0.51, 0.399, false);
		games[82] = new Game (6, "Houston Texans", "Buffalo Bills", 0.545750499, 0.48, 0.75, 0.782, true);
		games[83] = new Game (6, "Miami Dolphins", "Chicago Bears", 0.353632063, 0.54, 0.4, 0.36, true);
		games[84] = new Game (6, "Minnesota Vikings", "Arizona Cardinals", 0.773922443, 0.74, 0.78, 0.844, true);
		games[85] = new Game (6, "New York Jets", "Indianapolis Colts", 0.674469054, 0.67, 0.63, 0.492, true);
		games[86] = new Game (6, "Oakland Raiders", "Seattle Seahawks", 0.562096596, 0.33, 0.3, 0.34, false);
		games[87] = new Game (6, "Washington Redskins", "Carolina Panthers", 0.336127788, 0.45, 0.61, 0.55, false);
		games[88] = new Game (6, "Denver Broncos", "Los Angeles Rams", 0.428606689, 0.31, 0.28, 0.23, false);
		games[89] = new Game (6, "Dallas Cowboys", "Jacksonville Jaguars", 0.485489577, 0.53, 0.4, 0.561, true);
		games[90] = new Game (6, "Tennessee Titans", "Baltimore Ravens", 0.477920741, 0.53, 0.43, 0.426, false);
		games[91] = new Game (6, "New England Patriots", "Kansas City Chiefs", 0.830252886, 0.54, 0.54, 0.666, true);
		games[92] = new Game (6, "Green Bay Packers", "San Francisco 49ers", 0.884425342, 0.66, 0.67, 0.786, true);
		// Week 7
		games[93] = new Game (7, "Arizona Cardinals", "Denver Broncos", 0.661448896, 0.61, 0.39, 0.476, false);
		games[94] = new Game (7, "Chicago Bears", "New England Patriots", 0.336127788, 0.4, 0.37, 0.508, false);
		games[95] = new Game (7, "Indianapolis Colts", "Buffalo Bills", 0.497003049, 0.48, 0.57, 0.764, true);
		games[96] = new Game (7, "Jacksonville Jaguars", "Houston Texans", 0.61953938, 0.72, 0.61, 0.607, false);
		games[97] = new Game (7, "Kansas City Chiefs", "Cincinnati Bengals", 0.667136073, 0.76, 0.63, 0.699, true);
		games[98] = new Game (7, "Miami Dolphins", "Detroit Lions", 0.539189816, 0.56, 0.45, 0.509, false);
		games[99] = new Game (7, "New York Jets", "Minnesota Vikings", 0.336127788, 0.44, 0.47, 0.441, false);
		games[100] = new Game (7, "Philadelphia Eagles", "Carolina Panthers", 0.809611261, 0.69, 0.67, 0.698, false);
		games[101] = new Game (7, "Tampa Bay Buccaneers", "Cleveland Browns", 0.902846038, 0.77, 0.67, 0.741, true);
		games[102] = new Game (7, "Baltimore Ravens", "New Orleans Saints", 0.488773346, 0.57, 0.6, 0.604, false);
		games[103] = new Game (7, "Washington Redskins", "Dallas Cowboys", 0.467120886, 0.53, 0.53, 0.478, true);
		games[104] = new Game (7, "San Francisco 49ers", "Los Angeles Rams", 0.336127788, 0.29, 0.26, 0.264, false);
		games[105] = new Game (7, "Los Angeles Chargers", "Tennessee Titans", 0.697015643, 0.62, 0.61, 0.719, true);
		games[106] = new Game (7, "Atlanta Falcons", "New York Giants", 0.833969593, 0.8, 0.69, 0.696, true);
		// Week 8
		games[107] = new Game (8, "Houston Texans", "Miami Dolphins", 0.496529371, 0.6, 0.75, 0.751, true);
		games[108] = new Game (8, "Carolina Panthers", "Baltimore Ravens", 0.565738976, 0.57, 0.47, 0.476, true);
		games[109] = new Game (8, "Chicago Bears", "New York Jets", 0.521144271, 0.65, 0.72, 0.762, true);
		games[110] = new Game (8, "Cincinnati Bengals", "Tampa Bay Buccaneers", 0.468589216, 0.62, 0.69, 0.65, true);
		games[111] = new Game (8, "Detroit Lions", "Seattle Seahawks", 0.810265183, 0.57, 0.53, 0.422, false);
		games[112] = new Game (8, "Kansas City Chiefs", "Denver Broncos", 0.776609838, 0.82, 0.74, 0.784, true);
		games[113] = new Game (8, "New York Giants", "Washington Redskins", 0.366145343, 0.39, 0.47, 0.579, false);
		games[114] = new Game (8, "Pittsburgh Steelers", "Cleveland Browns", 0.798925757, 0.88, 0.77, 0.88, true);
		games[115] = new Game (8, "Oakland Raiders", "Indianapolis Colts", 0.667750299, 0.56, 0.45, 0.509, false);
		games[116] = new Game (8, "Arizona Cardinals", "San Francisco 49ers", 0.307542413, 0.58, 0.67, 0.444, true);
		games[117] = new Game (8, "Los Angeles Rams", "Green Bay Packers", 0.870893836, 0.79, 0.75, 0.798, true);
		games[118] = new Game (8, "Minnesota Vikings", "New Orleans Saints", 0.70728296, 0.55, 0.6, 0.56, false);
		games[119] = new Game (8, "Jacksonville Jaguars", "Philadelphia Eagles", 0.336127788, 0.33, 0.42, 0.371, false);
		games[120] = new Game (8, "Buffalo Bills", "New England Patriots", 0.360089689, 0.29, 0.27, 0.164, false);
		// Week 9
		games[121] = new Game (9, "San Francisco 49ers", "Oakland Raiders", 0.456749469, 0.62, 0.69, 0.628, true);
		games[122] = new Game (9, "Baltimore Ravens", "Pittsburgh Steelers", 0.455849797, 0.54, 0.55, 0.583, false);
		games[123] = new Game (9, "Buffalo Bills", "Chicago Bears", 0.628659189, 0.46, 0.42, 0.202, false);
		games[124] = new Game (9, "Carolina Panthers", "Tampa Bay Buccaneers", 0.419976801, 0.76, 0.67, 0.803, true);
		games[125] = new Game (9, "Cleveland Browns", "Kansas City Chiefs", 0.282898724, 0.16, 0.22, 0.218, false);
		games[126] = new Game (9, "Miami Dolphins", "New York Jets", 0.35665229, 0.62, 0.63, 0.611, true);
		games[127] = new Game (9, "Minnesota Vikings", "Detroit Lions", 0.684103787, 0.68, 0.67, 0.732, true);
		games[128] = new Game (9, "Washington Redskins", "Atlanta Falcons", 0.518816292, 0.55, 0.6, 0.498, true);
		games[129] = new Game (9, "Denver Broncos", "Houston Texans", 0.44622159, 0.54, 0.55, 0.507, false);
		games[130] = new Game (9, "Seattle Seahawks", "Los Angeles Chargers", 0.526342392, 0.61, 0.61, 0.519, false);
		games[131] = new Game (9, "New Orleans Saints", "Los Angeles Rams", 0.707261264, 0.59, 0.57, 0.498, true);
		games[132] = new Game (9, "New England Patriots", "Green Bay Packers", 0.706515551, 0.81, 0.69, 0.682, true);
		games[133] = new Game (9, "Dallas Cowboys", "Tennessee Titans", 0.72795105, 0.66, 0.61, 0.751, false);
		// Week 10
		games[134] = new Game (10, "Pittsburgh Steelers", "Carolina Panthers", 0.855662227, 0.61, 0.57, 0.66, true);
		games[135] = new Game (10, "Chicago Bears", "Detroit Lions", 0.446986824, 0.65, 0.69, 0.756, true);
		games[136] = new Game (10, "Cincinnati Bengals", "New Orleans Saints", 0.455849856, 0.36, 0.34, 0.468, false);
		games[137] = new Game (10, "Cleveland Browns", "Atlanta Falcons", 0.282898724, 0.22, 0.37, 0.316, true);
		games[138] = new Game (10, "Green Bay Packers", "Miami Dolphins", 0.660701931, 0.61, 0.74, 0.82, true);
		games[139] = new Game (10, "Indianapolis Colts", "Jacksonville Jaguars", 0.645841897, 0.56, 0.63, 0.678, true);
		games[140] = new Game (10, "Kansas City Chiefs", "Arizona Cardinals", 0.833984852, 0.88, 0.84, 0.938, true);
		games[141] = new Game (10, "New York Jets", "Buffalo Bills", 0.361223876, 0.63, 0.77, 0.718, false);
		games[142] = new Game (10, "Tampa Bay Buccaneers", "Washington Redskins", 0.449848682, 0.54, 0.58, 0.543, false);
		games[143] = new Game (10, "Tennessee Titans", "New England Patriots", 0.455849856, 0.37, 0.28, 0.373, true);
		games[144] = new Game (10, "Oakland Raiders", "Los Angeles Chargers", 0.282898724, 0.24, 0.25, 0.244, false);
		games[145] = new Game (10, "Los Angeles Rams", "Seattle Seahawks", 0.654622078, 0.69, 0.69, 0.769, true);
		games[146] = new Game (10, "Philadelphia Eagles", "Dallas Cowboys", 0.776609838, 0.74, 0.67, 0.736, false);
		games[147] = new Game (10, "San Francisco 49ers", "New York Giants", 0.397668362, 0.67, 0.63, 0.559, false);
		// Week 11
		games[148] = new Game (11, "Seattle Seahawks", "Green Bay Packers", 0.526342392, 0.67, 0.61, 0.605, true);
		games[149] = new Game (11, "Atlanta Falcons", "Dallas Cowboys", 0.814941466, 0.62, 0.64, 0.594, false);
		games[150] = new Game (11, "Baltimore Ravens", "Cincinnati Bengals", 0.537797034, 0.67, 0.6, 0.802, true);
		games[151] = new Game (11, "Chicago Bears", "Minnesota Vikings", 0.336127788, 0.54, 0.63, 0.575, true);
		games[152] = new Game (11, "Detroit Lions", "Carolina Panthers", 0.336127788, 0.43, 0.4, 0.406, true);
		games[153] = new Game (11, "Indianapolis Colts", "Tennessee Titans", 0.284676492, 0.45, 0.45, 0.624, true);
		games[154] = new Game (11, "New Orleans Saints", "Philadelphia Eagles", 0.657443702, 0.74, 0.79, 0.741, true);
		games[155] = new Game (11, "New York Giants", "Tampa Bay Buccaneers", 0.446512938, 0.52, 0.63, 0.705, true);
		games[156] = new Game (11, "Washington Redskins", "Houston Texans", 0.825831056, 0.62, 0.42, 0.447, false);
		games[157] = new Game (11, "Arizona Cardinals", "Oakland Raiders", 0.38001883, 0.68, 0.66, 0.548, false);
		games[158] = new Game (11, "Los Angeles Chargers", "Denver Broncos", 0.710192263, 0.8, 0.72, 0.763, false);
		games[159] = new Game (11, "Jacksonville Jaguars", "Pittsburgh Steelers", 0.336127788, 0.32, 0.23, 0.355, false);
		games[160] = new Game (11, "Los Angeles Rams", "Kansas City Chiefs", 0.769340873, 0.54, 0.53, 0.635, true);
		// Week 12
		games[161] = new Game (12, "Detroit Lions", "Chicago Bears", 0.428568244, 0.47, 0.33, 0.362, false);
		games[162] = new Game (12, "Dallas Cowboys", "Washington Redskins", 0.844017327, 0.65, 0.74, 0.742, true);
		games[163] = new Game (12, "New Orleans Saints", "Atlanta Falcons", 0.859654725, 0.81, 0.77, 0.802, true);
		games[164] = new Game (12, "Baltimore Ravens", "Oakland Raiders", 0.709871948, 0.83, 0.8, 0.869, true);
		games[165] = new Game (12, "Buffalo Bills", "Jacksonville Jaguars", 0.594179749, 0.56, 0.47, 0.517, true);
		games[166] = new Game (12, "Carolina Panthers", "Seattle Seahawks", 0.810048878, 0.62, 0.53, 0.595, false);
		games[167] = new Game (12, "Cincinnati Bengals", "Cleveland Browns", 0.710220218, 0.75, 0.55, 0.668, false);
		games[168] = new Game (12, "Indianapolis Colts","Miami Dolphins", 0.785458207, 0.68, 0.72, 0.823, true);
		games[169] = new Game (12, "New York Jets", "New England Patriots", 0.336127788, 0.23, 0.31, 0.2, false);
		games[170] = new Game (12, "Philadelphia Eagles", "New York Giants", 0.798925757, 0.8, 0.7, 0.678, true);
		games[171] = new Game (12, "Tampa Bay Buccaneers", "San Francisco 49ers", 0.524047911, 0.63, 0.57, 0.655, true);
		games[172] = new Game (12, "Los Angeles Chargers", "Arizona Cardinals", 0.752600729, 0.84, 0.77, 0.93, true);
		games[173] = new Game (12, "Denver Broncos", "Pittsburgh Steelers", 0.428606689, 0.3, 0.36, 0.397, true);
		games[174] = new Game (12, "Minnesota Vikings", "Green Bay Packers", 0.75113976, 0.71, 0.66, 0.563, true);
		games[175] = new Game (12, "Houston Texans", "Tennessee Titans", 0.816673577, 0.58, 0.64, 0.742, true);
		// Week 13
		games[176] = new Game (13, "Dallas Cowboys", "New Orleans Saints", 0.441127628, 0.36, 0.3, 0.379, true);
		games[177] = new Game (13, "Atlanta Falcons", "Baltimore Ravens", 0.49506253, 0.53, 0.43, 0.565, false);
		games[178] = new Game (13, "Cincinnati Bengals", "Denver Broncos", 0.407623589, 0.52, 0.45, 0.471, false);
		games[179] = new Game (13, "Detroit Lions", "Los Angeles Rams", 0.455849856, 0.32, 0.26, 0.246, false);
		games[180] = new Game (13, "Green Bay Packers", "Arizona Cardinals", 0.716109514, 0.73 ,0.75, 0.92, false);
		games[181] = new Game (13, "Houston Texans", "Cleveland Browns", 0.709253073, 0.77, 0.64, 0.798, true);
		games[182] = new Game (13, "Jacksonville Jaguars", "Indianapolis Colts", 0.451401263, 0.49, 0.34, 0.425, true);
		games[183] = new Game (13, "Miami Dolphins", "Buffalo Bills", 0.58888495, 0.58, 0.66, 0.575, true);
		games[184] = new Game (13, "New York Giants", "Chicago Bears", 0.282898724, 0.31, 0.34, 0.458, true);
		games[185] = new Game (13, "Pittsburgh Steelers", "Los Angeles Chargers", 0.639294624, 0.62, 0.63, 0.589, false);
		games[186] = new Game (13, "Tampa Bay Buccaneers", "Carolina Panthers", 0.38613978, 0.41, 0.36, 0.499, true);
		games[187] = new Game (13, "Oakland Raiders", "Kansas City Chiefs", 0.336127788, 0.17, 0.21, 0.161, false);
		games[188] = new Game (13, "Tennessee Titans", "New York Jets", 0.644009233, 0.78, 0.69, 0.789, true);
		games[189] = new Game (13, "New England Patriots", "Minnesota Vikings", 0.651887655, 0.67, 0.67, 0.676, true);
		games[190] = new Game (13, "Seattle Seahawks", "San Francisco 49ers", 0.798925757, 0.83, 0.75, 0.814, true);
		games[191] = new Game (13, "Philadelphia Eagles", "Washington Redskins", 0.776609838, 0.69, 0.64, 0.677, true);
		// Week 14
		games[192] = new Game (14, "Tennessee Titans", "Jacksonville Jaguars", 0.664421082, 0.66, 0.63, 0.634, true);
		games[193] = new Game (14, "Buffalo Bills", "New York Jets", 0.397257745, 0.7, 0.58, 0.715, false);
		games[194] = new Game (14, "Chicago Bears", "Los Angeles Rams", 0.455849856, 0.44, 0.51, 0.432, true);
		games[195] = new Game (14, "Cleveland Browns", "Carolina Panthers", 0.282898724, 0.38, 0.45, 0.399, true);
		games[196] = new Game (14, "Green Bay Packers", "Atlanta Falcons", 0.377987891, 0.53, 0.66, 0.641, true);
		games[197] = new Game (14, "Houston Texans", "Indianapolis Colts", 0.694713771, 0.68, 0.63, 0.64, false);
		games[198] = new Game (14, "Kansas City Chiefs", "Baltimore Ravens", 0.619617105, 0.71, 0.72, 0.752, true);
		games[199] = new Game (14, "Miami Dolphins", "New England Patriots", 0.386747003, 0.28, 0.28, 0.241, true);
		games[200] = new Game (14, "Tampa Bay Buccaneers", "New Orleans Saints", 0.302207917, 0.26, 0.27, 0.256, false);
		games[201] = new Game (14, "Washington Redskins", "New York Giants", 0.98173815, 0.69, 0.53, 0.533, false);
		games[202] = new Game (14, "Los Angeles Chargers", "Cincinnati Bengals", 0.775171816, 0.84, 0.8, 0.903, true);
		games[203] = new Game (14, "San Francisco 49ers", "Denver Broncos", 0.366145343, 0.37, 0.28, 0.402, true);
		games[204] = new Game (14, "Arizona Cardinals", "Detroit Lions", 0.499581993, 0.51, 0.45, 0.438, false);
		games[205] = new Game (14, "Dallas Cowboys", "Philadelphia Eagles", 0.488773346, 0.59, 0.63, 0.672, true);
		games[206] = new Game (14, "Oakland Raiders", "Pittsburgh Steelers", 0.336127788, 0.22, 0.25, 0.263, true);
		games[207] = new Game (14, "Seattle Seahawks", "Minnesota Vikings", 0.711187363, 0.62, 0.57, 0.655, true);
		// Week 15
		games[208] = new Game (15, "Kansas City Chiefs", "Los Angeles Chargers", 0.657222867, 0.66, 0.6, 0.633, false);
		games[209] = new Game (15, "Denver Broncos", "Cleveland Browns", 0.378783196, 0.69, 0.57, 0.771, false);
		games[210] = new Game (15, "New York Jets", "Houston Texans", 0.282898724, 0.36, 0.27, 0.305, false);
		games[211] = new Game (15, "Atlanta Falcons", "Arizona Cardinals", 0.716109514, 0.73, 0.7, 0.89, true);
		games[212] = new Game (15, "Baltimore Ravens", "Tampa Bay Buccaneers", 0.423127562, 0.76, 0.77, 0.7, true);
		games[213] = new Game (15, "Buffalo Bills", "Detroit Lions", 0.4837403, 0.49, 0.53, 0.55, true);
		games[214] = new Game (15, "Chicago Bears", "Green Bay Packers", 0.422477603, 0.74, 0.66, 0.627, true);
		games[215] = new Game (15, "Cincinnati Bengals", "Oakland Raiders", 0.608602166, 0.66, 0.57, 0.68, true);
		games[216] = new Game (15, "Indianapolis Colts", "Dallas Cowboys", 0.30221191, 0.47, 0.6, 0.601, true);
		games[217] = new Game (15, "Jacksonville Jaguars", "Washington Redskins", 0.550280809, 0.6, 0.73, 0.681, false);
		games[218] = new Game (15, "Minnesota Vikings", "Miami Dolphins", 0.833984852, 0.72, 0.69, 0.825, true);
		games[219] = new Game (15, "New York Giants", "Tennessee Titans", 0.494627178, 0.49, 0.53, 0.585, false);
		games[220] = new Game (15, "San Francisco 49ers", "Seattle Seahawks", 0.336127788, 0.29, 0.25, 0.34, true);
		games[221] = new Game (15, "Pittsburgh Steelers", "New England Patriots", 0.406313151, 0.51, 0.45, 0.597, true);
		games[222] = new Game (15, "Los Angeles Rams", "Philadelphia Eagles", 0.871495545, 0.7, 0.72, 0.783, false);
		games[223] = new Game (15, "Carolina Panthers", "New Orleans Saints", 0.40588522, 0.31, 0.22, 0.34, false);
		// Week 16
		games[224] = new Game (16, "Tennessee Titans", "Washington Redskins", 0.809020698, 0.73, 0.73, 0.757, true);
		games[225] = new Game (16, "Los Angeles Chargers", "Baltimore Ravens", 0.654586911, 0.66, 0.63, 0.795, false);
		games[226] = new Game (16, "Carolina Panthers", "Atlanta Falcons", 0.511425018, 0.62, 0.57, 0.595, false);
		games[227] = new Game (16, "Cleveland Browns", "Cincinnati Bengals", 0.409733027, 0.6, 0.6, 0.602, true);
		games[228] = new Game (16, "Dallas Cowboys", "Tampa Bay Buccaneers", 0.811692953, 0.75, 0.7, 0.69, true);
		games[229] = new Game (16, "Detroit Lions", "Minnesota Vikings", 0.336127788, 0.45, 0.37, 0.405, false);
		games[230] = new Game (16, "Indianapolis Colts", "New York Giants", 0.696983278, 0.74, 0.79, 0.735, true);
		games[231] = new Game (16, "Miami Dolphins", "Jacksonville Jaguars", 0.810084343, 0.61, 0.64, 0.507, false);
		games[232] = new Game (16, "New England Patriots", "Buffalo Bills", 0.833984852, 0.84, 0.78, 0.86, true);
		games[233] = new Game (16, "New York Jets", "Green Bay Packers", 0.282898724, 0.43, 0.52, 0.317, false);
		games[234] = new Game (16, "Philadelphia Eagles", "Houston Texans", 0.718134344, 0.66, 0.34, 0.553, true);
		games[235] = new Game (16, "Arizona Cardinals", "Los Angeles Rams", 0.327657491, 0.23, 0.26, 0.112, false);
		games[236] = new Game (16, "San Francisco 49ers", "Chicago Bears", 0.366806328, 0.32, 0.37, 0.35, false);
		games[237] = new Game (16, "New Orleans Saints", "Pittsburgh Steelers", 0.809611261, 0.74, 0.64, 0.709, true);
		games[238] = new Game (16, "Seattle Seahawks", "Kansas City Chiefs", 0.518816292, 0.46, 0.42, 0.479, true);
		games[239] = new Game (16, "Oakland Raiders", "Denver Broncos", 0.327703178, 0.39, 0.39, 0.39, true);
		// Week 17
		games[240] = new Game (17, "Baltimore Ravens", "Cleveland Browns", 0.737878382, 0.81, 0.66, 0.79, true);
		games[241] = new Game (17, "Buffalo Bills", "Miami Dolphins", 0.675661206, 0.59, 0.6, 0.673, true);
		games[242] = new Game (17, "Green Bay Packers", "Detroit Lions", 0.524047911, 0.65, 0.74, 0.806, false);
		games[243] = new Game (17, "Houston Texans", "Jacksonville Jaguars", 0.770095706, 0.71, 0.74, 0.767, true);
		games[244] = new Game (17, "Kansas City Chiefs", "Oakland Raiders", 0.833984852, 0.88, 0.79, 0.917, true);
		games[245] = new Game (17, "Minnesota Vikings", "Chicago Bears", 0.654622018, 0.56, 0.64, 0.576, false);
		games[246] = new Game (17, "New England Patriots", "New York Jets", 0.833984852, 0.89, 0.77, 0.889, true);
		games[247] = new Game (17, "New Orleans Saints", "Carolina Panthers", 0.776609838, 0.87, 0.58, 0.889, false);
		games[248] = new Game (17, "New York Giants", "Dallas Cowboys", 0.336127788, 0.38, 0.66, 0.527, false);
		games[249] = new Game (17, "Pittsburgh Steelers", "Cincinnati Bengals", 0.833984852, 0.83, 0.75, 0.864, true);
		games[250] = new Game (17, "Tampa Bay Buccaneers", "Atlanta Falcons", 0.302207917, 0.46, 0.51, 0.475, false);
		games[251] = new Game (17, "Tennessee Titans", "Indianapolis Colts", 0.503009379, 0.62, 0.43, 0.482, false);
		games[252] = new Game (17, "Washington Redskins", "Philadelphia Eagles", 0.336127788, 0.35, 0.31, 0.425, false);
		games[253] = new Game (17, "Denver Broncos", "Los Angeles Chargers", 0.336127788, 0.36, 0.28, 0.389, false);
		games[254] = new Game (17, "Los Angeles Rams", "San Francisco 49ers", 0.833984852, 0.85, 0.75, 0.895, true);
		games[255] = new Game (17, "Seattle Seahawks", "Arizona Cardinals", 0.798925757, 0.88, 0.61, 0.943, true);
	}
	
	public void deductBets() {
		for (int i=0; i < games.length; i++ ) {
			// AMOS
			if (games[i].getAmos() > 50) { // if Amos predicts home to win
				if (games[i].getHomeMoneyline() > 0) { // if homeMoneyline is greater than 0
					amosTotal -= games[i].getHomeMoneyline(); // subtract homeMoneyline from amosTotal
				} else { // if homeMoneyline is less than 0
					amosTotal += games[i].getHomeMoneyline(); // add homeMoneyline to amos total (positive plus a negative is subtraction)
				}
			} else { // if Amos predicts away to win
				if (games[i].getAwayMoneyline() > 0) { // if awayMoneyline is greater than 0
					amosTotal -= games[i].getAwayMoneyline(); // subtract awayMoneyline from amosTotal
				} else { // if awayMoneyline is less than 0
					amosTotal += games[i].getAwayMoneyline(); // add awayMoneyline to amos total (positive plus a negative is subtraction)
				}
			}
			
			// ELO
			if (games[i].getElo() > 50) { // if Elo predicts home to win
				if (games[i].getHomeMoneyline() > 0) { // if homeMoneyline is greater than 0
					eloTotal -= games[i].getHomeMoneyline(); // subtract homeMoneyline from eloTotal
				} else { // if homeMoneyline is less than 0
					eloTotal += games[i].getHomeMoneyline(); // add homeMoneyline to elo total (positive plus a negative is subtraction)
				}
			} else { // if Elo predicts away to win
				if (games[i].getAwayMoneyline() > 0) { // if awayMoneyline is greater than 0
					eloTotal -= games[i].getAwayMoneyline(); // subtract awayMoneyline from eloTotal
				} else { // if awayMoneyline is less than 0
					eloTotal += games[i].getAwayMoneyline(); // add awayMoneyline to elo total (positive plus a negative is subtraction)
				}
			}
			
			// BING
			if (games[i].getBing() > 50) { // if Bing predicts home to win
				if (games[i].getHomeMoneyline() > 0) { // if homeMoneyline is greater than 0
					bingTotal -= games[i].getHomeMoneyline(); // subtract homeMoneyline from bing total
				} else { // if homeMoneyline is less than 0
					bingTotal += games[i].getHomeMoneyline(); // add homeMoneyline to bing total (positive plus a negative is subtraction)
				}
			} else { // if bing predicts away to win
				if (games[i].getAwayMoneyline() > 0) { // if awayMoneyline is greater than 0
					bingTotal -= games[i].getAwayMoneyline(); // subtract awayMoneyline from bing total
				} else { // if awayMoneyline is less than 0
					bingTotal += games[i].getAwayMoneyline(); // add awayMoneyline to bing total (positive plus a negative is subtraction)
				}
			}
			
			// FPI
			if (games[i].getFpi() > 50) { // if Bing predicts home to win
				if (games[i].getHomeMoneyline() > 0) { // if homeMoneyline is greater than 0
					fpiTotal -= games[i].getHomeMoneyline(); // subtract homeMoneyline from fpi total
				} else { // if homeMoneyline is less than 0
					fpiTotal += games[i].getHomeMoneyline(); // add homeMoneyline to fpi total (positive plus a negative is subtraction)
				}
			} else { // if bing predicts away to win
				if (games[i].getAwayMoneyline() > 0) { // if awayMoneyline is greater than 0
					fpiTotal -= games[i].getAwayMoneyline(); // subtract awayMoneyline from fpi total
				} else { // if awayMoneyline is less than 0
					fpiTotal += games[i].getAwayMoneyline(); // add awayMoneyline to fpi total (positive plus a negative is subtraction)
				}
			}
		}
	}
	
	public void applyWinnings() {
		for (int i = 0; i < games.length; i++) {
			// AMOS
			if (games[i].getAmos() > 50 && games[i].getHomeWin() == true) { // if Amos predicts home team and home team wins
				
			} else if (games[i].getAmos() < 50 && games[i].getHomeWin() == false) { // if Amos predicts away team and away team wins
				
			} else { // if Amos is wrong
				
			}
			
			// ELO
			if (games[i].getElo() > 50 && games[i].getHomeWin() == true) { // if elo predicts home team and home team wins
				
			} else if (games[i].getElo() < 50 && games[i].getHomeWin() == false) { // if elo predicts away team and away team wins
				
			} else { // if elo is wrong
				
			}
			
			// BING
			if (games[i].getBing() > 50 && games[i].getHomeWin() == true) { // if Bing predicts home team and home team wins
				
			} else if (games[i].getBing() < 50 && games[i].getHomeWin() == false) { // if Bing predicts away team and away team wins
				
			} else { // if Bing is wrong
				
			}
			
			// FPI
			if (games[i].getFpi() > 50 && games[i].getHomeWin() == true) { // if fpi predicts home team and home team wins
				
			} else if (games[i].getFpi() < 50 && games[i].getHomeWin() == false) { // if fpi predicts away team and away team wins
				
			} else { // if fpi is wrong
				
			}
		}
	}
}
