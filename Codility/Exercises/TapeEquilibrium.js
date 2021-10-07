const A = [3, 1, 2, 3, 4];

function solution(A) {
    function sumAll(value, i) {
        return value + i;
    }

    let start = 0;
    let end = A.reduce(sumAll);

    let minInterval = Number.POSITIVE_INFINITY;

    for ( let p = 0; p < A.length - 1; p++ ) {
        start += A[p];
        end -= A[p];
        let difference = Math.abs(end - start);
        minInterval = Math.min(minInterval, difference);
    }
    return minInterval;
}

console.log(solution(A));