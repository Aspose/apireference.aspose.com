---
title: Extent.Intersects
second_title: Référence de l'API Aspose.GIS pour .NET
description: Extent méthode. Détermine si cette étendue croise largument.
type: docs
weight: 190
url: /fr/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Détermine si cette étendue croise l'argument.

```csharp
public bool Intersects(Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| extent | Extent | Une autre mesure. |

### Return_Value

Valeur, indiquant si cette étendue croise l'argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de cette ampleur et l'argument n'est pas`null` et pas égaux les uns aux autres. |

### Voir également

* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Détermine si cette étendue croise l'argument.

```csharp
public bool Intersects(IGeometry geometry)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| geometry | IGeometry | Une géométrie pour tester l'intersection |

### Return_Value

Valeur, indiquant si cette étendue croise l'argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de cette ampleur et l'argument n'est pas`null` et pas égaux les uns aux autres. |

### Voir également

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)


