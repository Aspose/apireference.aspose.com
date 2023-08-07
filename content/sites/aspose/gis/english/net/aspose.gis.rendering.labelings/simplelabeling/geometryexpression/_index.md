---
title: SimpleLabeling.GeometryExpression
second_title: Aspose.GIS for .NET API Reference
description: SimpleLabeling property. Provides a way to substitute the feature geometry with a one modified for labeling. This callback is invoked the first after FeatureBasedConfiguration . Default is null use feature geometry asis
type: docs
weight: 70
url: /net/aspose.gis.rendering.labelings/simplelabeling/geometryexpression/
---
## SimpleLabeling.GeometryExpression property

Provides a way to substitute the feature geometry with a one modified for labeling. This callback is invoked the first after [`FeatureBasedConfiguration`](../featurebasedconfiguration/) . Default is `null` (use feature geometry as-is).

```csharp
public Func<Feature, IGeometry> GeometryExpression { get; set; }
```

### See Also

* class [Feature](../../../aspose.gis/feature/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SimpleLabeling](../)
* namespace [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* assembly [Aspose.GIS](../../../)


