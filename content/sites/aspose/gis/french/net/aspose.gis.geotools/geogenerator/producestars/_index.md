---
title: GeoGenerator.ProduceStars
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeoGenerator méthode. Crée un tableau détoiles toutes dans une étendue donnée.
type: docs
weight: 40
url: /fr/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Crée un tableau d'étoiles, toutes dans une étendue donnée.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| rect | Extent | Zone spécifiée (voir[`Étendue`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Options de création de polygones (voir[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Return_Value

Réseau d'étoiles (voir énumération des[`IPolygone`](../../../aspose.gis.geometries/ipolygon/))

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Le nombre d'étoiles doit être supérieur à un. |
| NullReferenceException | L'étendue doit avoir une valeur (et non NULL) |
| ArgumentException | Les longueurs minimale et maximale doivent être inégales et supérieures à 3 |
| ArgumentException | La longueur maximale doit être supérieure à la longueur minimale |

### Voir également

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* espace de noms [Aspose.Gis.GeoTools](../../geogenerator/)
* Assemblée [Aspose.GIS](../../../)


