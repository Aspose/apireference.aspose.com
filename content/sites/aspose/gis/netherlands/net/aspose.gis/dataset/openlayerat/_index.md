---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS voor .NET API-referentie
description: Dataset methode. Opent de laag op gespecificeerde index om te lezen.
type: docs
weight: 120
url: /nl/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Opent de laag op gespecificeerde index om te lezen.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | Int32 | Index van de te openen laag. |
| options | DriverOptions | Opties openen. |

### Winstwaarde

De laag is geopend om te lezen.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentException | Options-object heeft een onjuist type voor deze dataset. |
| ArgumentOutOfRangeException | Index is buiten bereik |
| ArgumentException | Options-object heeft een onjuist type voor deze dataset. |
| [GisException](../../gisexception/) | Fout bij het lezen van het object van de laag. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* naamruimte [Aspose.Gis](../../dataset/)
* montage [Aspose.GIS](../../../)


