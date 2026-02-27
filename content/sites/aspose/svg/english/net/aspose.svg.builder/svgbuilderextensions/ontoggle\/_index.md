---
title: SVGBuilderExtensions.OnToggle
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnToggle method. Sets the ontoggle event attribute for handling events when the user toggles a control like a details element
type: docs
weight: 1820
url: /net/aspose.svg.builder/svgbuilderextensions/ontoggle/
---
## SVGBuilderExtensions.OnToggle<TBuilder> method

Sets the 'ontoggle' event attribute for handling events when the user toggles a control, like a `details` element.

```csharp
public static TBuilder OnToggle<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGlobalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when a control is toggled. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGlobalEventAttributeSetter](../../iglobaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
