---
title: SVGBuilderExtensions.To
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions To method. Sets the to attribute defining the ending value of the animation with a specified length type
type: docs
weight: 2250
url: /net/aspose.svg.builder/svgbuilderextensions/to/
---
## SVGBuilderExtensions.To&lt;TBuilder&gt; method

Sets the 'to' attribute, defining the ending value of the animation with a specified length type.

```csharp
public static TBuilder To<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IAnimationValueAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The ending value for the animation. |
| type | The length type for the 'to' value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationValueAttributeSetter](../../ianimationvalueattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
