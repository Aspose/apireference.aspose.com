---
title: SVGStyleElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGStyleElementBuilder class. A builder class for constructing an SVG style element. This class facilitates the creation and configuration of an SVG style element with CSS rules
type: docs
weight: 1900
url: /net/aspose.svg.builder/svgstyleelementbuilder/
---
## SVGStyleElementBuilder class

A builder class for constructing an SVG 'style' element. This class facilitates the creation and configuration of an SVG style element with CSS rules.

```csharp
public class SVGStyleElementBuilder : SVGElementBuilder<SVGStyleElement>, ICoreAttributeSetter, 
    IDocumentElementEventAttributeSetter, IGlobalEventAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGStyleElementBuilder](svgstyleelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddComment](../../aspose.svg.builder/svgstyleelementbuilder/addcomment/)(string) | Adds a comment to the style content. |
| [AddRule](../../aspose.svg.builder/svgstyleelementbuilder/addrule/#addrule)(string, Action&lt;RuleBuilder&gt;) | Adds a CSS rule to the style element using a RuleBuilder. |
| [AddRule](../../aspose.svg.builder/svgstyleelementbuilder/addrule/#addrule_1)(string, string) | Adds a CSS rule to the style element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| override [Build](../../aspose.svg.builder/svgstyleelementbuilder/build/#build)(Document) | Builds the SVG style element with the accumulated CSS rules and adds it to the specified document. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGStyleElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Media](../../aspose.svg.builder/svgstyleelementbuilder/media/)(string) | Sets the 'media' attribute of the SVG 'style' element. This attribute specifies the media for which the styles are intended, allowing the styles to be conditional on the media type. |
| [Title](../../aspose.svg.builder/svgstyleelementbuilder/title/)(string) | Sets the 'title' attribute of the SVG 'style' element. This attribute provides an advisory title for the style element, which can be useful for accessibility and tool-tip text. |
| [Type](../../aspose.svg.builder/svgstyleelementbuilder/type/)(string) | Sets the 'type' attribute of the SVG 'style' element. This attribute specifies the style sheet language of the element's contents. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGStyleElement](../../aspose.svg/svgstyleelement/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
