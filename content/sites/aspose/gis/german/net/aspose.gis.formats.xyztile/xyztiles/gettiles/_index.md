---
title: XyzTiles.GetTiles
second_title: Aspose.GIS für .NET-API-Referenz
description: XyzTiles methode. Lädt Kacheln anhand des räumlichen Begrenzungsrahmens und der Zoomstufe.
type: docs
weight: 40
url: /de/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

Lädt Kacheln anhand des räumlichen Begrenzungsrahmens und der Zoomstufe.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| zoom | Int32 | Die Zoomstufe zum Laden von Kacheln. Die höchste Zoomstufe ist 0. Die meisten Kachelanbieter haben etwa 22 maximale Zoomstufen. |
| extent | Extent | Der Begrenzungsrahmen zum Laden von Kacheln. Der Wgs84-Raumbezug wird verwendet, wenn er fehlt. |

### Rückgabewert

Die Webkacheln.

### Siehe auch

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* namensraum [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* Montage [Aspose.GIS](../../../)


