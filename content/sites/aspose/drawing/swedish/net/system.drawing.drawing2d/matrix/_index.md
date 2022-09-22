---
title: Matrix
second_title: Aspose.Drawing för .NET API Referens
description: Kapslar in en 3 x 3 affin matris som representerar en geometrisk transformation. Denna klass kan inte ärvas.
type: docs
weight: 360
url: /sv/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Kapslar in en 3 x 3 affin matris som representerar en geometrisk transformation. Denna klass kan inte ärvas.

```csharp
public sealed class Matrix : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Matrix](matrix#constructor)() | Initierar en ny instans av Matrix-klassen som identitetsmatris. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Initierar en ny instans av[`Matrix`](../matrix) klass till den geometriska transformationen som definieras av den specificerade rektangeln och matrisen av punkter. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Initierar en ny instans av[`Matrix`](../matrix) klass till den geometriska transformationen som definieras av den specificerade rektangeln och matrisen av punkter. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Initierar en ny instans av Matrix-klassen med de angivna elementen. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Får en matris med flyttalsvärden som representerar elementen i denna matris. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Får ett värde som indikerar om denna matris är identitetsmatrisen. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Får ett värde som indikerar om denna matris är inverterbar. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Hämtar x-översättningsvärdet (dx-värdet, eller elementet i den tredje raden och första kolumnen) för denna matris. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Hämtar y-översättningsvärdet (den`dy` värde, eller elementet i den tredje raden och andra kolumnen) i denna matris. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Skapar en exakt kopia av denna matris. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Frigör alla resurser som används av denna matris. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Inverterar denna matris, om den är inverterbar. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Multiplicerar dettaMatrix av den matris som anges i*matrix* parameter, genom att föregå den angivnaMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Multiplicerar dettaMatrix av den matris som anges i*matrix* parameter, och i den ordning som anges i*order* parameter. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Återställer dettaMatrixatt ha elementen i identitetsmatrisen. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Lägg till dettaMatrix en medurs rotation, runt origo och med den angivna vinkeln. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Tillämpar en medurs rotation av en mängd som anges i vinkelparametern, runt origo (noll x- och y-koordinater) för dettaMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Tillämpar en medurs rotation på denna matris runt den punkt som anges i punktparametern, och genom att föregå rotationen. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Tillämpar en medurs rotation kring den angivna punkten på denna matris i angiven ordning. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Tillämpar den angivna skalvektorn på denna matris genom att lägga till skalvektorn. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Tillämpar den angivna skalvektorn (scaleX och scaleY) på denna matris med den angivna ordningen. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Tillämpar den angivna skjuvvektorn på denna matris genom att prependera skjuvtransformationen. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Tillämpar den angivna skjuvvektorn på denna matris i angiven ordning. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Tillämpar den geometriska transformationen som representeras av dettaMatrix till en specificerad uppsättning punkter. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Tillämpar den geometriska transformationen som representeras av dettaMatrix till en specificerad uppsättning punkter. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Multiplicerar varje vektor i en matris med matrisen. Översättningselementen i denna matris (tredje raden) ignoreras. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Tillämpar den angivna translationsvektorn (offsetX och offsetY) på denna matris genom att lägga till translationsvektorn. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Tillämpar den angivna översättningsvektorn på denna matris i angiven ordning. |

### Se även

* namnutrymme [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
