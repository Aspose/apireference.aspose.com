---
title: XyzTiles.GetTiles
second_title: Riferimento API Aspose.GIS per .NET
description: XyzTiles metodo. Carica i riquadri in base al riquadro di delimitazione spaziale e al livello di zoom.
type: docs
weight: 40
url: /it/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

Carica i riquadri in base al riquadro di delimitazione spaziale e al livello di zoom.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| zoom | Int32 | Il livello di zoom per il caricamento dei riquadri. Il livello di zoom più alto è 0. La maggior parte dei fornitori di tessere ha circa 22 livelli di zoom massimi. |
| extent | Extent | Il riquadro di delimitazione per caricare le tessere. Se manca, verrà utilizzato il riferimento spaziale Wgs84. |

### Valore di ritorno

Le tessere web.

### Guarda anche

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* spazio dei nomi [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* assemblea [Aspose.GIS](../../../)


