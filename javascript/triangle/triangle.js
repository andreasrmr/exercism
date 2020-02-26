export class Triangle {
  constructor(a, b, c) {
      this.a = a;
      this.b = b;
      this.c = c;
  }

  isEquilateral() {
    return this.noZeroSet() && (this.a == this.b && this.a == this.c);
  }

  isIsosceles() {
    return (this.isEquilateral()) || (this.a == this.b && this.a != this.c) || (this.b == this.c && this.b != this.a) || (this.c == this.a && this.c != this.b);
  }

  isScalene() {
    return (this.noZeroSet()) || (this.a != this.b) && (this.b != this.c);
  }
  noZeroSet(){
    return (this.a != 0 || this.b != 0 || this.c != 0) ? true : false;
  }
}
