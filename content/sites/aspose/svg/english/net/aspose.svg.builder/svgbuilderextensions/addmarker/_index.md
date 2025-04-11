---
title: SVGBuilderExtensions.AddMarker
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddMarker method. Adds a marker element configuration to the builder
type: docs
weight: 370
url: /net/aspose.svg.builder/svgbuilderextensions/addmarker/
---
## SVGBuilderExtensions.AddMarker&lt;TBuilder&gt; method

Adds a 'marker' element configuration to the builder.

```csharp
public static TBuilder AddMarker<TBuilder>(this TBuilder builder, 
    Action<SVGMarkerElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeContentElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'marker' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGMarkerElementBuilder](../../svgmarkerelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeContentElementBuilder](../../ishapecontentelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
