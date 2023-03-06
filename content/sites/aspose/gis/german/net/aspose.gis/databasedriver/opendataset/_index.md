---
title: DatabaseDriver.OpenDataset
second_title: Aspose.GIS für .NET-API-Referenz
description: DatabaseDriver methode. Öffnet den Datensatz.
type: docs
weight: 10
url: /de/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Öffnet den Datensatz.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| connection | IDbConnection | Geöffnete Verbindung zur Datenbank. |

### Rückgabewert

Eine Instanz von[`Dataset`](../../dataset/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Die Verbindung ist`null`. |
| [GisException](../../gisexception/) | Fehler beim Lesen des Datensatzes. |
| IOException | Ein E/A-Fehler ist aufgetreten. |

### Siehe auch

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* namensraum [Aspose.Gis](../../databasedriver/)
* Montage [Aspose.GIS](../../../)


