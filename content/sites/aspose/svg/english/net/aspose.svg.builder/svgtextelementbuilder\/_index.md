---
title: SVGTextElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGTextElementBuilder class. Builder class for creating an SVGTextElement which is used to define text in an SVG document
type: docs
weight: 1670
url: /net/aspose.svg.builder/svgtextelementbuilder/
---
## SVGTextElementBuilder class

Builder class for creating an SVGTextElement, which is used to define text in an SVG document.

```csharp
public class SVGTextElementBuilder : SVGElementBuilder<SVGTextElement>, IAnimationElementBuilder, 
    ICompositeAttributeSetter, IDescriptiveElementBuilder, IPaintServerElementBuilder, 
    IShapeContentElementBuilder, ITextContentPositioningAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGTextElementBuilder](svgtextelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddA](../../aspose.svg.builder/svgtextelementbuilder/adda/)(*Action&lt;SVGAElementBuilder&gt;*) | Adds an 'a' (anchor) element to the text element, enabling hyperlinking parts of the text. |
| [AddTextPath](../../aspose.svg.builder/svgtextelementbuilder/addtextpath/)(*Action&lt;SVGTextPathElementBuilder&gt;*) | Adds a 'textPath' element to the text element, allowing the text to follow a defined path. |
| [AddTSpan](../../aspose.svg.builder/svgtextelementbuilder/addtspan/)(*Action&lt;SVGTSpanElementBuilder&gt;*) | Adds a 'tspan' element to the text element, allowing for fine control over individual sections of the text. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGTextElement](../../aspose.svg/svgtextelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGTextElement](../../aspose.svg/svgtextelement/)
* interface [IAnimationElementBuilder](../ianimationelementbuilder/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IPaintServerElementBuilder](../ipaintserverelementbuilder/)
* interface [IShapeContentElementBuilder](../ishapecontentelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../itextcontentpositioningattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
