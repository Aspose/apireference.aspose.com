---
title: Dataset.EditLayer
second_title: Aspose.GIS voor .NET API-referentie
description: Dataset methode. Opent de laag met opgegeven naam voor bewerking.
type: docs
weight: 90
url: /nl/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Opent de laag met opgegeven naam voor bewerking.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van de laag die moet worden bewerkt. |
| options | DriverOptions | Opties openen. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem voor nieuwe geometrieën. |

### Winstwaarde

De laag is geopend voor bewerking.

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
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* naamruimte [Aspose.Gis](../../dataset/)
* montage [Aspose.GIS](../../../)


