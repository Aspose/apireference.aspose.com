---
title: Class Pen
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Pen klas. Definieert een object dat wordt gebruikt om lijnen en krommen te tekenen.
type: docs
weight: 910
url: /nl/net/system.drawing/pen/
---
## Pen class

Definieert een object dat wordt gebruikt om lijnen en krommen te tekenen.

```csharp
public class Pen : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | Initialiseert een nieuw exemplaar van het`Pen` klasse met de gespecificeerdeBrush . |
| [Pen](pen/#constructor_2)(Color) | Initialiseert een nieuw exemplaar van het`Pen` klasse met de gespecificeerdeColor . |
| [Pen](pen/#constructor_1)(Brush, float) | Initialiseert een nieuwe instantie van de klasse Pen met het opgegeven penseel en de opgegeven breedte. |
| [Pen](pen/#constructor_3)(Color, float) | Initialiseert een nieuwe instantie van de klasse Pen met de opgegeven eigenschappen Kleur en Breedte. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment/) { get; set; } | Haalt of stelt de uitlijning hiervoor inPen . |
| [Brush](../../system.drawing/pen/brush/) { get; set; } | Haalt of stelt het penseel in dat de kenmerken hiervan bepaaltPen . |
| [Color](../../system.drawing/pen/color/) { get; set; } | Haalt of stelt de kleur hiervan inPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray/) { get; set; } | Hiermee wordt een reeks waarden opgehaald of ingesteld die een samengestelde pen specificeert. Een samengestelde pen tekent een samengestelde lijn die bestaat uit parallelle lijnen en spaties. |
| [CustomEndCap](../../system.drawing/pen/customendcap/) { get; set; } | Krijgt of stelt een aangepaste cap in om te gebruiken aan het einde van hiermee getekende lijnenPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap/) { get; set; } | Krijgt of stelt een aangepaste hoofdletter in om te gebruiken aan het begin van hiermee getekende lijnenPen . |
| [DashCap](../../system.drawing/pen/dashcap/) { get; set; } | Hiermee wordt de hoofdletterstijl opgehaald of ingesteld die wordt gebruikt aan het einde van de streepjes waaruit de stippellijnen zijn getekend met this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset/) { get; set; } | Hiermee wordt de afstand vanaf het begin van een lijn tot het begin van een streeppatroon opgehaald of ingesteld. |
| [DashPattern](../../system.drawing/pen/dashpattern/) { get; set; } | Haalt of stelt een reeks aangepaste streepjes en spaties in. |
| [DashStyle](../../system.drawing/pen/dashstyle/) { get; set; } | Hiermee wordt de stijl opgehaald of ingesteld die wordt gebruikt voor stippellijnen die hiermee worden getekendPen . |
| [EndCap](../../system.drawing/pen/endcap/) { get; set; } | Hiermee krijgt of stelt u de dopstijl in die wordt gebruikt aan het einde van lijnen die met deze pen zijn getekend. |
| [LineJoin](../../system.drawing/pen/linejoin/) { get; set; } | Hiermee wordt de verbindingsstijl opgehaald of ingesteld voor de uiteinden van twee opeenvolgende lijnen die met deze pen zijn getekend. |
| [MiterLimit](../../system.drawing/pen/miterlimit/) { get; set; } | Haalt of stelt de limiet in van de dikte van de verbinding op een verstekhoek. |
| [PenType](../../system.drawing/pen/pentype/) { get; } | Krijgt de stijl van lijnen getekend met deze Pen. |
| [StartCap](../../system.drawing/pen/startcap/) { get; set; } | Hiermee krijgt of stelt u de dopstijl in die wordt gebruikt aan het begin van lijnen die met deze pen zijn getekend. |
| [Transform](../../system.drawing/pen/transform/) { get; set; } | Haalt of stelt hiervoor een kopie van de geometrische transformatie inPen . |
| [Width](../../system.drawing/pen/width/) { get; set; } | Hiermee wordt de breedte van deze pen opgehaald of ingesteld, in eenheden van het grafische object dat wordt gebruikt voor tekenen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/pen/clone/)() | Maakt hiervan een exacte kopiePen . |
| [Dispose](../../system.drawing/pen/dispose/)() | Geeft alle bronnen vrij die door deze pen worden gebruikt. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | Vermenigvuldigt hiervoor de transformatiematrixPen door de opgegevenMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Vermenigvuldigt hiervoor de transformatiematrixPen door de opgegevenMatrix in de opgegeven volgorde. |
| [ResetTransform](../../system.drawing/pen/resettransform/)() | Reset hiervoor de geometrische transformatiematrixPen naar identiteit. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform)(float) | Roteert de lokale geometrische transformatie met de gespecificeerde hoek. Deze methode voegt de rotatie toe aan de transformatie. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoek in de opgegeven volgorde. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform)(float, float) | Schaalt de lokale geometrische transformatie met de gespecificeerde factoren. Deze methode voegt de schaalmatrix toe aan de transformatie. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven factoren in de opgegeven volgorde. |
| [SetLineCap](../../system.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | Stelt de waarden in die de stijl van de dop bepalen die wordt gebruikt om hiermee getekende lijnen te beëindigen`Pen` . |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform)(float, float) | Vertaalt de lokale geometrische transformatie door de gespecificeerde dimensies. Deze methode voegt de vertaling toe aan de transformatie. |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Vertaalt de lokale geometrische transformatie door de opgegeven dimensies in de opgegeven volgorde. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


