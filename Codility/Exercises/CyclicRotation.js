// A is an array
// N is an integet

const A = [4, 5, 9, 1, 5, 7, 2, 8, 0, 3, 0, 2, 5, 7, 1, 0, 9];
const K = 10;

function solution(A, K) {
    let count = 0;

    if ( A.length < 1 ) {
        return A;
    } else {
        while ( count < K ) {
            let num = A.pop();
            A.unshift(num);
            count ++;
        }
        return A;
    }
}

console.log(solution(A, K));