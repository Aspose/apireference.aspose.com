---
title: IGeometry.Within
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Détermine si cette géométrie se trouve dans une étendue spécifiée.
type: docs
weight: 380
url: /fr/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Détermine si cette géométrie se trouve dans une étendue spécifiée.

```csharp
public bool Within(Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| extent | Extent | L'ampleur. |

### Return_Value

`true` si cette géométrie est dans l'étendue ;`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |

### Voir également

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Détermine si cette géométrie se trouve dans une géométrie spécifiée.

```csharp
public bool Within(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie est "spatialement à l'intérieur" d'une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode teste si une géométrie est dans une autre en termes de matrice d'intersection DE-9IM. Une géométrie est dans une autre, si une autre géométrie contient tous les points de la géométrie et que les intérieurs geometries se croisent. Cette méthode équivaut à : Voir OpenGIS Simple Features Specification pour plus de détails sur DE-9IM et la relation "spatialement à l'intérieur".

```csharp
this.Relate(other, "T*F**F***");
```

### Voir également

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


