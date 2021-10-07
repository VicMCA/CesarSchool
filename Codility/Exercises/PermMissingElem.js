const A = [1, 2, 4, 5];

function solution(A) {
    if ( A.length === 0 ) {
        return 1;
    } else {
        function sumAll(sum, i) {
            return sum + i
        }
        
        let realSum = A.reduce(sumAll);
    
        let completeSum = (A.length+1) * (A.length+2) / 2;
    
        return completeSum - realSum;
    }    
}

console.log(solution(A));