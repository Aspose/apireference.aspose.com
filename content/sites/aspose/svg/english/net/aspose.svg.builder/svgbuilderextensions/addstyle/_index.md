---
title: SVGBuilderExtensions.AddStyle
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddStyle method. Adds a style element configuration to the builder
type: docs
weight: 490
url: /net/aspose.svg.builder/svgbuilderextensions/addstyle/
---
## SVGBuilderExtensions.AddStyle&lt;TBuilder&gt; method

Adds a 'style' element configuration to the builder.

```csharp
public static TBuilder AddStyle<TBuilder>(this TBuilder builder, 
    Action<SVGStyleElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeContentElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'style' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGStyleElementBuilder](../../svgstyleelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeContentElementBuilder](../../ishapecontentelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
