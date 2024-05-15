const filter_list = (list) => {
	const result = list.filter(
		(element) => typeof(element) == "number");
	return result;
}

console.log(filter_list([1,2, 'a', 'b']));