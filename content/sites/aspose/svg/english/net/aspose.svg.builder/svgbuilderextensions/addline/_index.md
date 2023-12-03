---
title: SVGBuilderExtensions.AddLine
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a line element configuration to the builder
type: docs
weight: 350
url: /net/aspose.svg.builder/svgbuilderextensions/addline/
---
## SVGBuilderExtensions.AddLine&lt;TBuilder&gt; method

Adds a 'line' element configuration to the builder.

```csharp
public static TBuilder AddLine<TBuilder>(this TBuilder builder, 
    Action<SVGLineElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'line' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGLineElementBuilder](../../svglineelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
