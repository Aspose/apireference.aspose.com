---
title: SVGBuilderExtensions.From
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions From method. Sets the from attribute defining the starting value of the animation with a specified length type
type: docs
weight: 960
url: /net/aspose.svg.builder/svgbuilderextensions/from/
---
## SVGBuilderExtensions.From<TBuilder> method

Sets the 'from' attribute, defining the starting value of the animation with a specified length type.

```csharp
public static TBuilder From<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IAnimationValueAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The starting value for the animation. |
| type | The length type for the 'from' value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationValueAttributeSetter](../../ianimationvalueattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
