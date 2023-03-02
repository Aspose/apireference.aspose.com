---
title: Geometry.Covers
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Détermine si cette géométrie couvre une géométrie spécifiée.
type: docs
weight: 160
url: /fr/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

Détermine si cette géométrie couvre une géométrie spécifiée.

```csharp
public bool Covers(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie "couvre spatialement" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si une géométrie en recouvre une autre en termes de matrice d'intersection DE-9IM. Une géométrie en recouvre une autre, si la géométrie contient tous les points d'une autre géométrie. Cette méthode est similaire à[`SpatiallyContains`](../../igeometry/spatiallycontains/) , mais revient`true` plus souvent, car il ne fait pas la distinction entre les points intérieurs et les points limites. Donc, si la géométrie A se trouve sur la limite de géométrie B,[`SpatiallyContains`](../../igeometry/spatiallycontains/) Retour`false` , alors que cette méthode retourne`true`. Cette méthode équivaut à :

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Voir également

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


