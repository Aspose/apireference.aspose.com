---
title: SVGBuilderExtensions.AddFeDisplacementMap
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feDisplacementMap element configuration to the builder. This element displaces an image by a specified vector map
type: docs
weight: 190
url: /net/aspose.svg.builder/svgbuilderextensions/addfedisplacementmap/
---
## SVGBuilderExtensions.AddFeDisplacementMap&lt;TBuilder&gt; method

Adds an 'feDisplacementMap' element configuration to the builder. This element displaces an image by a specified vector map.

```csharp
public static TBuilder AddFeDisplacementMap<TBuilder>(this TBuilder builder, 
    Action<SVGFEDisplacementMapElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feDisplacementMap' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEDisplacementMapElementBuilder](../../svgfedisplacementmapelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
