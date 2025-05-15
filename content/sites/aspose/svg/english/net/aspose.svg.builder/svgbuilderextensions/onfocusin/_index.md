---
title: SVGBuilderExtensions.OnFocusIn
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnFocusIn method. Sets the onfocusin event attribute for handling focus-in events on the element
type: docs
weight: 1450
url: /net/aspose.svg.builder/svgbuilderextensions/onfocusin/
---
## SVGBuilderExtensions.OnFocusIn<TBuilder> method

Sets the 'onfocusin' event attribute for handling focus-in events on the element.

```csharp
public static TBuilder OnFocusIn<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGraphicalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when the element receives focus, typically before the 'onfocus' event. |

### Return Value

The builder instance for chaining.

## Remarks

The 'onfocusin' event is triggered when an element is about to receive focus. This event differs from 'onfocus' in that it supports bubbling and can be used to detect focus changes on child elements as well.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGraphicalEventAttributeSetter](../../igraphicaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
