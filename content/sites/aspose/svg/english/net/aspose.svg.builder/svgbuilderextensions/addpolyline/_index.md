---
title: SVGBuilderExtensions.AddPolyline
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a polyline element configuration to the builder
type: docs
weight: 430
url: /net/aspose.svg.builder/svgbuilderextensions/addpolyline/
---
## SVGBuilderExtensions.AddPolyline&lt;TBuilder&gt; method

Adds a 'polyline' element configuration to the builder.

```csharp
public static TBuilder AddPolyline<TBuilder>(this TBuilder builder, 
    Action<SVGPolylineElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'polyline' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPolylineElementBuilder](../../svgpolylineelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
