---
title: SVGLinearGradientElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGLinearGradientElementBuilder class. Builder class for constructing an SVG linearGradient element which is used to define a linear gradient within SVG graphics. It enables the building of content within the linearGradient element and provides methods to set various attributes specific to the linearGradient element in SVG
type: docs
weight: 1490
url: /net/aspose.svg.builder/svglineargradientelementbuilder/
---
## SVGLinearGradientElementBuilder class

Builder class for constructing an SVG 'linearGradient' element, which is used to define a linear gradient within SVG graphics. It enables the building of content within the 'linearGradient' element and provides methods to set various attributes specific to the 'linearGradient' element in SVG.

```csharp
public class SVGLinearGradientElementBuilder : SVGElementBuilder<SVGLinearGradientElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IDocumentElementEventAttributeSetter, IGlobalEventAttributeSetter, IGradientStopElementBuilder, 
    IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGLinearGradientElementBuilder](svglineargradientelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddAnimateTransform](../../aspose.svg.builder/svglineargradientelementbuilder/addanimatetransform/)(*Action&amp;lt;SVGAnimateTransformElementBuilder&amp;gt;*) | Adds an animate transform configuration to the SVG 'linearGradient' element. |
| [AddScript](../../aspose.svg.builder/svglineargradientelementbuilder/addscript/)(*Action&amp;lt;SVGScriptElementBuilder&amp;gt;*) | Adds a script configuration to the SVG 'linearGradient' element. |
| [AddStyle](../../aspose.svg.builder/svglineargradientelementbuilder/addstyle/)(*Action&amp;lt;SVGStyleElementBuilder&amp;gt;*) | Adds a style configuration to the SVG 'linearGradient' element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGLinearGradientElement](../../aspose.svg/svglineargradientelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [Href](../../aspose.svg.builder/svglineargradientelementbuilder/href/)(*string*) | Sets the 'href' attribute of the SVG 'linearGradient' element, specifying a reference to another gradient. |
| [X1](../../aspose.svg.builder/svglineargradientelementbuilder/x1/)(*double, [LengthType](../lengthtype/)*) | Sets the 'x1' attribute of the SVG 'linearGradient' element, specifying the x-coordinate of the start point of the gradient. |
| [X2](../../aspose.svg.builder/svglineargradientelementbuilder/x2/)(*double, [LengthType](../lengthtype/)*) | Sets the 'x2' attribute of the SVG 'linearGradient' element, specifying the x-coordinate of the end point of the gradient. |
| [Y1](../../aspose.svg.builder/svglineargradientelementbuilder/y1/)(*double, [LengthType](../lengthtype/)*) | Sets the 'y1' attribute of the SVG 'linearGradient' element, specifying the y-coordinate of the start point of the gradient. |
| [Y2](../../aspose.svg.builder/svglineargradientelementbuilder/y2/)(*double, [LengthType](../lengthtype/)*) | Sets the 'y2' attribute of the SVG 'linearGradient' element, specifying the y-coordinate of the end point of the gradient. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGLinearGradientElement](../../aspose.svg/svglineargradientelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IGradientStopElementBuilder](../igradientstopelementbuilder/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
