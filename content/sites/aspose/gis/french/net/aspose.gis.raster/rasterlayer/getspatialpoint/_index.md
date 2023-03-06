---
title: RasterLayer.GetSpatialPoint
second_title: Référence de l'API Aspose.GIS pour .NET
description: RasterLayer méthode. Convertit la colonne et la ligne spécifiées en coordonnées spatiales.
type: docs
weight: 150
url: /fr/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Convertit la colonne et la ligne spécifiées en coordonnées spatiales.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| cellX | Int32 | La valeur de la colonne (coordonnée x). La numérotation commence à 0. |
| cellY | Int32 | La valeur de la ligne (coordonnée y). La numérotation commence à 0. |

### Return_Value

Renvoie la coordonnée x du coin supérieur gauche d'une colonne et d'une ligne.

### Remarques

Si l'un ou l'autre des paramètres est passé hors de la plage de la dimension respective du raster, il renverra des coordonnées en dehors du raster en supposant que la grille du raster est applicable en dehors des limites du raster.

### Voir également

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* espace de noms [Aspose.Gis.Raster](../../rasterlayer/)
* Assemblée [Aspose.GIS](../../../)


