---
title: SVGBuilderExtensions.AddSvg
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an svg scalable vector graphics element configuration to the builder
type: docs
weight: 500
url: /net/aspose.svg.builder/svgbuilderextensions/addsvg/
---
## SVGBuilderExtensions.AddSvg&lt;TBuilder&gt; method

Adds an 'svg' (scalable vector graphics) element configuration to the builder.

```csharp
public static TBuilder AddSvg<TBuilder>(this TBuilder builder, 
    Action<SVGSVGElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IStructuralElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'svg' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGSVGElementBuilder](../../svgsvgelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IStructuralElementBuilder](../../istructuralelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
