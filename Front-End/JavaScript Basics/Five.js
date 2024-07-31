// Q: Write a program with variable hoisting(initialization first then declaration)

var myVar; //decalaration
console.log('Before declaration:', myVar); 
myVar = 'Hello, world!'; // Initialization 
console.log('After declaration:', myVar); //called


// Function hoisting example
hoistedFunction(); 

function hoistedFunction() {
    console.log('This function is hoisted!');
}

