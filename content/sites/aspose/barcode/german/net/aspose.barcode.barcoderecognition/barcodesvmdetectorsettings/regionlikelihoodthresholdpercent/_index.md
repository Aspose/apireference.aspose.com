---
title: RegionLikelihoodThresholdPercent
second_title: Aspose.BarCode für .NET-API-Referenz
description: Legt den Schwellenwert für erkannte Regionen fest die möglicherweise Barcodes enthalten.
type: docs
weight: 50
url: /de/net/aspose.barcode.barcoderecognition/barcodesvmdetectorsettings/regionlikelihoodthresholdpercent/
---
## BarcodeSvmDetectorSettings.RegionLikelihoodThresholdPercent property

Legt den Schwellenwert für erkannte Regionen fest, die möglicherweise Barcodes enthalten.

Wert 0,7 bedeutet, dass die unteren 70 % der möglichen Regionen herausgefiltert und nicht weiter verarbeitet werden. Regionswahrscheinlichkeitsschwelle muss zwischen [0,05 und 0,9] liegen. Verwenden Sie hohe Werte für klare Bilder mit wenigen Barcodes. Verwenden Sie niedrige Werte für Bilder mit vielen Barcodes oder für verrauschte Bilder. Ein niedriger Wert kann zu einer längeren Erkennungszeit führen.

```csharp
public float RegionLikelihoodThresholdPercent { get; set; }
```

### Siehe auch

* class [BarcodeSvmDetectorSettings](../../barcodesvmdetectorsettings)
* namensraum [Aspose.BarCode.BarCodeRecognition](../../barcodesvmdetectorsettings)
* Montage [Aspose.BarCode](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
