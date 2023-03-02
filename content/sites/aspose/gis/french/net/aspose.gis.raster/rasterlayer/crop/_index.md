---
title: RasterLayer.Crop
second_title: Référence de l'API Aspose.GIS pour .NET
description: RasterLayer méthode. Recadre la couche raster à laide dune forme de forme et dun masque de bande.
type: docs
weight: 110
url: /fr/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Recadre la couche raster à l'aide d'une forme de forme (et d'un masque de bande).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| geometry | IGeometry | La géométrie représentait la forme de la forme. |
| masks | Double[] | Masque pour la couche de recadrage |

### Return_Value

La couche raster recadrée. Si aucune intersection trouvée renvoie`null`.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument ne peut pas être nul. Nom du paramètre : géométrie. |
| NotSupportedException | L'argument ne peut pas être différent du polygone ou de la surface. Nom du paramètre : géométrie. |
| InvalidOperationException | Le calque d'origine ne peut pas être un autre CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Erreur lors du recadrage du calque. |

### Voir également

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* espace de noms [Aspose.Gis.Raster](../../rasterlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Recadre la couche raster à l'aide d'un masque de bande).

```csharp
public RasterLayer Crop(double[] masks)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| masks | Double[] | Masque pour la couche de recadrage |

### Return_Value

La couche raster recadrée. Si aucune intersection trouvée renvoie`null`.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException |  |

### Voir également

* class [RasterLayer](../)
* espace de noms [Aspose.Gis.Raster](../../rasterlayer/)
* Assemblée [Aspose.GIS](../../../)


