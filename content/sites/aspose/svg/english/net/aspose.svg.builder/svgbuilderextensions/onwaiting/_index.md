---
title: SVGBuilderExtensions.OnWaiting
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnWaiting method. Sets the onwaiting event attribute for handling events when media playback is delayed due to data buffering
type: docs
weight: 1850
url: /net/aspose.svg.builder/svgbuilderextensions/onwaiting/
---
## SVGBuilderExtensions.OnWaiting<TBuilder> method

Sets the 'onwaiting' event attribute for handling events when media playback is delayed due to data buffering.

```csharp
public static TBuilder OnWaiting<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGlobalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when media playback is delayed for buffering. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGlobalEventAttributeSetter](../../iglobaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
