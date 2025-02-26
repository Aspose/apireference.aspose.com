---
title: Class LayeredSymbolizer
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer class. A symbolizer that renders several other symbolizers
type: docs
weight: 4280
url: /net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

A symbolizer that renders several other symbolizers.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Constructors

| Name | Description |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Creates new instance. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Gets the number of symbolizers. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Gets the symbolizer at the specified index . |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Determines the rendering order. ByFeatures - render all symbolizers for the feature, then proceed to the next feature. ByLayers - render all features with the symbolizer, then proceed to the next symbolizer. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Adds the specified symbolizer. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Returns an enumerator that iterates through the collection. |

### See Also

* class [VectorSymbolizer](../vectorsymbolizer/)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assembly [Aspose.GIS](../../)


