---
title: SVGBuilderExtensions.BaselineShift
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the baseline-shift attribute for an SVG element using a predefined value
type: docs
weight: 600
url: /net/aspose.svg.builder/svgbuilderextensions/baselineshift/
---
## BaselineShift&lt;TBuilder&gt;(this TBuilder, BaseLineShift) {#baselineshift}

Sets the 'baseline-shift' attribute for an SVG element using a predefined value.

```csharp
public static TBuilder BaselineShift<TBuilder>(this TBuilder builder, BaseLineShift value)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The baseline shift value to set. |

### Return Value

The builder instance for chaining.

### See Also

* enum [BaseLineShift](../../baselineshift/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## BaselineShift&lt;TBuilder&gt;(this TBuilder, double, LengthType) {#baselineshift_1}

Sets the 'baseline-shift' attribute for an SVG element using a numeric value.

```csharp
public static TBuilder BaselineShift<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The numeric value for baseline shift. |
| type | The type of length unit. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
