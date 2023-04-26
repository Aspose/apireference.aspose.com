---
title: Class XpsMatrix
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsMatrix klass. Klass inkapslande MatrixTransform egenskapselement egenskaper. Detta element definierar en godtycklig affin matristransformation som används för att manipulera koordinat system av element.
type: docs
weight: 3220
url: /sv/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Klass inkapslande MatrixTransform egenskapselement egenskaper. Detta element definierar en godtycklig affin matristransformation som används för att manipulera koordinat system av element.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Får ett värde som indikerar om denna instans är identitetsmatris. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Hämtar M11-elementet. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Hämtar M12-elementet. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Hämtar M21-elementet. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Hämtar M22-elementet. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Hämtar M31-elementet. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Hämtar M32-elementet. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Klonar denna transformationsmatris. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Bestämmer om den angivnaObject är lika med denna instans. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Returnerar en hash-kod för denna instans. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Multiplicerar denna matris med matrisen som anges av*matrix* i standardordning (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Multiplicerar denna matris med matrisen som anges av*matrix* i standardordning (Prepend). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Multiplicerar denna matris med matrisen som anges av*matrix* i den ordning som anges av*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Multiplicerar denna matris med matrisen som anges av*matrix* i den ordning som anges av*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Återställer denna matris till identitetsmatris. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Tillämpar vridning medurs med*angle* till denna matris i standardordning (Prepend). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Tillämpar vridning medurs med*angle* till denna matris i order specificerad av*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Tillämpar vridning medurs med*angle* runt*pivot* till denna matris i standardordning (Prepend). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Tillämpar vridning medurs med*angle* runt*pivot* till denna matris i den ordning som anges av*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Tillämpar den angivna skalvektorn (scaleX och scaleY) på denna matris i standardordning (Prepend). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Tillämpar den angivna skalvektorn (scaleX och scaleY) på denna matris i order specificerad av*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Tillämpar specificerad skevningstransformation på denna matris. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Returnerar strängrepresentationen av detta`XpsMatrix` instans. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Tillämpar den affina transformationen som representeras av denna matris på en specificerad rektangel. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Tillämpar den affina transformationen som representeras av denna matris på en specificerad punkt. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Tillämpar den affina transformationen som representeras av denna matris på en specificerad matris av punkter. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Tillämpar den affina transformationen som representeras av denna matris på en specificerad del av array av punkter. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Tillämpar den angivna översättningsvektorn på denna matris. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Tillämpar den angivna översättningsvektorn på denna matris i den ordning som anges av*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Den faktiska implementeringen. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Implementerar operatorn ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Implementerar operatorn !=. |

### Se även

* class [XpsObject](../xpsobject/)
* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


