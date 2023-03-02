---
title: Geometry.SpatiallyEquals
second_title: Référence de l'API Aspose.GIS pour .NET
description: Geometry méthode. Détermine si cette géométrie est spatialement égale à une géométrie spécifiée.
type: docs
weight: 370
url: /fr/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Détermine si cette géométrie est spatialement égale à une géométrie spécifiée.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie "est spatialement égale" à la géométrie spécifiée.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste l'égalité en termes de matrice d'intersection DE-9IM. Il ne dépend pas de l'ordre des composants (par exemple l'ordre des anneaux intérieurs dans le polygone), des valeurs Z et M. Fondamentalement, il teste que deux géométries occupent le même "espace" lorsqu'elles sont projetées sur un espace à deux dimensions. Cette méthode équivaut à : Voir OpenGIS Simple Features Specification pour plus de détails sur DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Voir également

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espace de noms [Aspose.Gis.Geometries](../../geometry/)
* Assemblée [Aspose.GIS](../../../)


