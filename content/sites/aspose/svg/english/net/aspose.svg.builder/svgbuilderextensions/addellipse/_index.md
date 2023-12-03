---
title: SVGBuilderExtensions.AddEllipse
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an ellipse element configuration to the builder
type: docs
weight: 120
url: /net/aspose.svg.builder/svgbuilderextensions/addellipse/
---
## SVGBuilderExtensions.AddEllipse&lt;TBuilder&gt; method

Adds an 'ellipse' element configuration to the builder.

```csharp
public static TBuilder AddEllipse<TBuilder>(this TBuilder builder, 
    Action<SVGEllipseElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'ellipse' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGEllipseElementBuilder](../../svgellipseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
