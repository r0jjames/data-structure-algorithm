class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    constructor() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }
    peek() {
        return this.top;
    }
    push(value) {
        const newNode = new Node(value);
        if (this.length === 0) {
            this.top = newNode;
            this.bottom = newNode;
            this.length++;
        } else {
            const holdPointer = this.top;
            this.top = newNode;
            this.top.next = holdPointer;
            this.length++;
        }

        return this;

    }
    pop() {
        if(!this.top) {
            return null;
        }
        if(this.top === this.bottom) {
            console.log(this.top);
            console.log(this.bottom);
            this.bottom = null;
        }
        this.top = this.top.next;
        this.length--;

        return this;
    }
}
const stack = new Stack();
stack.push('Google');
// stack.push('Udemy');
// stack.push('Youtube');
// stack.pop();
stack.pop();