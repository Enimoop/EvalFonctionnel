const createPhoneNumber = (array1) => {
	const number = array1.join("");
	console.log(number);
	const first = number.slice(0,3);
	console.log(first);
	const second = number.slice(3,6);
	const third = number.slice(6);

	const newNumber = "("+first+") "+second+"-"+third;

	return newNumber;
}

console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));