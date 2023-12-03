---
title: SVGBuilderExtensions.AddRect
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a rect element configuration to the builder
type: docs
weight: 450
url: /net/aspose.svg.builder/svgbuilderextensions/addrect/
---
## SVGBuilderExtensions.AddRect&lt;TBuilder&gt; method

Adds a 'rect' element configuration to the builder.

```csharp
public static TBuilder AddRect<TBuilder>(this TBuilder builder, 
    Action<SVGRectElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'rect' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGRectElementBuilder](../../svgrectelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
