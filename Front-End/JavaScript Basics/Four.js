// Q: Create an object "person" with properties firstname and lastname. Display these properties using 2 different ways of accessing



const person = {
    firstName: 'John',
    lastName: 'Doe'
};


// Fetching data using dot notation
console.log('Dot Notation:');
console.log('First Name:', person.firstName);
console.log('Last Name:', person.lastName);

console.log("------------------------------------");
// Fetching data using Bracket notation
console.log('Bracket Notation:');
console.log('First Name:', person['firstName']);
console.log('Last Name:', person['lastName']);
