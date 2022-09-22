---
title: PathGradientBrush
second_title: Aspose.Drawing för .NET API Referens
description: Kapslar in enBrush föremål som fyller det inre av enGraphicsPath objekt med en gradient. Denna klass kan inte ärvas.
type: docs
weight: 400
url: /sv/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Kapslar in enBrush föremål som fyller det inre av enGraphicsPath objekt med en gradient. Denna klass kan inte ärvas.

```csharp
public sealed class PathGradientBrush : Brush
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Initierar en ny instans av[`PathGradientBrush`](../pathgradientbrush) klass med den angivna sökvägen. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Initierar en ny instans av[`PathGradientBrush`](../pathgradientbrush) klass med de angivna punkterna. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Initierar en ny instans av[`PathGradientBrush`](../pathgradientbrush) klass med de angivna punkterna. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Initierar en ny instans av[`PathGradientBrush`](../pathgradientbrush) klass med de angivna punkterna och lindningsläget. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Initierar en ny instans av[`PathGradientBrush`](../pathgradientbrush) klass med de angivna punkterna och lindningsläget. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Hämtar eller sätter enBlend som specificerar positioner och faktorer som definierar en anpassad falloff för gradienten. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Hämtar eller ställer in färgen i mitten av banans gradient. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Hämtar eller ställer in mittpunkten för banans gradient. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Hämtar eller ställer in fokuspunkten för gradientnedgången. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Hämtar eller sätter enColorBlendsom definierar en linjär flerfärgsgradient. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Får en avgränsande rektangel för dettaPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Hämtar eller ställer in en rad färger som motsvarar punkterna i banan dettaPathGradientBrush fyller. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Hämtar eller ställer in en kopia avMatrix som definierar en lokal geometrisk transform för dettaPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Hämtar eller sätter enWrapMode som indikerar wrap mode för dettaPathGradientBrush . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Skapar en exakt kopia av dettaPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Frigör alla resurser som används av detta Brush-objekt. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Uppdaterar borstens transformationsmatris med produkten av borstens transformationsmatris multiplicerat med en annan matris. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Uppdaterar borstens transformationsmatris med produkten av borstens transformationsmatris multiplicerat med en annan matris. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | ÅterställerTransform egenskap till identitet. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Roterar den lokala geometriska transformationen med det angivna beloppet. Denna metod förutsätter rotationen till transformationen. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Roterar den lokala geometriska transformationen med angivet belopp i angiven ordning. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Skalar den lokala geometriska transformationen med de angivna beloppen. Den här metoden lägger till skalningsmatrisen till transformen. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skalar den lokala geometriska transformationen med de angivna mängderna i angiven ordning. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Skapar en gradient med en mittfärg och en linjär nedgång till en omgivande färg. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Skapar en övertoning med en mittfärg och en linjär nedgång till varje omgivande färg. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Skapar en gradientpensel som ändrar färg med början från mitten av banan utåt till banans gräns. Övergången från en färg till en annan baseras på en klockformad kurva. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Skapar en gradientpensel som ändrar färg med början från mitten av banan utåt till banans gräns. Övergången från en färg till en annan baseras på en klockformad kurva. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Tillämpar den angivna översättningen på den lokala geometriska transformationen. Denna metod lägger översättningen till transformationen. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Tillämpar den angivna översättningen på den lokala geometriska transformationen i angiven ordning. |

### Se även

* class [Brush](../../system.drawing/brush)
* namnutrymme [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
