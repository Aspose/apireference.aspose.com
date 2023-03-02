---
title: XyzTiles.GetTiles
second_title: Aspose.GIS for .NET API Reference
description: XyzTiles method. Loads tiles by the spatial bounding box and zoom level.
type: docs
weight: 40
url: /net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

Loads tiles by the spatial bounding box and zoom level.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| zoom | Int32 | The zoom level for loading tiles. The highest zoom level is 0. Most tile providers have about 22 maximum zoom levels. |
| extent | Extent | The bounding box to load tiles. The Wgs84 spatial reference will be used if it is missed. |

### Return Value

The web tiles.

### See Also

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* namespace [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* assembly [Aspose.GIS](../../../)


