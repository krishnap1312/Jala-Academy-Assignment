// Q: Create an array consisting of fruits names and when we click on a button sort it in descending order.



const fruits = ['Apple', 'Banana', 'Cherry', 'Peach', 'Mongo', 'Strawberry', 'Grape'];

function displyFruits() {
    const fruitList = document.getElementById('fruit-list');
    fruitList.innerHTML = ''; 

    fruits.forEach(fruit => {
        const li = document.createElement('li');
        li.textContent = fruit;
        fruitList.appendChild(li);
    });
}

function sortFruits() {
    fruits.sort((a, b) => b.localeCompare(a));
    displyFruits();
}

displyFruits();

document.getElementById('sort-button').addEventListener('click', sortFruits);
