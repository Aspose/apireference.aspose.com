---
title: XyzTiles.GetTiles
second_title: Referencia de API de Aspose.GIS para .NET
description: XyzTiles método. Carga mosaicos por el cuadro delimitador espacial y el nivel de zoom.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

Carga mosaicos por el cuadro delimitador espacial y el nivel de zoom.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| zoom | Int32 | El nivel de zoom para cargar mosaicos. El nivel de zoom más alto es 0. La mayoría de los proveedores de mosaicos tienen alrededor de 22 niveles de zoom máximos. |
| extent | Extent | El cuadro delimitador para cargar mosaicos. La referencia espacial Wgs84 se utilizará si se pierde. |

### Valor_devuelto

Los mosaicos web.

### Ver también

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* espacio de nombres [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* asamblea [Aspose.GIS](../../../)


