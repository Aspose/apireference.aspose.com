---
title: Dataset.OpenLayer
second_title: Aspose.GIS voor .NET API-referentie
description: Dataset methode. Opent de laag met opgegeven naam om te lezen.
type: docs
weight: 110
url: /nl/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Opent de laag met opgegeven naam om te lezen.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van de te openen laag. |
| options | DriverOptions | Opties openen. |

### Winstwaarde

De laag is geopend om te lezen.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentException | Laag met opgegeven naam bestaat niet; Options-object heeft een onjuist type voor deze dataset. |
| ArgumentException | Options-object heeft een onjuist type voor deze dataset. |
| ArgumentNullException | De naam is`null`. |
| [GisException](../../gisexception/) | Fout bij het lezen van het object van de laag. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* naamruimte [Aspose.Gis](../../dataset/)
* montage [Aspose.GIS](../../../)


