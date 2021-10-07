const A = [9, 3, 9, 3, 9, 7, 9];
const B = [9, 8, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9];

const C = [1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9];

function solution(A) {
    let odd = 0;
    for ( let x of A ) {
        odd ^= x;
    }
    return odd;
}

console.log(solution(B));

// function solution(A) {
//     A.sort(function(a, b){return a - b});
//     let len = A.length
//     let odd = A[0];

//     for ( let x = 1 ; x < len; x++ ) {
//         if ( A[x] != A[x+1] && A[x] != A[x-1] ) {
//             odd = A[x];
//         }
//     }
//     return odd;
// }

// console.log(solution(B));