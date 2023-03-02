---
title: RasterImageMarker.FeatureBasedConfiguration
second_title: Aspose.GIS for .NET API Reference
description: RasterImageMarker property. A callback that is used to configure this symbolizer before rendering a feature.
type: docs
weight: 20
url: /net/aspose.gis.rendering.symbolizers/rasterimagemarker/featurebasedconfiguration/
---
## RasterImageMarker.FeatureBasedConfiguration property

A callback that is used to configure this symbolizer before rendering a feature.

```csharp
public Action<Feature, RasterImageMarker> FeatureBasedConfiguration { get; set; }
```

### Remarks

This callback is invoked before rendering every feature. It accepts a feature that is about to be rendered and a clone of this symbolizer. By changing properties of the clone, it is possible to update symbolizer's behavior based on feature's attributes.

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [RasterImageMarker](../)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../rasterimagemarker/)
* assembly [Aspose.GIS](../../../)


