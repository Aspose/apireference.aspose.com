---
title: Matrix
second_title: Referencia de Aspose.Drawing para .NET API
description: Encapsula una matriz afín de 3 por 3 que representa una transformación geométrica. Esta clase no se puede heredar.
type: docs
weight: 360
url: /es/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Encapsula una matriz afín de 3 por 3 que representa una transformación geométrica. Esta clase no se puede heredar.

```csharp
public sealed class Matrix : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Matrix](matrix#constructor)() | Inicializa una nueva instancia de la clase Matrix como matriz de identidad. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Inicializa una nueva instancia del[`Matrix`](../matrix) clase a la transformación geométrica definida por el rectángulo especificado y la matriz de puntos. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Inicializa una nueva instancia del[`Matrix`](../matrix) clase a la transformación geométrica definida por el rectángulo especificado y la matriz de puntos. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Inicializa una nueva instancia de la clase Matrix con los elementos especificados. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Obtiene una matriz de valores de punto flotante que representa los elementos de esta Matriz. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Obtiene un valor que indica si esta Matriz es la matriz identidad. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Obtiene un valor que indica si esta Matriz es invertible. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Obtiene el valor de traducción x (el valor dx, o el elemento en la tercera fila y primera columna) de esta Matriz. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Obtiene el valor de traducción y (el`dy` valor, o el elemento en la tercera fila y segunda columna) de esta Matriz. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Crea una copia exacta de esta Matrix. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Libera todos los recursos utilizados por este Matrix. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Invierte esta Matriz, si es invertible. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | multiplica estoMatrix por la matriz especificada en el*matrix* parámetro, anteponiendo el especificadoMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | multiplica estoMatrix por la matriz especificada en el*matrix* parámetro, y en el orden especificado en el*order* parámetro. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Restablece estoMatrixtener los elementos de la matriz identidad. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Anteponer a estoMatrix una rotación en el sentido de las agujas del reloj, alrededor del origen y por el ángulo especificado. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Aplica una rotación en el sentido de las agujas del reloj de una cantidad especificada en el parámetro de ángulo, alrededor del origen (coordenadas x e y cero) para esteMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Aplica una rotación en el sentido de las agujas del reloj a esta Matriz alrededor del punto especificado en el parámetro de punto y anteponiendo la rotación. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Aplica una rotación en el sentido de las agujas del reloj sobre el punto especificado a esta Matriz en el orden especificado. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Aplica el vector de escala especificado a esta Matriz anteponiendo el vector de escala. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Aplica el vector de escala especificado (escalaX y escalaY) a esta Matriz usando el orden especificado. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Aplica el vector de corte especificado a esta Matriz anteponiendo la transformación de corte. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Aplica el vector de corte especificado a esta Matriz en el orden especificado. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Aplica la transformación geométrica representada por esteMatrix a una matriz especificada de puntos. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Aplica la transformación geométrica representada por esteMatrix a una matriz especificada de puntos. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Multiplica cada vector de un arreglo por la matriz. Los elementos de traducción de esta matriz (tercera fila) se ignoran. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Aplica el vector de traducción especificado (offsetX y offsetY) a esta Matriz anteponiendo el vector de traducción. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Aplica el vector de traducción especificado a esta Matriz en el orden especificado. |

### Ver también

* espacio de nombres [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
