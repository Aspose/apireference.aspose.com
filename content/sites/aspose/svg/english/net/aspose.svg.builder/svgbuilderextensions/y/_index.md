---
title: SVGBuilderExtensions.Y
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Y method. Sets the y attribute for an SVG element
type: docs
weight: 2400
url: /net/aspose.svg.builder/svgbuilderextensions/y/
---
## Y<TBuilder>(*this TBuilder, double, [LengthType](../../lengthtype/)*) {#y_1}

Sets the 'y' attribute for an SVG element.

```csharp
public static TBuilder Y<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IYAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The value for the 'y' attribute. |
| type | The type of length measurement (default is pixels). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IYAttributeSetter](../../iyattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Y<TBuilder>(*this TBuilder, [LengthType](../../lengthtype/), params double[]*) {#y}

Sets the 'y' attribute for positioning the text content along the y-axis.

```csharp
public static TBuilder Y<TBuilder>(this TBuilder builder, LengthType type = LengthType.Px, 
    params double[] values)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| type | The type of length unit for the values. |
| values | The y-axis position values. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'y' attribute, which determines the vertical position(s) of the text element.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
