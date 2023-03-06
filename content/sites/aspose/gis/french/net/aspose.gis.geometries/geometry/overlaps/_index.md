---
title: Geometry.Overlaps
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Détermine si cette géométrie chevauche une géométrie spécifiée.
type: docs
weight: 290
url: /fr/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

Détermine si cette géométrie chevauche une géométrie spécifiée.

```csharp
public bool Overlaps(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie "superpose spatialement" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si les géométries se chevauchent en termes de matrice d'intersection DE-9IM. Deux géométries se chevauchent si elles ont certains mais pas tous les points intérieurs en commun et l'intersection des géométries a la même dimension que les géométries elles-mêmes. Pour deuxPoint géométries ou deuxSurface géométries cette_méthode est équivalente à : Pour deuxLine géométries cette méthode équivaut à : Pour deux géométries non égales[`Dimension`](../../igeometry/dimension/) cette méthode retourne toujours`false`. Voir OpenGIS Simple Features Specification pour plus de détails sur DE-9IM et la relation "superposition spatiale".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Voir également

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


