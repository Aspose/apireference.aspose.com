---
title: SVGBuilderExtensions.Width
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Width method. Sets the width attribute for an SVG element
type: docs
weight: 2330
url: /net/aspose.svg.builder/svgbuilderextensions/width/
---
## SVGBuilderExtensions.Width&lt;TBuilder&gt; method

Sets the 'width' attribute for an SVG element.

```csharp
public static TBuilder Width<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IWidthAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The value for the 'width' attribute. |
| type | The type of length measurement (default is pixels). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IWidthAttributeSetter](../../iwidthattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
