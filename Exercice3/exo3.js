const DNAStrand = (chaine) => {
	const taille = chaine.length;
	let i;
	let newAdn ='';
	let car;
	for(i=0; i<taille;i++){
		if(chaine.charAt(i)==='A'){
			car = chaine.charAt(i).replace("A","T");
		} else if (chaine.charAt(i)==='T'){
			car = chaine.charAt(i).replace("T","A");
		} else if (chaine.charAt(i)==='C'){
			car = chaine.charAt(i).replace("C","G");
		} else {
			car = chaine.charAt(i).replace("G","C");
		}

		newAdn = newAdn.concat('',car);
	}
	return newAdn;
}


console.log(DNAStrand("ATTGC"));
console.log(DNAStrand("GTAT"));