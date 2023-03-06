---
title: Extent.Grow
second_title: Référence de l'API Aspose.GIS pour .NET
description: Extent méthode. Agrandit cette étendue afin dinclure largument.
type: docs
weight: 160
url: /fr/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Agrandit cette étendue afin d'inclure l'argument.

```csharp
public void Grow(Extent extent)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| extent | Extent | Autre mesure. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de cette ampleur et l'argument n'est pas`null` et pas égaux les uns aux autres. |

### Remarques

Si[`SpatialReferenceSystem`](../spatialreferencesystem/) de ce SRS est`null` puis il est mis à jour avec SRS de l'argument.

### Voir également

* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Agrandit cette étendue afin d'inclure le point spécifié.

```csharp
public void Grow(double x, double y)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| x | Double | Coordonnée X à inclure. |
| y | Double | Coordonnée Y à inclure. |

### Voir également

* class [Extent](../)
* espace de noms [Aspose.Gis](../../extent/)
* Assemblée [Aspose.GIS](../../../)


