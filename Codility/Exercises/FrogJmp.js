const test1 = [10, 85, 30];
const test2 = [12, 50000, 40];
const test3 = [80, 120, 10];
const test4 = [200, 910, 100];
const test5 = [0, 10, 2];

const [X, Y, D] = test4;

function solution(X, Y, D) {
    return Math.ceil((Y-X)/D);
}

console.log(solution(X,Y,D));