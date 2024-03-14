/*
3. Write a JavaScript program to get the current date.  
Expected Output :
mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy
*/

function currentDate() {
  let date = new Date();
  let day = date.getDay();
  let month = date.getMonth();
  let year = date.getFullYear();

  return day + "-" + month + "-" + year;
}

console.log(currentDate());