---
title: SVGBuilderExtensions.AddImage
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an image element configuration to the builder
type: docs
weight: 330
url: /net/aspose.svg.builder/svgbuilderextensions/addimage/
---
## SVGBuilderExtensions.AddImage&lt;TBuilder&gt; method

Adds an 'image' element configuration to the builder.

```csharp
public static TBuilder AddImage<TBuilder>(this TBuilder builder, 
    Action<SVGImageElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'image' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGImageElementBuilder](../../svgimageelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
