---
title: SVGBuilderExtensions.AddCircle
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a circle element configuration to the builder
type: docs
weight: 70
url: /net/aspose.svg.builder/svgbuilderextensions/addcircle/
---
## SVGBuilderExtensions.AddCircle&lt;TBuilder&gt; method

Adds a 'circle' element configuration to the builder.

```csharp
public static TBuilder AddCircle<TBuilder>(this TBuilder builder, 
    Action<SVGCircleElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'circle' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGCircleElementBuilder](../../svgcircleelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
