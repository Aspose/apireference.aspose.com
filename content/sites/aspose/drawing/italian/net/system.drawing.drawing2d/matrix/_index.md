---
title: Matrix
second_title: Aspose.Drawing per .NET API Reference
description: Incapsula una matrice affine 3 per 3 che rappresenta una trasformata geometrica. Questa classe non può essere ereditata.
type: docs
weight: 360
url: /it/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Incapsula una matrice affine 3 per 3 che rappresenta una trasformata geometrica. Questa classe non può essere ereditata.

```csharp
public sealed class Matrix : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Matrix](matrix#constructor)() | Inizializza una nuova istanza della classe Matrix come matrice di identità. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Inizializza una nuova istanza di[`Matrix`](../matrix) classe alla trasformazione geometrica definita dal rettangolo e dall'array di punti specificati. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Inizializza una nuova istanza di[`Matrix`](../matrix) classe alla trasformazione geometrica definita dal rettangolo e dall'array di punti specificati. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Inizializza una nuova istanza della classe Matrix con gli elementi specificati. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Ottiene una matrice di valori a virgola mobile che rappresenta gli elementi di questa matrice. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Ottiene un valore che indica se questa matrice è la matrice di identità. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Ottiene un valore che indica se questa matrice è invertibile. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Ottiene il valore di conversione x (il valore dx o l'elemento nella terza riga e prima colonna) di questa matrice. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Ottiene il valore di traduzione y (il`dio` valore, o l'elemento nella terza riga e nella seconda colonna) di questa matrice. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Crea una copia esatta di questa matrice. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Rilascia tutte le risorse utilizzate da questa matrice. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Inverte questa matrice, se è invertibile. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Moltiplica questoMatrix dalla matrice specificata nel*matrix* parametro, anteponendo il valore specificatoMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Moltiplica questoMatrix dalla matrice specificata nel*matrix* parametro, e nell'ordine specificato in*order* parametro. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Reimposta questoMatrixavere gli elementi della matrice di identità. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Anteponi a questoMatrix una rotazione in senso orario, attorno all'origine e dell'angolo specificato. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Applica una rotazione in senso orario di una quantità specificata nel parametro dell'angolo, attorno all'origine (coordinate xey zero) per questoMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Applica una rotazione in senso orario a questa matrice attorno al punto specificato nel parametro punto e anteponendo la rotazione. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Applica una rotazione in senso orario attorno al punto specificato a questa matrice nell'ordine specificato. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Applica il vettore di scala specificato a questa matrice anteponendo il vettore di scala. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Applica il vettore di scala specificato (scaleX e scaleY) a questa matrice utilizzando l'ordine specificato. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Applica il vettore di taglio specificato a questa matrice anteponendo la trasformazione di taglio. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Applica il vettore di taglio specificato a questa matrice nell'ordine specificato. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Applica la trasformata geometrica rappresentata da questoMatrix a una matrice di punti specificata. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Applica la trasformata geometrica rappresentata da questoMatrix a una matrice di punti specificata. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Moltiplica ogni vettore in una matrice per la matrice. Gli elementi di traduzione di questa matrice (terza riga) vengono ignorati. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Applica il vettore di traslazione specificato (offsetX e offsetY) a questa matrice anteponendo il vettore di traslazione. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Applica il vettore di traslazione specificato a questa matrice nell'ordine specificato. |

### Guarda anche

* spazio dei nomi [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
