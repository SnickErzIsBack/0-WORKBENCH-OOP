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

/* >>> ENTSCHEIDUNGSSTRUKTUREN <<< */

// let cond;
// cond = (6 > 2);
// console.log(cond);

// cond = (6 < 4);
// console.log(cond);

// cond = (6 == 4);
// console.log(cond);

// cond = (4 == "4"); // Test auf Wert
// console.log(cond);

// cond = (4 === "4"); // Test auf Wert UND Typ
// console.log(cond);

// // conditionals with one option

// if (6 > 4) {
//     console.log("Aussage wahr");
// } else {
//     console.log("Aussage UNWAHR");
// }

//  // elseif / switch // conditionals with more options

// switch (key) {
//     case value:
        
//         break;

//     default:
//         break;
// }

/* >>> FUNKTIONEN <<< */

// // 1.kapselung
//  test(); Funktionscall
// function test() // Funktionsrumpf
// { 
//     console.log("Testausgabe");
// };

// // 2. return
// console.log(test);
// function test()
// {
//     // ..macht irgendwas
//     let ausgabe =  "Testausgabe";
//     return ausgabe;
//     console.log("Hallo");    // nach return ABBRUCH!
// }

// //3 Parameter
// console.log("Anna"); // Argumente
// // Argumente (Daten) => Parameter (Platzhalter)
// function test(firstName) // Parameter p1, p2, ...
// {
//        // ..macht irgendwas
//     let ausgabe =  "hallo" + firstName;
//     return ausgabe;  
// }

// // 4. Fkt-Call aus Funktionen
// console.log(test("Anna")); // Argumente

// function test(firstName) // Parameter p1, p2, ...
// {
//        // ..macht irgendwas
//     let ausgabe =  grussformel() + firstName + "!";
//     return ausgabe;  
// }

// function grussformel()
// {
//     //return "Hola, ";
//     return "Hallo "; 
// }