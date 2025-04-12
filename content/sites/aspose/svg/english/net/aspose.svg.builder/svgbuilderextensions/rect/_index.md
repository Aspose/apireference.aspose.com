---
title: SVGBuilderExtensions.Rect
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Rect method. Sets the x y width and height attributes for an SVG element to define a rectangle
type: docs
weight: 1920
url: /net/aspose.svg.builder/svgbuilderextensions/rect/
---
## SVGBuilderExtensions.Rect&lt;TBuilder&gt; method

Sets the 'x', 'y', 'width', and 'height' attributes for an SVG element to define a rectangle.

```csharp
public static TBuilder Rect<TBuilder>(this TBuilder builder, double x, double y, double width, 
    double height, LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IRectAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| x | The x-coordinate of the rectangle. |
| y | The y-coordinate of the rectangle. |
| width | The width of the rectangle. |
| height | The height of the rectangle. |
| type | The type of length measurement for all dimensions (default is pixels). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IRectAttributeSetter](../../irectattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
