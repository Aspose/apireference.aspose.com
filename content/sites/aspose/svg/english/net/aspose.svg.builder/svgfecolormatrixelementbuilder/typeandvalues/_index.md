---
title: SVGFEColorMatrixElementBuilder.TypeAndValues
second_title: Aspose.SVG for .NET API Reference
description: SVGFEColorMatrixElementBuilder method. Sets the type and values attributes of the feColorMatrix element specifying the color matrix operation and its parameters
type: docs
weight: 30
url: /net/aspose.svg.builder/svgfecolormatrixelementbuilder/typeandvalues/
---
## SVGFEColorMatrixElementBuilder.TypeAndValues method

Sets the 'type' and 'values' attributes of the feColorMatrix element, specifying the color matrix operation and its parameters.

```csharp
public SVGFEColorMatrixElementBuilder TypeAndValues(ColorMatrixOperation type, 
    params double[] values)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | ColorMatrixOperation | The ColorMatrixOperation enum value representing the type of color matrix operation. |
| values | Double[] | The parameters for the color matrix operation. |

### Return Value

The current builder instance.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Thrown when the provided values do not match the requirements of the specified type. |
| NotSupportedException | Thrown when an unsupported matrix operation type is provided. |

### See Also

* enum [ColorMatrixOperation](../../colormatrixoperation/)
* class [SVGFEColorMatrixElementBuilder](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
