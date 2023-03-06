---
title: CircularString.Item
second_title: Aspose.GIS für .NET-API-Referenz
description: CircularString eigendom. Ruft ab oder setzt dieIPoint am angegebenen Index.
type: docs
weight: 90
url: /de/net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

Ruft ab oder setzt die[`IPoint`](../../ipoint/) am angegebenen Index.

```csharp
public IPoint this[int index] { get; set; }
```

| Parameter | Beschreibung |
| --- | --- |
| index | Der Index. |

### Eigentumswert

Die[`IPoint`](../../ipoint/) .

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Der Index liegt außerhalb des gültigen Bereichs. |
| ArgumentNullException | Der Wert ist`null`. |
| ArgumentException | Punkt ist leer. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) dieser Geometrie und[`SpatialReferenceSystem`](../spatialreferencesystem/) Argument sind beide nicht`null` und sind nicht gleich. |

### Siehe auch

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* namensraum [Aspose.Gis.Geometries](../../circularstring/)
* Montage [Aspose.GIS](../../../)


