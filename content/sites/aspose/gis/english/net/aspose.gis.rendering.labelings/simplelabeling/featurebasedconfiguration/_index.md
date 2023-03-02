---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API Reference
description: SimpleLabeling property. A callback that is used to configure this labeling before handling a feature.
type: docs
weight: 20
url: /net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

A callback that is used to configure this labeling before handling a feature.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### Remarks

This callback is invoked before labeling every feature. It accepts a feature that is about to be labeled and a clone of this labeling. By changing properties of the clone, it is possible to update labeling's behavior based on feature's attributes.

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* namespace [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* assembly [Aspose.GIS](../../../)


