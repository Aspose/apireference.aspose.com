---
title: SVGBuilderExtensions.Filter
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Filter method. Sets the filter attribute for an SVG element using a custom configuration
type: docs
weight: 840
url: /net/aspose.svg.builder/svgbuilderextensions/filter/
---
## SVGBuilderExtensions.Filter&lt;TBuilder&gt; method

Sets the 'filter' attribute for an SVG element using a custom configuration.

```csharp
public static TBuilder Filter<TBuilder>(this TBuilder builder, 
    Action<FilterValueListBuilder> configure)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A delegate to configure the FilterValueListBuilder. |

### Return Value

The builder instance for chaining.

### See Also

* class [FilterValueListBuilder](../../filtervaluelistbuilder/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
