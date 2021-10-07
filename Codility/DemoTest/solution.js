// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

const A = [1, 3, 6, 4, 1, 2]
const B = [1, 2, 3]
const C = [-1, -3]

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    A.sort(function(a, b){return a - b});
    let num = 1;
    
    for ( let i of A ) {
        while ( num == i ) {
            num++;
        }
    }
    return num;
}

console.log(solution(A));
console.log(solution(B));
console.log(solution(C));