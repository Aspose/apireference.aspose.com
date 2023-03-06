---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS für .NET-API-Referenz
description: Dataset methode. Öffnet die Ebene am angegebenen Index zum Lesen.
type: docs
weight: 120
url: /de/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Öffnet die Ebene am angegebenen Index zum Lesen.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| index | Int32 | Index der zu öffnenden Ebene. |
| options | DriverOptions | Optionen öffnen. |

### Rückgabewert

Die Ebene wurde zum Lesen geöffnet.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für dieses Dataset. |
| ArgumentOutOfRangeException | Der Index liegt außerhalb des gültigen Bereichs |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für dieses Dataset. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Features aus dem Layer. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namensraum [Aspose.Gis](../../dataset/)
* Montage [Aspose.GIS](../../../)


