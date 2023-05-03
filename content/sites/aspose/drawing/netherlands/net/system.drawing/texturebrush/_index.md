---
title: Class TextureBrush
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.TextureBrush klas. Elke eigenschap van de klasse TextureBrush is een Brushobject dat een afbeelding gebruikt om de binnenkant van een vorm te vullen. Deze klasse kan niet worden geërfd.
type: docs
weight: 1260
url: /nl/net/system.drawing/texturebrush/
---
## TextureBrush class

Elke eigenschap van de klasse TextureBrush is een Brush-object dat een afbeelding gebruikt om de binnenkant van een vorm te vullen. Deze klasse kan niet worden geërfd.

```csharp
public sealed class TextureBrush : Brush
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | Initialiseert een nieuw exemplaar van het`TextureBrush` klasse die de opgegeven afbeelding gebruikt. |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | Initialiseert een nieuw exemplaar van het`TextureBrush` klasse die de opgegeven afbeelding en begrenzende rechthoek gebruikt. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | Initialiseert een nieuw exemplaar van het`TextureBrush` klasse die de opgegeven afbeelding en wrap-modus gebruikt. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | Initialiseert een nieuw exemplaar van het`TextureBrush` klasse die de opgegeven afbeelding, begrenzende rechthoek en afbeeldingsattributen gebruikt. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | Initialiseert een nieuw exemplaar van het`TextureBrush` klasse die de opgegeven afbeelding, omloopmodus en omsluitende rechthoek gebruikt. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | Haalt het Image-object op dat is gekoppeld aan dit TextureBrush-object. |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | Haalt of stelt een kopie in van het Matrix-object dat een lokale geometrische transformatie definieert voor de image die is gekoppeld aan dit TextureBrush-object. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | Haalt een WrapMode-opsomming op of stelt deze in die de wrap-modus voor dit TextureBrush-object aangeeft. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | Maakt hiervan een exacte kopieTextureBrush object. |
| [Dispose](../../system.drawing/brush/dispose/)() | Geeft alle bronnen vrij die door dit Brush-object worden gebruikt. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | Vermenigvuldigt deMatrix object dat de lokale geometrische transformatie hiervan vertegenwoordigtTextureBrush object door de opgegevenMatrix object door prepending het gespecificeerdeMatrix object. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Vermenigvuldigt deMatrix object dat de lokale geometrische transformatie hiervan vertegenwoordigtTextureBrush object door de opgegevenMatrix object in de opgegeven volgorde. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | Reset de eigenschap Transform hiervanTextureBrush bezwaar tegen identiteit. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | Roteert de lokale geometrische transformatie hiervanTextureBrush object met de opgegeven hoeveelheid. Deze methode voegt de rotatie toe aan de transformatie. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Roteert de lokale geometrische transformatie hiervanTextureBrush object met de opgegeven hoeveelheid in de opgegeven volgorde. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | Schaalt de lokale geometrische transformatie hiervanTextureBrush object met de opgegeven hoeveelheden. Deze methode voegt de schaalmatrix toe aan de transformatie. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Schaalt de lokale geometrische transformatie hiervanTextureBrush object door de opgegeven hoeveelheden in de opgegeven volgorde. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | Vertaalt de lokale geometrische transformatie hiervanTextureBrushobject door de gespecificeerde dimensies. Deze methode voegt de vertaling toe aan de transformatie. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Vertaalt de lokale geometrische transformatie hiervanTextureBrush object door de opgegeven afmetingen in de opgegeven volgorde. |

### Zie ook

* class [Brush](../brush/)
* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


