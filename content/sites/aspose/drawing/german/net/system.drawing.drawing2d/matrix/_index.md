---
title: Matrix
second_title: Aspose.Drawing für .NET-API-Referenz
description: Kapselt eine affine 3mal3Matrix die eine geometrische Transformation darstellt. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 360
url: /de/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Kapselt eine affine 3-mal-3-Matrix, die eine geometrische Transformation darstellt. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class Matrix : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Matrix](matrix#constructor)() | Initialisiert eine neue Instanz der Matrix-Klasse als Identitätsmatrix. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Initialisiert eine neue Instanz von[`Matrix`](../matrix) Klasse in die geometrische Transformation, die durch das angegebene Rechteck und das Array von Punkten definiert ist. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Initialisiert eine neue Instanz von[`Matrix`](../matrix) Klasse in die geometrische Transformation, die durch das angegebene Rechteck und das Array von Punkten definiert ist. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Initialisiert eine neue Instanz der Matrix-Klasse mit den angegebenen Elementen. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Ruft ein Array von Gleitkommawerten ab, das die Elemente dieser Matrix darstellt. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Ruft einen Wert ab, der angibt, ob diese Matrix die Identitätsmatrix ist. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Ruft einen Wert ab, der angibt, ob diese Matrix invertierbar ist. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Ruft den x-Übersetzungswert (den dx-Wert oder das Element in der dritten Zeile und ersten Spalte) dieser Matrix ab. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Ruft den y-Übersetzungswert ab (die`dy` Wert oder das Element in der dritten Zeile und zweiten Spalte) dieser Matrix. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Erstellt eine exakte Kopie dieser Matrix. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Gibt alle von dieser Matrix verwendeten Ressourcen frei. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Invertiert diese Matrix, falls sie invertierbar ist. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Multipliziert diesMatrix durch die in der angegebene Matrix*matrix* parameter, durch Voranstellen des angegebenenMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Multipliziert diesMatrix durch die in der angegebene Matrix*matrix* parameter, und in der Reihenfolge angegeben in der*order* parameter. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Setzt dies zurückMatrixdie Elemente der Identitätsmatrix haben. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Dem voranstellenMatrix eine Drehung im Uhrzeigersinn um den Ursprung und um den angegebenen Winkel. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Wendet hierfür eine Drehung im Uhrzeigersinn um einen im Winkelparameter angegebenen Betrag um den Ursprung (null x- und y-Koordinaten) anMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Wendet eine Drehung im Uhrzeigersinn auf diese Matrix um den im Punktparameter angegebenen Punkt an und stellt die Drehung voran. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Wendet eine Drehung im Uhrzeigersinn um den angegebenen Punkt auf diese Matrix in der angegebenen Reihenfolge an. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Wendet den angegebenen Skalierungsvektor auf diese Matrix an, indem der Skalierungsvektor vorangestellt wird. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) in der angegebenen Reihenfolge auf diese Matrix an. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Wendet den angegebenen Schervektor auf diese Matrix an, indem die Schertransformation vorangestellt wird. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Wendet den angegebenen Schervektor in der angegebenen Reihenfolge auf diese Matrix an. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Wendet die hier dargestellte geometrische Transformation anMatrix zu einem bestimmten Array von Punkten. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Wendet die hier dargestellte geometrische Transformation anMatrix zu einem bestimmten Array von Punkten. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Multipliziert jeden Vektor in einem Array mit der Matrix. Die Übersetzungselemente dieser Matrix (dritte Reihe) werden ignoriert. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Wendet den angegebenen Translationsvektor (offsetX und offsetY) auf diese Matrix an, indem der Translationsvektor vorangestellt wird. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Wendet den angegebenen Translationsvektor in der angegebenen Reihenfolge auf diese Matrix an. |

### Siehe auch

* namensraum [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
