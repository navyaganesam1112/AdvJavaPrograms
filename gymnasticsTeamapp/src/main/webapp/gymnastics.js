// Scores of Dolphins and Koalas for three rounds
const dolphinsScores = [96, 108, 89];
const koalasScores = [88, 91, 110];

// Function to calculate average score of an array
const calculateAverage = (scores) => {
     let total = 0;
    for (let i = 0; i < scores.length; i++) {
        total += scores[i];
    }
    return total / scores.length;
};

// Calculate average scores for Dolphins and Koalas
const dolphinsAverage = calculateAverage(dolphinsScores);
const koalasAverage = calculateAverage(koalasScores);

// Function to determine the winner based on average scores
const determineWinner = (dolphinsAvg, koalasAvg) => {
    if (dolphinsAvg > koalasAvg && dolphinsAvg >= 100) {
        return "Dolphins win";
    } else if (koalasAvg > dolphinsAvg && koalasAvg >= 100) {
        return "Koalas win";
    } else if (dolphinsAvg === koalasAvg ) {
        return "Both win the trophy";
    } 
};

// Determine the winner and log the result
const winner = determineWinner(dolphinsAverage, koalasAverage);
console.log(winner);
