
/**
 * Problem No: 771
 * Find the number of jewels (unique characters in J) in string of stones (S)
 * @param {string} J - String containing jewel characters
 * @param {string} S - String containing stone characters
 */
function jewelsinstones(J,S){
    let jewels = new Map();
    let sum = 0;
    for(i in J){
        jewels.set(J[i],0);
    }
    for(i in S){
        if(jewels.has(S.charAt(i))){
            jewels.set(S[i],(jewels.get(S[i])+1));
        }
    }
    for(i in J){
        sum+=jewels.get(J[i]);
    }
    return sum;
}

// Testing the function
let J = 'aA', S='aAABBBBbbb';
console.log(jewelsinstones(J,S));