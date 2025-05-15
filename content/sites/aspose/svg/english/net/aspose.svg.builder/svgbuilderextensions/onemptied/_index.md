---
title: SVGBuilderExtensions.OnEmptied
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnEmptied method. Sets the onemptied event attribute for handling the emptying of the media elements source
type: docs
weight: 1400
url: /net/aspose.svg.builder/svgbuilderextensions/onemptied/
---
## SVGBuilderExtensions.OnEmptied<TBuilder> method

Sets the 'onemptied' event attribute for handling the emptying of the media element's source.

```csharp
public static TBuilder OnEmptied<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGlobalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when the media element's source is emptied. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGlobalEventAttributeSetter](../../iglobaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
