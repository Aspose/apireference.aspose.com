---
title: XyzTiles.GetTiles
second_title: Référence de l'API Aspose.GIS pour .NET
description: XyzTiles méthode. Charge les tuiles en fonction de la zone de délimitation spatiale et du niveau de zoom.
type: docs
weight: 40
url: /fr/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

Charge les tuiles en fonction de la zone de délimitation spatiale et du niveau de zoom.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| zoom | Int32 | Le niveau de zoom pour le chargement des tuiles. Le niveau de zoom le plus élevé est 0. La plupart des fournisseurs de tuiles ont environ 22 niveaux de zoom maximum. |
| extent | Extent | La boîte englobante pour charger les tuiles. La référence spatiale Wgs84 sera utilisée si elle est manquée. |

### Return_Value

Les tuiles Web.

### Voir également

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* espace de noms [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* Assemblée [Aspose.GIS](../../../)


