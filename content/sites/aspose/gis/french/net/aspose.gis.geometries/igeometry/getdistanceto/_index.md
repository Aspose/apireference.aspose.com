---
title: IGeometry.GetDistanceTo
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Calcule la distance minimale entre cette géométrie et une géométrie spécifiée.
type: docs
weight: 230
url: /fr/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

Calcule la distance minimale entre cette géométrie et une géométrie spécifiée.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie à laquelle trouver la distance. |

### Return_Value

Si les deux géométries ne sont pas[`IsEmpty`](../isempty/) - une distance entre les points les plus proches des géométries. Si au moins une géométrie est vide -1 est renvoyé.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Voir également

* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


