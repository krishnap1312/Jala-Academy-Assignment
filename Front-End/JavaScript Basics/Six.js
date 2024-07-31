'use strict'; 

// Attempt to use a variable that is not declared
try {
    undeclaredVar = 'This variable was not declared'; // it will throw error as it is not declared
} catch (error) {
    console.error('Error:', error.message); 
}

console.log('After attempt:', undeclaredVar);

// Proper declaration and usage
let declaredVar = 'This variable is declared';
console.log('Declared variable:', declaredVar); 
