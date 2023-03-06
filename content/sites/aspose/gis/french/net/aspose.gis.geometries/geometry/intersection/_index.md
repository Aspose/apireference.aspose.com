---
title: Geometry.Intersection
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Construit une intersection entre cette géométrie et une géométrie spécifiée.
type: docs
weight: 270
url: /fr/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

Construit une intersection entre cette géométrie et une géométrie spécifiée.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie avec laquelle calculer l'intersection. |

### Return_Value

Une géométrie qui représente une intersection de cette géométrie et un argument. La géométrie résultante contient ensemble de points présent à la fois dans cette géométrie et dans un argument.

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


