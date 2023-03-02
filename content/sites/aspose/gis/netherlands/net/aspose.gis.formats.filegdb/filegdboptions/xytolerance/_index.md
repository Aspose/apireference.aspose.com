---
title: FileGdbOptions.XYTolerance
second_title: Aspose.GIS voor .NET API-referentie
description: FileGdbOptions eigendom. X en Ysnaptolerantie.
type: docs
weight: 70
url: /nl/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X- en Y-snaptolerantie.

```csharp
public double? XYTolerance { get; set; }
```

### Opmerkingen

Dit is een aanmaakoptie en heeft geen invloed op het lezen. Deze parameter regelt een tolerantie voor snappen die wordt gebruikt voor geavanceerde ArcGIS-functies. Het heeft geen invloed op het gedrag van Aspose.GIS, maar kan wel worden gebruikt door ArcGIS. De eenheid van de parameter is de eenheid van het ruimtelijk referentiesysteem. Indien ingesteld op`null` wordt de standaardwaarde gebruikt. De standaard is afhankelijk van ruimtelijk referentiesysteem en is gelijk aan 0,000000008983153 graden voor geografische systemen of 0,001 meter voor geprojecteerde systemen (waarden worden getransformeerd naar ruimtelijke referentiesysteemeenheden). Als ruimtelijk referentiesysteem onbekend is, is de standaard 0,001.

### Zie ook

* class [FileGdbOptions](../)
* naamruimte [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* montage [Aspose.GIS](../../../)


