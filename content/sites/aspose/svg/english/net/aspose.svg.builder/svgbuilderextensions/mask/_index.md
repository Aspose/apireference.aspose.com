---
title: SVGBuilderExtensions.Mask
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the mask attribute for an SVG element using a custom mask configuration
type: docs
weight: 1150
url: /net/aspose.svg.builder/svgbuilderextensions/mask/
---
## SVGBuilderExtensions.Mask&lt;TBuilder&gt; method

Sets the 'mask' attribute for an SVG element using a custom mask configuration.

```csharp
public static TBuilder Mask<TBuilder>(this TBuilder builder, Action<MaskBuilder> configure)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A delegate to configure the mask. |

### Return Value

The builder instance for chaining.

### See Also

* class [MaskBuilder](../../maskbuilder/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
