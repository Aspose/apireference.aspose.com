---
title: SimpleLabeling.GeometryExpression
second_title: Référence de l'API Aspose.GIS pour .NET
description: SimpleLabeling propriété. Fournit un moyen de remplacer la géométrie de lentité par une autre modifiée pour létiquetage. Ce rappel est invoqué le premier aprèsFeatureBasedConfiguration . La valeur par défaut estnull utiliser la géométrie des entités telle quelle.
type: docs
weight: 70
url: /fr/net/aspose.gis.rendering.labelings/simplelabeling/geometryexpression/
---
## SimpleLabeling.GeometryExpression property

Fournit un moyen de remplacer la géométrie de l'entité par une autre modifiée pour l'étiquetage. Ce rappel est invoqué le premier après[`FeatureBasedConfiguration`](../featurebasedconfiguration/) . La valeur par défaut est`null` (utiliser la géométrie des entités telle quelle).

```csharp
public Func<Feature, IGeometry> GeometryExpression { get; set; }
```

### Voir également

* class [Feature](../../../aspose.gis/feature/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SimpleLabeling](../)
* espace de noms [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* Assemblée [Aspose.GIS](../../../)


