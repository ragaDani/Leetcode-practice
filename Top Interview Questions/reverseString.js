/**
 * Problem: 334. Reverse String (Easy)
 * Reverse a string in-place with O(1) extra memory.
 * @param {String} str 
 */
function reverseString(str){
    return str.split('').reverse().join('');
}
let str = "helloh";
// Testing reverseString - Confirmed
console.log(reverseString(str));