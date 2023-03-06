---
title: IGeometry.SpatiallyContains
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Détermine si cette géométrie contient spatialement une géométrie spécifiée.
type: docs
weight: 310
url: /fr/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

Détermine si cette géométrie contient spatialement une géométrie spécifiée.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true`si cette géométrie "contient spatialement" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si une géométrie en contient une autre en termes de matrice d'intersection DE-9IM. Cette méthode équivaut à :

```csharp
other.Within(this);
```

### Voir également

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


