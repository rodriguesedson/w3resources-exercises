/*
7. Write a JavaScript program to find out if 1st January will be a Sunday between 2014 and 2050.  
*/

function findFirstJanSundays() {
  let yearsFirstJanSunday = [];

  for (let i = 0; i < 47; i++) {
    let date = new Date(`January 1, ${2014 + i}`)
    let day = date.getDay();

    if (day === 0) {
      let year = date.getFullYear();
      yearsFirstJanSunday.push(year);
    }
  }

  return yearsFirstJanSunday;
}

let yearsArray = findFirstJanSundays();

console.log("List of years starting on Sunday:");
for (let i = 0; i < yearsArray.length; i++) {
  console.log(yearsArray[i].toString());
}