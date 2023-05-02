---
title: Class LinearGradientBrush
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Drawing2D.LinearGradientBrush klas. Kapselt eenBrush met een lineair verloop. Deze klasse kan niet worden geërfd.
type: docs
weight: 340
url: /nl/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Kapselt eenBrush met een lineair verloop. Deze klasse kan niet worden geërfd.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush` klasse met de opgegeven punten en kleuren. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush` klasse met de opgegeven punten en kleuren. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush`klasse gebaseerd op een rechthoek, begin- en eindkleuren en een oriëntatiehoek. |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush` klasse gebaseerd op een rechthoek, begin- en eindkleuren en oriëntatie. |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush`klasse gebaseerd op een rechthoek, begin- en eindkleuren en een oriëntatiehoek. |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush` klasse gebaseerd op een rechthoek, begin- en eindkleuren en een oriëntatiemodus. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush`klasse gebaseerd op een rechthoek, begin- en eindkleuren en een oriëntatiehoek. |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | Initialiseert een nieuw exemplaar van het`LinearGradientBrush`klasse gebaseerd op een rechthoek, begin- en eindkleuren en een oriëntatiehoek. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | Haalt of zet aBlend die posities en factoren specificeert die een custom falloff definiëren voor het verloop. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | Krijgt of stelt een waarde in die aangeeft of hiervoor gammacorrectie is ingeschakeldLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | Haalt of zet aColorBlenddat definieert een veelkleurig lineair verloop. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | Hiermee worden de begin- en eindkleuren van het verloop opgehaald of ingesteld. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | Krijgt een rechthoekig gebied dat de begin- en eindpunten van het verloop definieert. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | Haalt of stelt een kopie inMatrix die hiervoor een lokale geometrische transform definieertLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | Haalt of zet aWrapMode opsomming die de wrap mode hiervoor aangeeftLinearGradientBrush . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | Maakt hiervan een exacte kopieLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | Geeft alle bronnen vrij die door dit Brush-object worden gebruikt. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | Vermenigvuldigt deMatrix dat vertegenwoordigt de lokale geometrische transform hiervanLinearGradientBrush door de opgegevenMatrix door prepending de gespecificeerdeMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Vermenigvuldigt deMatrix dat vertegenwoordigt de lokale geometrische transform hiervanLinearGradientBrush door de opgegevenMatrix in de opgegeven volgorde. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | Reset deTransform eigendom tot identiteit. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | Roteert de lokale geometrische transformatie met de gespecificeerde hoeveelheid. Deze methode voegt de rotatie toe aan de transformatie. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoeveelheid in de opgegeven volgorde. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | Schaalt de lokale geometrische transformatie met de gespecificeerde hoeveelheden. Deze methode voegt de schaalmatrix toe aan de transformatie. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven hoeveelheden in de opgegeven volgorde. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Creëert een lineair verloop met een middenkleur en een lineair verloop naar een enkele kleur aan beide uiteinden. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Creëert een lineair verloop met een middenkleur en een lineair verloop naar een enkele kleur aan beide uiteinden. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Creëert een gradiëntdaling op basis van een klokvormige curve. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Creëert een gradiëntdaling op basis van een klokvormige curve. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | Vertaalt de lokale geometrische transformatie met de opgegeven dimensies. Deze methode voegt de vertaling toe aan de transformatie. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Vertaalt de lokale geometrische transformatie door de opgegeven dimensies in de opgegeven volgorde. |

### Zie ook

* class [Brush](../../system.drawing/brush/)
* naamruimte [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* montage [Aspose.Drawing](../../)


