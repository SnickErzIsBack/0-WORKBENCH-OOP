/* DATENSTRUKTUREN */

/* >>> Primitives <<<*/

// let a; // VAR - Deklaration - untypisierte sprache

// a = true; // Datentyp BOOLEAN
// a = "Hallo!" // Datentyp STRING
// a = 2;  // Datentyp NUMBER

// console.log(a);
// console.log(typeof a);
// //EoF

/* >>> Arrays <<<*/

// let arr = new Array();

// let arr; 
// arr = [false,true,false,true]; // LITERALSCHREIBWEISE
// arr = ["Hallo"," ", "Du"," ","Hund","!"]

// console.log(arr);
// console.log(arr[0]); // ARRAY fängt bei 0 an, erste Stelle = 0
// console.log(arr.length); // LENGTH zeigt die Anzahl der Stellen des Arrays an
// console.log(arr[arr.length-1]); // letztes Element des Arrays
// console.log(arr[7]); // geht nur in JScript - geliefert wird "undefined"

/* Array - PLAIN INFO PART */
let arr = [];
console.log(arr);
arr.push("Sau"); //Hinzufügen
console.log(arr);
arr.push(", du!"); //Hinzufügen IMMER an letzter Stelle
console.log(arr);
console.log(arr.pop()); //Entfernen - IMMER an letzter Stelle
console.log(arr);
arr.pop();
console.log(arr);