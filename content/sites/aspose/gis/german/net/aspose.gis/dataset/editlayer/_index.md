---
title: Dataset.EditLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: Dataset methode. Öffnet die Ebene mit dem angegebenen Namen zur Bearbeitung.
type: docs
weight: 90
url: /de/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Öffnet die Ebene mit dem angegebenen Namen zur Bearbeitung.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Name der zu bearbeitenden Ebene. |
| options | DriverOptions | Optionen öffnen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem für neue Geometrien. |

### Rückgabewert

Die zur Bearbeitung geöffnete Ebene.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Layer mit dem angegebenen Namen existiert nicht; Das Optionsobjekt hat einen falschen Typ für diesen Datensatz. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für dieses Dataset. |
| ArgumentNullException | Der Name ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Features aus dem Layer. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)


