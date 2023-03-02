---
title: GeometryCollection.Add
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeometryCollection méthode. Ajoute la géométrie spécifiée à la collection.
type: docs
weight: 110
url: /fr/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Ajoute la géométrie spécifiée à la collection.

```csharp
public void Add(IGeometry geometry)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| geometry | IGeometry | Géométrie à ajouter. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | La collection n'accepte pas les géométries de ce type. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de cette géométrie et[`SpatialReferenceSystem`](../spatialreferencesystem/) d'argument sont tous les deux not `null` et ne sont pas égaux les uns aux autres. |

### Voir également

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* espace de noms [Aspose.Gis.Geometries](../../geometrycollection/)
* Assemblée [Aspose.GIS](../../../)


