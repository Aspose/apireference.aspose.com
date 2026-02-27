---
title: SVGBuilderExtensions.By
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions By method. Sets the by attribute defining the relative offset value for the animation with a specified length type
type: docs
weight: 620
url: /net/aspose.svg.builder/svgbuilderextensions/by/
---
## SVGBuilderExtensions.By<TBuilder> method

Sets the 'by' attribute, defining the relative offset value for the animation with a specified length type.

```csharp
public static TBuilder By<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IAnimationValueAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The relative offset value for the animation. |
| type | The length type for the 'by' value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationValueAttributeSetter](../../ianimationvalueattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
