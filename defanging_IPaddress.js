/**
 * Problem No: 1108
 * Replaces dots in the IPv4 address with the string '[.]'
 * @param {string} address - The IPv4 address 
 */
function defangIPaddr(address){
    newAddress = ''
    for( i in address) {
        if(address[i] == '.'){
            newAddress = newAddress.concat('[.]');
        }
        else {
            newAddress = newAddress.concat(address[i]);
        }
    }
    return newAddress;
}

// Testing if the function works - Tested OK!
console.log(defangIPaddr("1.1.1.1"));