function ConvertToReverseString() {
    const stringIn = document.getElementById('String').value; 
    let i;
    let stringOut = ""; // Changed variable name and initialized as empty string
    for (i = stringIn.length - 1; i >= 0; i--) {
        stringOut += stringIn[i]; // Concatenate characters to form the reversed string
    }
    document.getElementById('ReverseString').value = stringOut; // Corrected variable name
}