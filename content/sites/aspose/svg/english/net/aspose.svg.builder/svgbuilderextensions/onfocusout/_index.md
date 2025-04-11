---
title: SVGBuilderExtensions.OnFocusOut
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnFocusOut method. Sets the onfocusout event attribute for handling focus-out events on the element
type: docs
weight: 1460
url: /net/aspose.svg.builder/svgbuilderextensions/onfocusout/
---
## SVGBuilderExtensions.OnFocusOut&lt;TBuilder&gt; method

Sets the 'onfocusout' event attribute for handling focus-out events on the element.

```csharp
public static TBuilder OnFocusOut<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGraphicalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when the element loses focus, typically before the 'onblur' event. |

### Return Value

The builder instance for chaining.

## Remarks

The 'onfocusout' event is triggered when an element is about to lose focus. Similar to 'onfocusin', this event supports bubbling and can be used to detect focus changes on child elements as well.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGraphicalEventAttributeSetter](../../igraphicaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
