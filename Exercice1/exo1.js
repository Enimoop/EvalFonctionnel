
const calculeBus = (array) => {
	const initialValue = 0;
	const map = array.reduce(
  (accumulator, [montant,descendant]) => accumulator + montant -descendant,
  initialValue,
);
	return map;
}


console.log(calculeBus([[10,0],[3,5],[5,8]]));
console.log(calculeBus([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]));
console.log(calculeBus([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]));