---
title: Geometry.Union
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Réunit cette géométrie et une géométrie spécifiée.
type: docs
weight: 430
url: /fr/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Réunit cette géométrie et une géométrie spécifiée.

```csharp
public IGeometry Union(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie avec laquelle s'unir. |

### Return_Value

Une géométrie qui représente une union de cette géométrie et d'un argument. La géométrie résultante contient ensemble de points présent dans cette géométrie ou dans un argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *other* est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Voir également

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


