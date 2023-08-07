---
title: SimpleLine.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API Reference
description: SimpleLine property. A callback that is used to configure this symbolizer before rendering a feature
type: docs
weight: 60
url: /net/aspose.gis.rendering.symbolizers/simpleline/featurebasedconfiguration/
---
## SimpleLine.FeatureBasedConfiguration property

A callback that is used to configure this symbolizer before rendering a feature.

```csharp
public Action<Feature, SimpleLine> FeatureBasedConfiguration { get; set; }
```

## Remarks

This callback is invoked before rendering every feature. It accepts a feature that is about to be rendered and a clone of this symbolizer. By changing properties of the clone, it is possible to update symbolizer's behavior based on feature's attributes.

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLine](../)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../simpleline/)
* assembly [Aspose.GIS](../../../)


