// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(N) {
    let binary = toBinary(N);
    let numStr = binary.toString();
    let numArr = numStr.split("");
    let start = false;
    let count = 0;
    let max = 0;

    for ( let x of numArr ) {
        if ( x == "0" && start == false ) {
            continue;
        }
        if ( x == "0" && start == true ) {
            count++;
            continue;
        }
        if ( x == "1" && start == false ) {
            start = true;
            continue;
        }
        if ( x == "1" && start == true ) {
            if ( count > max ) {
                max = count;
            }
            count = 0;
            continue;
        }
    }
    return max;
}

function toBinary(dec){
    return (dec >>> 0).toString(2);
}


// function solution(N) {
//     let binary = toBinary(N);
//     let numStr = binary.toString();
//     console.log("numStr = " + numStr);
//     let numArr = numStr.split("");
//     console.log("numArr = " + numArr);
//     let numLen = numArr.length;
//     console.log("numLen = " + numLen);
//     let start = false;
//     let count = 0;
//     let max = 0;

//     for ( let x of numArr ) {
//         if ( x == "0" && start == false ) {
//             continue;
//         }
//         if ( x == "0" && start == true ) {
//             count++;
//             continue;
//         }
//         if ( x == "1" && start == false ) {
//             start = true;
//             continue;
//         }
//         if ( x == "1" && start == true ) {
//             if ( count > max ) {
//                 max = count;
//             }
//             count = 0;
//             continue;
//         }
//     }
//     console.log("max = " + max);
// }

// function toBinary(dec){
//     return (dec >>> 0).toString(2);
// }