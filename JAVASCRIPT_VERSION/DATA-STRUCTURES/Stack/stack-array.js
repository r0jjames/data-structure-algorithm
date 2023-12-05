

class Stack {
    constructor() {
        this.arr = [];
    }
    peek() {
        this.arr[this.arr.length-1];
        console.log(this.arr);
        return this.arr;
    }
    push(value) {
      this.arr.push(value);
      console.log(this.arr);
      return this.arr;
    }
    pop() {
       this.arr.pop();
       console.log(this.arr);
    }
}
const stack = new Stack();
stack.push('Google');
stack.push('Udemy');
// stack.push('Youtube');
// stack.pop();
stack.pop();