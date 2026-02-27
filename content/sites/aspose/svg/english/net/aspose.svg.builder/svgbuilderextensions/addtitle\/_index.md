---
title: SVGBuilderExtensions.AddTitle
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddTitle method. Adds a title element configuration to the builder. The title element is used to provide a title for SVG content
type: docs
weight: 540
url: /net/aspose.svg.builder/svgbuilderextensions/addtitle/
---
## SVGBuilderExtensions.AddTitle<TBuilder> method

Adds a 'title' element configuration to the builder. The 'title' element is used to provide a title for SVG content.

```csharp
public static TBuilder AddTitle<TBuilder>(this TBuilder builder, 
    Action<SVGTitleElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IDescriptiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'title' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGTitleElementBuilder](../../svgtitleelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDescriptiveElementBuilder](../../idescriptiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
