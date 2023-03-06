---
title: Map.Extent
second_title: Référence de l'API Aspose.GIS pour .NET
description: Map propriété. Spécifie les limites de la carte à rendre. Si défini surnull  létendue est calculée lors du rendu pour inclure toutes les géométries dans toutes les couches.
type: docs
weight: 40
url: /fr/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Spécifie les limites de la carte à rendre. Si défini sur`null` , l'étendue est calculée lors du rendu pour inclure toutes les géométries dans toutes les couches.

```csharp
public Extent Extent { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) est`false`.[`Width`](../../../aspose.gis/extent/width/) est inférieur ou égal à zéro.[`Height`](../../../aspose.gis/extent/height/) est inférieur ou égal à zéro.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) est`null`. |

### Remarques

Si le système de référence spatiale de l'étendue n'est pas égal au système de référence spatiale de la carte, l'étendue est transformée dans le système de référence spatiale cible pendant le rendu.

### Voir également

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* espace de noms [Aspose.Gis.Rendering](../../map/)
* Assemblée [Aspose.GIS](../../../)


