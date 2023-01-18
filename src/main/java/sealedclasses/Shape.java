package sealedclasses;

public sealed class Shape implements Canvasable permits Square, Circle {

}

sealed interface Canvasable permits Shape {

}
non-sealed class Square extends Shape {
}

final class Circle extends Shape {

}