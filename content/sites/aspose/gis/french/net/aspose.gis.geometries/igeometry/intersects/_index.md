---
title: IGeometry.Intersects
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Détermine si cette géométrie croise une étendue spécifiée.
type: docs
weight: 270
url: /fr/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

Détermine si cette géométrie croise une étendue spécifiée.

```csharp
public bool Intersects(Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| extent | Extent | L'ampleur. |

### Return_Value

`true` si cette géométrie coupe l'étendue ;`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |

### Voir également

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Détermine si cette géométrie et une géométrie spécifiée se croisent.

```csharp
public bool Intersects(IGeometry other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| other | IGeometry | Une géométrie. |

### Return_Value

`true` si cette géométrie "coupe spatialement" une autre géométrie.`false` sinon.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'une des géométries est invalide de sorte que l'opération ne peut pas être terminée. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) des géométries ne sont pas équivalentes. Vous pouvez utiliser[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) afin de convertir des géométries dans le même système de référence spatial . |

### Remarques

Cette méthode équivaut à : C'est la négation de[`Disjoint`](../disjoint/) . Voir[`Disjoint`](../disjoint/) pour plus de détails.

```csharp
!this.Disjoint(other);
```

### Voir également

* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


