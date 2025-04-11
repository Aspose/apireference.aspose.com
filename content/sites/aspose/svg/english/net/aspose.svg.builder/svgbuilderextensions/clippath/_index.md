---
title: SVGBuilderExtensions.ClipPath
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions ClipPath method. Sets the clip-path attribute for an SVG element
type: docs
weight: 650
url: /net/aspose.svg.builder/svgbuilderextensions/clippath/
---
## SVGBuilderExtensions.ClipPath&lt;TBuilder&gt; method

Sets the 'clip-path' attribute for an SVG element.

```csharp
public static TBuilder ClipPath<TBuilder>(this TBuilder builder, Action<ClipPathBuilder> configure)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A delegate to configure the clip path. |

### Return Value

The builder instance for chaining.

### See Also

* class [ClipPathBuilder](../../clippathbuilder/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
