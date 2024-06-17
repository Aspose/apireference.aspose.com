---
title: SVGRadialGradientElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGRadialGradientElementBuilder class. Builder class for constructing an SVG radialGradient element which is used to define a radial gradient within SVG graphics. This class enables the building of content within the radialGradient element and provides methods to set various attributes specific to the radialGradient element in SVG
type: docs
weight: 1570
url: /net/aspose.svg.builder/svgradialgradientelementbuilder/
---
## SVGRadialGradientElementBuilder class

Builder class for constructing an SVG 'radialGradient' element, which is used to define a radial gradient within SVG graphics. This class enables the building of content within the 'radialGradient' element and provides methods to set various attributes specific to the 'radialGradient' element in SVG.

```csharp
public class SVGRadialGradientElementBuilder : SVGElementBuilder<SVGRadialGradientElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IDocumentElementEventAttributeSetter, IGlobalEventAttributeSetter, IGradientStopElementBuilder, 
    IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGRadialGradientElementBuilder](svgradialgradientelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddAnimateTransform](../../aspose.svg.builder/svgradialgradientelementbuilder/addanimatetransform/)(Action&lt;SVGAnimateTransformElementBuilder&gt;) | Adds an animate transform configuration to the SVG 'radialGradient' element. |
| [AddScript](../../aspose.svg.builder/svgradialgradientelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script configuration to the SVG 'radialGradient' element. |
| [AddStyle](../../aspose.svg.builder/svgradialgradientelementbuilder/addstyle/)(Action&lt;SVGStyleElementBuilder&gt;) | Adds a style configuration to the SVG 'radialGradient' element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGRadialGradientElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Cx](../../aspose.svg.builder/svgradialgradientelementbuilder/cx/)(double, LengthType) | Sets the 'cx' attribute of the SVG 'radialGradient' element, specifying the x-coordinate of the center of the gradient. |
| [Cy](../../aspose.svg.builder/svgradialgradientelementbuilder/cy/)(double, LengthType) | Sets the 'cy' attribute of the SVG 'radialGradient' element, specifying the y-coordinate of the center of the gradient. |
| [Fx](../../aspose.svg.builder/svgradialgradientelementbuilder/fx/)(double, LengthType) | Sets the 'fx' attribute of the SVG 'radialGradient' element, specifying the x-coordinate of the focal point of the gradient. |
| [Fy](../../aspose.svg.builder/svgradialgradientelementbuilder/fy/)(double, LengthType) | Sets the 'fy' attribute of the SVG 'radialGradient' element, specifying the y-coordinate of the focal point of the gradient. |
| [Href](../../aspose.svg.builder/svgradialgradientelementbuilder/href/)(string) | Sets the 'href' attribute of the SVG 'radialGradient' element, specifying a reference to another gradient. |
| [R](../../aspose.svg.builder/svgradialgradientelementbuilder/r/)(double, LengthType) | Sets the 'r' attribute of the SVG 'radialGradient' element, specifying the radius of the gradient. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGRadialGradientElement](../../aspose.svg/svgradialgradientelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IGradientStopElementBuilder](../igradientstopelementbuilder/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
