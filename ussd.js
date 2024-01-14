// import the readline module to get user input
readline = require('node:readline')
class BankUSSD {
main(){

// Define the variable that will be used to get user input
const userInput = readline.createInterface({
input: process.stdin,
output: process.stdout,
});
console.log("Access Bank")
console.log("1>Check balance")
console.log("2>Transfer")
console.log("3>Airtime")
console.log("4>Buy Data")
console.log("\n\n")

// Prompt user to select their option
userInput.question(`Please an option:`, option => {
this.handleInput(option);
input.close();
});
}
// method to handle user input
handleInput(option){
if (option == 1){
console.log("You selected option 1")
} else if (option == 2) {
console.log("You selected option 2")
} else if (option == 3) {
console.log("You selected option 3")
} else if (option == 4) {
console.log("You selected option 4")
} else {
console.log("Unknown option")
}
}
}
// Create an instance of the BankUSSD class
let ussd = new BankUSSD()
// Call the main method
ussd.main()