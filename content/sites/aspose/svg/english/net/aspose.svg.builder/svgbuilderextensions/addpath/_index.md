---
title: SVGBuilderExtensions.AddPath
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a path element configuration to the builder
type: docs
weight: 400
url: /net/aspose.svg.builder/svgbuilderextensions/addpath/
---
## SVGBuilderExtensions.AddPath&lt;TBuilder&gt; method

Adds a 'path' element configuration to the builder.

```csharp
public static TBuilder AddPath<TBuilder>(this TBuilder builder, 
    Action<SVGPathElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'path' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPathElementBuilder](../../svgpathelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
