---
title: Geometry.Touches
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Détermine si cette géométrie et une géométrie spécifiée se touchent.
type: docs
weight: 420
url: /fr/net/aspose.gis.geometries/geometry/touches/
---
## Geometry.Touches method

Détermine si cette géométrie et une géométrie spécifiée se touchent.

```csharp
public bool Touches(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie "touche spatialement" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si les géométries se touchent en termes de matrice d'intersection DE-9IM. Deux géométries se touchent si elles ont au moins un point de frontière en commun, mais pas de points intérieurs. Soit : deux[`LineString`](../../linestring/)se touchent s'ils partagent une extrémité, mais ne partagent pas un segment, deux polygones se touchent s'ils partagent une partie de l'anneau extérieur ou intérieur, mais leurs intérieurs ne se chevauchent pas. Cette méthode équivaut à : Voir OpenGIS Simple Features Specification pour plus de détails sur DE-9IM et la relation "toucher spatialement".

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Voir également

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


