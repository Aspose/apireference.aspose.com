---
title: Class XpsMatrix
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsModel.XpsMatrix klas. Klasse die die Eigenschaften von MatrixTransformEigenschaftselementen einkapselt. Dieses Element definiert eine beliebige affine Matrixtransformation die verwendet wird um die Koordinatensysteme von Elementen zu manipulieren.
type: docs
weight: 3210
url: /de/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Klasse, die die Eigenschaften von MatrixTransform-Eigenschaftselementen einkapselt. Dieses Element definiert eine beliebige affine Matrixtransformation, die verwendet wird, um die Koordinatensysteme von Elementen zu manipulieren.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine Identitätsmatrix ist. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Ruft das M11-Element ab. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Ruft das M12-Element ab. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Ruft das M21-Element ab. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Ruft das M22-Element ab. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Ruft das M31-Element ab. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Ruft das M32-Element ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Klont diese Transformationsmatrix. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Bestimmt, ob die angegebeneObject ist gleich dieser Instanz. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Gibt einen Hash-Code für diese Instanz zurück. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Multipliziert diese Matrix mit der durch die angegebenen Matrix*matrix* in Standardreihenfolge (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Multipliziert diese Matrix mit der durch die angegebenen Matrix*matrix* in Standardreihenfolge (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Multipliziert diese Matrix mit der durch die angegebenen Matrix*matrix* in der Reihenfolge angegeben durch*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Multipliziert diese Matrix mit der durch die angegebenen Matrix*matrix* in der Reihenfolge angegeben durch*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Setzt diese Matrix auf die Identitätsmatrix zurück. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Dreht im Uhrzeigersinn um*angle* zu dieser Matrix in der Standardreihenfolge (Prepend). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Dreht im Uhrzeigersinn um*angle* zu dieser Matrix in order angegeben durch*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Dreht im Uhrzeigersinn um*angle* um die*pivot* zu dieser Matrix in der Standardreihenfolge (Prepend). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Dreht im Uhrzeigersinn um*angle* um die*pivot* zu dieser Matrix in der angegebenen Reihenfolge*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) in der Standardreihenfolge (Prepend) auf diese Matrix an. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der durch angegebenen Reihenfolge an*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Wendet die angegebene Schiefe-Transformation auf diese Matrix an. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Gibt die Zeichenfolgendarstellung davon zurück`XpsMatrix` Instanz. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Wendet die durch diese Matrix dargestellte affine Transformation auf ein angegebenes Rechteck an. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Wendet die durch diese Matrix dargestellte affine Transformation auf einen bestimmten Punkt an. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Wendet die durch diese Matrix dargestellte affine Transformation auf ein angegebenes Array von Punkten an. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Wendet die durch diese Matrix dargestellte affine Transformation auf einen bestimmten Teil des Arrays von Punkten an. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Wendet den angegebenen Translationsvektor auf diese Matrix an. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Wendet den angegebenen Translationsvektor auf diese Matrix in der angegebenen Reihenfolge an*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Die eigentliche Implementierung. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Implementiert den Operator ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Implementiert den Operator !=. |

### Siehe auch

* class [XpsObject](../xpsobject/)
* namensraum [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Montage [Aspose.Page](../../)


