function isPowerOfTwo(n: number): boolean {
    return (n > 0) && ((n & (n - 1)) === 0);
};

function isPowerOfTwo2(n : number): boolean {
    if (n < 1) {
        return false;
    }

    while (n != 1) {
        if (n % 2 != 0) {
            return false;
        }

        n = n / 2;
    }
    return true;
}