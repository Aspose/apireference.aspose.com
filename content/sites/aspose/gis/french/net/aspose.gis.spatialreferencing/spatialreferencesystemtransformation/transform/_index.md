---
title: SpatialReferenceSystemTransformation.Transform
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystemTransformation méthode. Transforme la géométrie du système de référence spatiale source en système de référence spatiale cible.
type: docs
weight: 40
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Transforme la géométrie du système de référence spatiale source en système de référence spatiale cible.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| geometry | IGeometry | Géométrie à transformer. |

### Return_Value

Nouvelle géométrie dans le système de référence spatiale cible.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | La géométrie est`null` . |
| ArgumentException | Géométries[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) n'est pas`null` et n'équivaut pas à [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | La transformation a échoué. |

### Voir également

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* Assemblée [Aspose.GIS](../../../)


