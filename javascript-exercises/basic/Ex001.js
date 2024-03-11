/*
Write a JavaScript program to display the current day and time in the following format.  
Sample Output : Today is : Tuesday.
Current time is : 10 PM : 30 : 38
*/

// console.log();

let date = new Date();
let day = date.getDay();
let week = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
let hour = date.getHours();
let period = (hour < 12) ? 'AM' : 'PM';
let min = date.getMinutes();
let sec = date.getSeconds();

console.log(`
  Today is : ${week[day]}.
  Current time is : ${hour} ${period} : ${min} : ${sec}
`);