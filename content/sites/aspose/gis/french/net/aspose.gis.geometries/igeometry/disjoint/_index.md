---
title: IGeometry.Disjoint
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Détermine si cette géométrie est disjointe dune géométrie spécifiée.
type: docs
weight: 180
url: /fr/net/aspose.gis.geometries/igeometry/disjoint/
---
## IGeometry.Disjoint method

Détermine si cette géométrie est disjointe d'une géométrie spécifiée.

```csharp
public bool Disjoint(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie est "spatialement disjointe" d'une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si les géométries sont disjointes en termes de matrice d'intersection DE-9IM. Fondamentalement, elle teste que deux géométries n'ont pas de points communs. Cette méthode équivaut à : Voir OpenGIS Simple Features Specification pour plus de détails sur DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Voir également

* method [Intersects](../intersects/)
* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


