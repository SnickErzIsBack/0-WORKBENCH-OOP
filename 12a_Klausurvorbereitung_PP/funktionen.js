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

//#region /* Array - PLAIN INFO PART - push/pop - FiFo -  */
// let arr = [];
// console.log(arr);
// arr.push("Sau"); //Hinzufügen
// console.log(arr);
// arr.push(", du!"); //Hinzufügen IMMER an letzter Stelle
// console.log(arr);
// console.log(arr.pop()); //Entfernen - IMMER an letzter Stelle
// console.log(arr);
// arr.pop();
// console.log(arr);
// // SYSTEM FIFO - first in,  first out
//#endregion

/* >>> Objekte <<<*/

// let obj;

// // obj = {};
// // console.log(obj);

// // obj = {x:10, y:"Hallo", z:true};
// // console.log(obj);
// // console.log(obj.x); // DOT-quotation, DOT-syntax
// // console.log(obj.y);
// // console.log(obj.z);

// obj = {
//         sub1:{
//             sub2: {
//                 val1: "Hi", val2: 2
//             }
//         }
// }

// KLAUSURRELEVANT //
// {{{}}} ... nested object 
// console.log(obj);
// console.log(obj.sub1.sub2.val1);

// KLAUSURRELEVANT //
/* >>> Document Object Model - DOM - Modell der HTML-Struktur <<< */
// steht zur Verfügung, sobald die Seite geladen und geparsed ist 
// Strukturen Head Body

// console.log(document); // <html> - Zugriff auf das gesamte DOM
// console.log(document.body); // <body> - Zugriff auf den Body
// console.log(document.body.children); // <body>...</body> - Zugriff auf den Array innerhalb von Body
// console.log(document.body.children[0]); // h1 - Zugriff auf das erste Element des Arrays innerhalb von Body
// console.log(document.body.children[0].innerHTML); // ...Text
// document.body.children[0].innerHTML = "Hallo"; // Modifikation des Inhalts von h1
// console.log(document.body.children[0].innerHTML);
// console.log(document.getElementById("test")); // <p>
// console.log(document.getElementById("test").innerHTML);

