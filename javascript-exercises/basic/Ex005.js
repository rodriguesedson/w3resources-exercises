/*
5. Write a JavaScript program to rotate the string 'w3resource' in the right direction. 
This is done by periodically removing one letter from the string end and attaching it to the front.  
*/
let word = 'w3resource';

function rotateString(word) {
  let rotatedString = '';

  for (let i = word.length - 1; i >= 0; i--) {
    rotatedString += word[i];
  }

  return rotatedString;
}

console.log(rotateString(word));