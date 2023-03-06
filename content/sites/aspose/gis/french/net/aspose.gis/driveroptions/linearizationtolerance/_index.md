---
title: DriverOptions.LinearizationTolerance
second_title: Référence de l'API Aspose.GIS pour .NET
description: DriverOptions propriété. Une tolérance à utiliser pour linéariser les géométries de courbe.
type: docs
weight: 50
url: /fr/net/aspose.gis/driveroptions/linearizationtolerance/
---
## DriverOptions.LinearizationTolerance property

Une tolérance à utiliser pour linéariser les géométries de courbe.

```csharp
public double LinearizationTolerance { get; set; }
```

### Valeur de la propriété

La tolérance à passer à[`ToLinearGeometry`](../../../aspose.gis.geometries/geometry/tolineargeometry/) avant d'ajouter des géométries.

### Remarques

Il s'agit d'une option de création - elle n'affecte pas l'ouverture. Si le pilote ne prend pas en charge les géométries non linéaires, elles sont automatiquement linéarisées. Cette propriété spécifie un argument pour le[`ToLinearGeometry`](../../../aspose.gis.geometries/geometry/tolineargeometry/) méthode utilisée pour la linéarisation.

### Voir également

* class [DriverOptions](../)
* espace de noms [Aspose.Gis](../../driveroptions/)
* Assemblée [Aspose.GIS](../../../)


