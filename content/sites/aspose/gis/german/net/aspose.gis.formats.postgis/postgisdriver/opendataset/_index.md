---
title: PostGisDriver.OpenDataset
second_title: Aspose.GIS für .NET-API-Referenz
description: PostGisDriver methode. Öffnet den Datensatz.
type: docs
weight: 10
url: /de/net/aspose.gis.formats.postgis/postgisdriver/opendataset/
---
## PostGisDriver.OpenDataset method

Öffnet den Datensatz.

```csharp
public override Dataset OpenDataset(IDbConnection connection)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| connection | IDbConnection | Geöffnete Verbindung zur Datenbank. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../../aspose.gis/dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Die Verbindung ist`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [Dataset](../../../aspose.gis/dataset/)
* class [PostGisDriver](../)
* namensraum [Aspose.Gis.Formats.PostGis](../../postgisdriver/)
* Montage [Aspose.GIS](../../../)


