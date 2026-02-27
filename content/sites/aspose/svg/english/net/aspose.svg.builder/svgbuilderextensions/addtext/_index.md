---
title: SVGBuilderExtensions.AddText
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddText method. Adds a text element configuration to the builder
type: docs
weight: 530
url: /net/aspose.svg.builder/svgbuilderextensions/addtext/
---
## AddText<TBuilder>(*this TBuilder, Action&lt;SVGTextElementBuilder&gt;*) {#addtext}

Adds a 'text' element configuration to the builder.

```csharp
public static TBuilder AddText<TBuilder>(this TBuilder builder, 
    Action<SVGTextElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'text' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGTextElementBuilder](../../svgtextelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddText<TBuilder>(*this TBuilder, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, FontStyle?, string, FontWeight?, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGTextElementBuilder&gt;*) {#addtext_1}

Adds a 'text' element with specified content and attributes to the SVG builder.

```csharp
public static TBuilder AddText<TBuilder>(this TBuilder builder, string content, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> fontSize = null, FontStyle? fontStyle = default, 
    string fontFamily = null, FontWeight? fontWeight = default, 
    OneOf<Color, Paint, string> fill = null, OneOf<Color, Paint, string> stroke = null, 
    string id = null, Action<SVGTextElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, allowing for chaining. |
| builder | The builder instance to which the 'text' element will be added. |
| content | The text content to be displayed within the 'text' element. |
| x | The x-coordinate for the text element. Can be a double value or a tuple of double and LengthType. |
| y | The y-coordinate for the text element. Can be a double value or a tuple of double and LengthType. |
| fontSize | The font size for the text. Can be a double value or a tuple of double and LengthType. |
| fontStyle | The font style for the text (e.g., normal, italic, oblique). |
| fontFamily | The font family for the text (e.g., Arial, Verdana). |
| fontWeight | The weight (thickness) of the font (e.g., normal, bold). |
| fill | The fill color or paint style for the text. Can be a Color or a Paint enum value or paint server ID. |
| stroke | The stroke color or paint style for the text. Can be a Color or a Paint enum value or paint server ID. |
| id | The unique identifier for the text element. |
| extend | An optional action to further configure the text element builder. |

### Return Value

The builder instance for chaining further additions or configurations.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* enum [FontStyle](../../fontstyle/)
* enum [FontWeight](../../fontweight/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGTextElementBuilder](../../svgtextelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
