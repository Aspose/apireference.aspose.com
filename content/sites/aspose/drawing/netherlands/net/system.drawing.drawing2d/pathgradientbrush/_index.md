---
title: Class PathGradientBrush
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Drawing2D.PathGradientBrush klas. Kapselt eenBrush object dat het interieur van een vultGraphicsPath object met een verloop. Deze klasse kan niet worden geërfd.
type: docs
weight: 400
url: /nl/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Kapselt eenBrush object dat het interieur van een vultGraphicsPath object met een verloop. Deze klasse kan niet worden geërfd.

```csharp
public sealed class PathGradientBrush : Brush
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | Initialiseert een nieuw exemplaar van het`PathGradientBrush` klasse met het opgegeven pad. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | Initialiseert een nieuw exemplaar van het`PathGradientBrush` klasse met de opgegeven punten. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | Initialiseert een nieuw exemplaar van het`PathGradientBrush` klasse met de opgegeven punten. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | Initialiseert een nieuw exemplaar van het`PathGradientBrush` class met de gespecificeerde punten en wrap mode. |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | Initialiseert een nieuw exemplaar van het`PathGradientBrush` class met de gespecificeerde punten en wrap mode. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | Haalt of zet aBlend die posities en factoren specificeert die een aangepaste afname voor het verloop definiëren. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | Hiermee wordt de kleur in het midden van het padverloop opgehaald of ingesteld. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | Haalt of stelt het middelpunt van de padgradiënt in. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | Haalt of stelt het focuspunt in voor de gradiëntdaling. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | Haalt of zet aColorBlenddat definieert een veelkleurig lineair verloop. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | Krijgt hiervoor een begrenzende rechthoekPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | Haalt of stelt een reeks kleuren in die overeenkomen met de punten in het pad ditPathGradientBrush vullingen. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | Haalt of stelt een kopie in van hetMatrix die hiervoor een lokale geometrische transform definieertPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | Haalt of zet aWrapMode dat geeft hiervoor de wrap mode aanPathGradientBrush . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | Maakt hiervan een exacte kopiePathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | Geeft alle bronnen vrij die door dit Brush-object worden gebruikt. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | Werkt de transformatiematrix van het penseel bij met het product van de transformatiematrix van het penseel vermenigvuldigd met een andere matrix. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Werkt de transformatiematrix van het penseel bij met het product van de transformatiematrix van het penseel vermenigvuldigd met een andere matrix. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | Reset deTransform eigendom tot identiteit. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | Roteert de lokale geometrische transformatie met de gespecificeerde hoeveelheid. Deze methode voegt de rotatie toe aan de transformatie. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoeveelheid in de opgegeven volgorde. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | Schaalt de lokale geometrische transformatie met de gespecificeerde hoeveelheden. Deze methode voegt de schaalmatrix toe aan de transformatie. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven hoeveelheden in de opgegeven volgorde. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Maakt een verloop met een middenkleur en een lineair verloop naar één omringende kleur. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Creëert een verloop met een middenkleur en een lineair verloop naar elke omringende kleur. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Maakt een verlooppenseel dat van kleur verandert vanaf het midden van het pad naar buiten tot aan de grens van het pad. De overgang van de ene kleur naar de andere is gebaseerd op een klokvormige curve. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Maakt een verlooppenseel dat van kleur verandert vanaf het midden van het pad naar buiten tot aan de grens van het pad. De overgang van de ene kleur naar de andere is gebaseerd op een klokvormige curve. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | Past de opgegeven vertaling toe op de lokale geometrische transformatie. Deze methode voegt de vertaling toe aan de transformatie. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Past de opgegeven vertaling toe op de lokale geometrische transformatie in de opgegeven volgorde. |

### Zie ook

* class [Brush](../../system.drawing/brush/)
* naamruimte [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* montage [Aspose.Drawing](../../)


