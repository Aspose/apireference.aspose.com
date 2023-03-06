---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileGdbCoordinatePrecisionGrid propriété. Obtient ou définit léchelle des coordonnées X et Y. Si réglé surnull la valeur par défaut est utilisée.
type: docs
weight: 60
url: /fr/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Obtient ou définit l'échelle des coordonnées X et Y. Si réglé sur`null` la valeur par défaut est utilisée.

```csharp
public double? XYScale { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | L'argument n'est pas positif. |

### Remarques

La valeur par défaut est`1e9` pour[`VectorLayer`](../../../aspose.gis/vectorlayer/)avec géographique[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) et`Échelle XYS = 1 / Tolérance XY * 10` pour[`VectorLayer`](../../../aspose.gis/vectorlayer/) with projeté[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Voir également

* class [FileGdbCoordinatePrecisionGrid](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* Assemblée [Aspose.GIS](../../../)


