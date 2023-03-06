---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Aspose.GIS voor .NET API-referentie
description: FileGdbOptions eigendom. Of coördinaten binnen een geldig bereik moeten vallen.
type: docs
weight: 30
url: /nl/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

Of coördinaten binnen een geldig bereik moeten vallen.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### Opmerkingen

Dit is een aanmaakoptie en heeft geen invloed op het lezen. Indien ingesteld op`true` er wordt een uitzondering gegenereerd bij een poging om een coördinaat te schrijven met waarden buiten het geldige bereik. Indien ingesteld op`false` zo'n coördinaat wordt stil geschreven. Geldig bereik wordt bepaald door[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . Verwijzen naar[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) documentatie om te lezen hoe een geldig bereik wordt bepaald op basis van het coördinatenprecisieraster. Standaard is`false` .

### Zie ook

* class [FileGdbOptions](../)
* naamruimte [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* montage [Aspose.GIS](../../../)


