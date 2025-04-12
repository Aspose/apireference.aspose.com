---
title: SVGBuilderExtensions.Height
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Height method. Sets the height attribute for an SVG element
type: docs
weight: 1000
url: /net/aspose.svg.builder/svgbuilderextensions/height/
---
## SVGBuilderExtensions.Height&lt;TBuilder&gt; method

Sets the 'height' attribute for an SVG element.

```csharp
public static TBuilder Height<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IHeightAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The value for the 'height' attribute. |
| type | The type of length measurement (default is pixels). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IHeightAttributeSetter](../../iheightattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
