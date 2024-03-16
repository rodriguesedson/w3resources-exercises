/*
6. Write a JavaScript program to determine whether a given year is a leap year
in the Gregorian calendar.  
*/

function leapYear(year) {
    let result;

    if(year % 4 === 0) {
        result = true;
    } else if((year % 100 === 0) && (year % 400 === 0)) {
        result = true;
    } else {
        result = false;
    }

    return 'Leap year: ' + result;
}

console.log(leapYear(1994));