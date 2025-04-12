---
title: SVGBuilderExtensions.AddMetadata
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddMetadata method. Adds a metadata element configuration to the builder. The metadata element is used to add metadata to SVG content
type: docs
weight: 390
url: /net/aspose.svg.builder/svgbuilderextensions/addmetadata/
---
## SVGBuilderExtensions.AddMetadata&lt;TBuilder,TElement&gt; method

Adds a 'metadata' element configuration to the builder. The 'metadata' element is used to add metadata to SVG content.

```csharp
public static TBuilder AddMetadata<TBuilder, TElement>(this TBuilder builder, 
    Action<SVGMetadataElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IDescriptiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| TElement | The type representing the 'metadata' element in the SVG model. |
| builder | The builder instance. |
| configure | The configuration action for the 'metadata' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGMetadataElementBuilder](../../svgmetadataelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDescriptiveElementBuilder](../../idescriptiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
