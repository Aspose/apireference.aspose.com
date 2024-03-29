---
title: BlackWhiteAdjustmentLayer.BlackAndWhitePresetFileName
second_title: Aspose.PSD für .NET-API-Referenz
description: BlackWhiteAdjustmentLayer eigendom. Ruft den Dateinamen der SchwarzweißVoreinstellung ab oder legt ihn fest.
type: docs
weight: 10
url: /de/net/aspose.psd.fileformats.psd.layers.adjustmentlayers/blackwhiteadjustmentlayer/blackandwhitepresetfilename/
---
## BlackWhiteAdjustmentLayer.BlackAndWhitePresetFileName property

Ruft den Dateinamen der Schwarzweiß-Voreinstellung ab oder legt ihn fest.

```csharp
public string BlackAndWhitePresetFileName { get; set; }
```

### Eigentumswert

Der voreingestellte Dateiname für Schwarzweiß.

### Beispiele

Das folgende Beispiel zeigt, wie Sie die Eigenschaften der Schwarz-Weiß-Anpassungsebene in Aspose.PSD bearbeiten können

```csharp
[C#]

sourceFileName = "BlackWhiteAdjustmentLayerStripesMask.psd";
outputFileName = "OutputBlackWhiteAdjustmentLayerStripesMask.psd";
using (PsdImage image = (PsdImage)Image.Load(sourceFileName))
{
    var blwhLayer = (BlackWhiteAdjustmentLayer)image.Layers[1];

    blwhLayer.Reds = 15;
    blwhLayer.Yellows = 25;
    blwhLayer.Greens = 35;
    blwhLayer.Cyans = 10;
    blwhLayer.Blues = 50;
    blwhLayer.Magentas = 105;
    blwhLayer.UseTint = true;
    blwhLayer.BwPresetKind = 4;
    blwhLayer.BlackAndWhitePresetFileName = "bwPresetFileName";
    blwhLayer.TintColorRed = 60;
    blwhLayer.TintColorGreen = 80;
    blwhLayer.TintColorBlue = 200;

    image.Save(outputFileName, new PsdOptions());
}
```

### Siehe auch

* class [BlackWhiteAdjustmentLayer](../)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers.AdjustmentLayers](../../blackwhiteadjustmentlayer/)
* Montage [Aspose.PSD](../../../)


