---
title: Geometry.CoveredBy
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Détermine si cette géométrie est couverte par une géométrie spécifiée.
type: docs
weight: 150
url: /fr/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

Détermine si cette géométrie est couverte par une géométrie spécifiée.

```csharp
public bool CoveredBy(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true`si cette géométrie est "couverte spatialement par" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si une géométrie est couverte par une autre en termes de matrice d'intersection DE-9IM. Cette méthode équivaut à :

```csharp
other.Covers(this);
```

### Voir également

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


