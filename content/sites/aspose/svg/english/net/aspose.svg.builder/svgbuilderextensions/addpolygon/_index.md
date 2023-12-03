---
title: SVGBuilderExtensions.AddPolygon
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a polygon element configuration to the builder
type: docs
weight: 420
url: /net/aspose.svg.builder/svgbuilderextensions/addpolygon/
---
## SVGBuilderExtensions.AddPolygon&lt;TBuilder&gt; method

Adds a 'polygon' element configuration to the builder.

```csharp
public static TBuilder AddPolygon<TBuilder>(this TBuilder builder, 
    Action<SVGPolygonElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'polygon' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPolygonElementBuilder](../../svgpolygonelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
