---
title: RasterLayer.Warp
second_title: Référence de l'API Aspose.GIS pour .NET
description: RasterLayer méthode. Déforme le calque raster vers un autre.
type: docs
weight: 210
url: /fr/net/aspose.gis.raster/rasterlayer/warp/
---
## RasterLayer.Warp method

Déforme le calque raster vers un autre.

```csharp
public RasterLayer Warp(WarpOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| options | WarpOptions | Options pour la procédure de reprojection. |

### Return_Value

La couche raster de distorsion.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument ne peut pas être nul. Nom du paramètre : options. |
| ArgumentException | Système de référence spatiale source inconnue. |
| InvalidOperationException | Le calque d'origine ne peut pas être un autre WarpRasterLayer. |

### Voir également

* class [WarpOptions](../../warpoptions/)
* class [RasterLayer](../)
* espace de noms [Aspose.Gis.Raster](../../rasterlayer/)
* Assemblée [Aspose.GIS](../../../)


