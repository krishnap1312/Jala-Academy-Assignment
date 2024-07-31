// Q: Write a program with FOR/IN loop


const person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30,
    occupation: 'Engineer'
};

for (let key in person) {
    console.log(`${key}: ${person[key]}`);
}

