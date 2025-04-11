---
title: SVGBuilderExtensions.StrokeWidth
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions StrokeWidth method. Sets the stroke-width attribute for an SVG element defining the width of the stroke
type: docs
weight: 2150
url: /net/aspose.svg.builder/svgbuilderextensions/strokewidth/
---
## SVGBuilderExtensions.StrokeWidth&lt;TBuilder&gt; method

Sets the 'stroke-width' attribute for an SVG element, defining the width of the stroke.

```csharp
public static TBuilder StrokeWidth<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The stroke width value. |
| type | The unit type for the stroke width. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
