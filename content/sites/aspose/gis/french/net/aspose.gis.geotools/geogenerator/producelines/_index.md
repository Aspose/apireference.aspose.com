---
title: GeoGenerator.ProduceLines
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeoGenerator méthode. Crée un nouvel énumérateur ILineString avec un nombre donné déléments aléatoires tous dans une étendue donnée.
type: docs
weight: 10
url: /fr/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Crée un nouvel énumérateur ILineString avec un nombre donné d'éléments aléatoires, tous dans une étendue donnée.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| rect | Extent | Zone spécifiée (voir[`Étendue`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Options de création de ligne (voir[`Options du générateur de ligne`](../../linegeneratoroptions/)) |

### Return_Value

Tableau de lignes (voir énumération des[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Le nombre de lignes doit être supérieur à un. |
| NullReferenceException | L'étendue doit avoir une valeur (et non NULL) |

### Voir également

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* espace de noms [Aspose.Gis.GeoTools](../../geogenerator/)
* Assemblée [Aspose.GIS](../../../)


