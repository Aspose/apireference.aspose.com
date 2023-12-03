---
title: SVGBuilderExtensions.FloodOpacity
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the flood-opacity attribute for an SVG element. Value must be between 0.0 fully transparent and 1.0 fully opaque
type: docs
weight: 860
url: /net/aspose.svg.builder/svgbuilderextensions/floodopacity/
---
## SVGBuilderExtensions.FloodOpacity&lt;TBuilder&gt; method

Sets the 'flood-opacity' attribute for an SVG element. Value must be between 0.0 (fully transparent) and 1.0 (fully opaque).

```csharp
public static TBuilder FloodOpacity<TBuilder>(this TBuilder builder, double opacity)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| opacity | The opacity value to set. |

### Return Value

The builder instance for chaining.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Thrown if opacity is not in the valid range. |

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
