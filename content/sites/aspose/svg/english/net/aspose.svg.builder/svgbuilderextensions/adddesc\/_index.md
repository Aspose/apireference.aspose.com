---
title: SVGBuilderExtensions.AddDesc
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddDesc method. Adds a desc element configuration to the builder. The desc element is used to provide a description for SVG content
type: docs
weight: 110
url: /net/aspose.svg.builder/svgbuilderextensions/adddesc/
---
## SVGBuilderExtensions.AddDesc<TBuilder> method

Adds a 'desc' element configuration to the builder. The 'desc' element is used to provide a description for SVG content.

```csharp
public static TBuilder AddDesc<TBuilder>(this TBuilder builder, 
    Action<SVGDescElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IDescriptiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'desc' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGDescElementBuilder](../../svgdescelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDescriptiveElementBuilder](../../idescriptiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
