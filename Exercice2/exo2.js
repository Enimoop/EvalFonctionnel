const maskify = (number) => {
	const taille = number.length;
	let start = 0;
	if (taille > 4){
	 start = taille - 4;
	} else {
		return number;
	}

	const end = number.slice(start);

	const debut = "#".repeat(taille-4);

	const newNumb = debut.concat('',end);

	return newNumb;
}


console.log(maskify('4556364607935616'));
console.log(maskify('1'));
console.log(maskify('11111'));