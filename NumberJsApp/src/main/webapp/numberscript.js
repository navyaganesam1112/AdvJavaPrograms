// Loop through numbers from 1 to 100
for (var i = 1; i <= 100; i++) {
    // Check if the number is divisible by both 3 and 5
    if (i % 3 === 0 && i % 5 === 0) {
        console.log( " FizzBuzz"+"<br>");
        document.write(" FizzBuzz"+"<br>");
       
    }
    // Check if the number is divisible by 3
    else if (i % 3 === 0) {
        console.log(" Fizz"+"<br>");
        document.write(" Fizz"+"<br>");
        
    }
    // Check if the number is divisible by 5
    else if (i % 5 === 0) {
        console.log( " Buzz"+"<br>");
        document.write(" Buzz"+"<br>");
        
    }
    // If none of the above conditions are met, print the number
    else {
        console.log(i+"<br>");
        document.write(i+"<br>");
        
    }
}