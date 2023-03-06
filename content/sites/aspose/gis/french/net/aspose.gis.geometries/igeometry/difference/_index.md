---
title: IGeometry.Difference
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Soustrait une géométrie spécifiée de cette géométrie.
type: docs
weight: 170
url: /fr/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

Soustrait une géométrie spécifiée de cette géométrie.

```csharp
public IGeometry Difference(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie à soustraire. |

### Return_Value

Une géométrie qui représente une différence entre cette géométrie et un argument. La géométrie résultante contient ensemble de points présents dans cette géométrie mais non présents dans un argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *other* est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Voir également

* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


