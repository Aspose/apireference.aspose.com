---
title: SVGBuilderExtensions.SetPreserveAspectRatio
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the preserveAspectRatio attribute for an SVG element
type: docs
weight: 2020
url: /net/aspose.svg.builder/svgbuilderextensions/setpreserveaspectratio/
---
## SVGBuilderExtensions.SetPreserveAspectRatio&lt;TBuilder&gt; method

Sets the 'preserveAspectRatio' attribute for an SVG element.

```csharp
public static TBuilder SetPreserveAspectRatio<TBuilder>(this TBuilder builder, 
    AspectRatioAlign align, AspectRatioScaling meetOrSlice = AspectRatioScaling.Meet)
    where TBuilder : ISVGElementBuilder, IPreserveAspectRatioAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| align | The alignment setting for the aspect ratio. |
| meetOrSlice | Specifies how an aspect ratio is preserved (default is 'Meet'). |

### Return Value

The builder instance for chaining.

### See Also

* enum [AspectRatioAlign](../../aspectratioalign/)
* enum [AspectRatioScaling](../../aspectratioscaling/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPreserveAspectRatioAttributeSetter](../../ipreserveaspectratioattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
