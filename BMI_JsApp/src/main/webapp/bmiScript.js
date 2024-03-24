let massRatan=parseInt(prompt("enter the  Ratan mass..."));
let massAnu=parseInt(prompt ("enter the Anu mass...."));

let heightRatan=parseFloat(prompt("Enter the Ratan height.."));
let heightAnu=parseFloat(prompt("Enter the Anu  height.."))

let BMIRatan=massRatan/(heightRatan*heightRatan);
let BMIAnu=massAnu/(heightAnu*heightAnu);

console.log("BMI of Ratan...."+BMIRatan+" "+"BMI of Anu...."+BMIAnu+" ");


document.write("BMI of Ratan...."+BMIRatan+" "+"BMI of Anu...."+BMIAnu+" ");



  console.log("Ratan has higher Bmi...  "+BMIRatan>BMIAnu);
  document.write("Ratan has Higher Bmi........ "+BMIRatan>BMIAnu);
 