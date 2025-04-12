---
title: SVGBuilderExtensions.Transform
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Transform method. Sets the transform attribute for an SVG element
type: docs
weight: 2260
url: /net/aspose.svg.builder/svgbuilderextensions/transform/
---
## SVGBuilderExtensions.Transform&lt;TBuilder&gt; method

Sets the 'transform' attribute for an SVG element.

```csharp
public static TBuilder Transform<TBuilder>(this TBuilder builder, 
    Func<TransformBuilder, TransformBuilder> configure)
    where TBuilder : ISVGElementBuilder, ITransformAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A function to configure the SVG transform. |

### Return Value

The builder instance for chaining.

### See Also

* class [TransformBuilder](../../transformbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITransformAttributeSetter](../../itransformattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
