---
title: SVGBuilderExtensions.StrokeDashoffset
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the stroke-dashoffset attribute for an SVG element defining the offset for the start of the stroke dash array
type: docs
weight: 2100
url: /net/aspose.svg.builder/svgbuilderextensions/strokedashoffset/
---
## SVGBuilderExtensions.StrokeDashoffset&lt;TBuilder&gt; method

Sets the 'stroke-dashoffset' attribute for an SVG element, defining the offset for the start of the stroke dash array.

```csharp
public static TBuilder StrokeDashoffset<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The dash offset value. |
| type | The unit type for the offset value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
