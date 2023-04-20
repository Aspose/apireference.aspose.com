---
title: Interface ITextureBrush
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Drawing.ITextureBrush koppel. Definiert eine Pinselschnittstelle die ein Bild verwendet um das Innere einer Form zu füllen.
type: docs
weight: 1490
url: /de/net/aspose.svg.drawing/itexturebrush/
---
## ITextureBrush interface

Definiert eine Pinselschnittstelle, die ein Bild verwendet, um das Innere einer Form zu füllen.

```csharp
public interface ITextureBrush : ITransformableBrush
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ColorMap](../../aspose.svg.drawing/itexturebrush/colormap/) { get; } | Die Anzahl der Elemente muss gerade sein. Jedes gerade Element hat eine alte Farbe. Jedes ungerade Element hat eine neue Farbe. |
| [Image](../../aspose.svg.drawing/itexturebrush/image/) { get; } | Ruft das vom Pinsel verwendete Bild ab oder legt es fest. |
| [ImageArea](../../aspose.svg.drawing/itexturebrush/imagearea/) { get; } | Gibt den Teil des Bildes an, der vom Pinsel verwendet wird. Wenn er gleich RectangleF.Empty ist, wird das gesamte Bild verwendet. Koordinaten sind in Pixel angegeben. |
| [Opacity](../../aspose.svg.drawing/itexturebrush/opacity/) { get; } | Deckkraftwert in einer Farbtransformationsmatrix abrufen. |

### Siehe auch

* interface [ITransformableBrush](../itransformablebrush/)
* namensraum [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* Montage [Aspose.SVG](../../)


