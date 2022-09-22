---
title: LinearGradientBrush
second_title: Aspose.Drawing för .NET API Referens
description: Kapslar in enBrush med en linjär gradient. Denna klass kan inte ärvas.
type: docs
weight: 340
url: /sv/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Kapslar in enBrush med en linjär gradient. Denna klass kan inte ärvas.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush) klass med de angivna punkterna och färgerna. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush) klass med de angivna punkterna och färgerna. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush)klass baserad på en rektangel, start- och slutfärger och en orienteringsvinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush) klass baserad på en rektangel, start- och slutfärger och orientering. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush)klass baserad på en rektangel, start- och slutfärger och en orienteringsvinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush) klass baserad på en rektangel, start- och slutfärger och ett orienteringsläge. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush)klass baserad på en rektangel, start- och slutfärger och en orienteringsvinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Initierar en ny instans av[`LinearGradientBrush`](../lineargradientbrush)klass baserad på en rektangel, start- och slutfärger och en orienteringsvinkel. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Hämtar eller sätter enBlend som anger positioner och faktorer som definierar en custom falloff för gradienten. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Hämtar eller ställer in ett värde som indikerar om gammakorrigering är aktiverad för dettaLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Hämtar eller sätter enColorBlendsom definierar en linjär flerfärgsgradient. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Hämtar eller ställer in start- och slutfärgerna för gradienten. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Får ett rektangulärt område som definierar start- och slutpunkterna för gradienten. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Hämtar eller ställer in en kopiaMatrix som definierar en lokal geometrisk transform för dettaLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Hämtar eller sätter enWrapMode uppräkning som anger wrap mode för dettaLinearGradientBrush . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Skapar en exakt kopia av dettaLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Frigör alla resurser som används av detta Brush-objekt. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | MultiplicerarMatrix som representerar den lokala geometriska transformationen av dennaLinearGradientBrush av den angivnaMatrix genom att prepending det angivnaMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | MultiplicerarMatrix som representerar den lokala geometriska transformationen av dennaLinearGradientBrush av den angivnaMatrix i angiven ordning. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | ÅterställerTransform egenskap till identitet. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Roterar den lokala geometriska transformationen med det angivna beloppet. Denna metod förutsätter rotationen till transformationen. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Roterar den lokala geometriska transformationen med angivet belopp i angiven ordning. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Skalar den lokala geometriska transformationen med de angivna beloppen. Den här metoden lägger till skalningsmatrisen till transformen. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skalar den lokala geometriska transformationen med de angivna mängderna i angiven ordning. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Skapar en linjär gradient med en mittfärg och en linjär nedgång till en enda färg i båda ändar. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Skapar en linjär gradient med en mittfärg och en linjär nedgång till en enda färg i båda ändar. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Skapar en gradientnedgång baserat på en klockformad kurva. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Skapar en gradientnedgång baserat på en klockformad kurva. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Översätter den lokala geometriska transformationen med de angivna dimensionerna. Denna metod lägger översättningen till transformationen. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Översätter den lokala geometriska transformationen med de angivna måtten i angiven ordning. |

### Se även

* class [Brush](../../system.drawing/brush)
* namnutrymme [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
