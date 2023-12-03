---
title: SVGFEBlendElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEBlendElementBuilder class. Builder class for creating SVG feBlend elements used in SVG filters
type: docs
weight: 780
url: /net/aspose.svg.builder/svgfeblendelementbuilder/
---
## SVGFEBlendElementBuilder class

Builder class for creating SVG 'feBlend' elements, used in SVG filters.

```csharp
public class SVGFEBlendElementBuilder : SVGElementBuilder<SVGFEBlendElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEBlendElementBuilder](svgfeblendelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfeblendelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script configuration to the feBlend element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGFEBlendElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [In2](../../aspose.svg.builder/svgfeblendelementbuilder/in2/#in2)(FilterInput) | Sets the 'in2' attribute of the feBlend element, specifying the second input for the blending operation. |
| [In2](../../aspose.svg.builder/svgfeblendelementbuilder/in2/#in2_1)(string) | Sets the 'in2' attribute of the feBlend element, specifying the second input for the blending operation. |
| [Mode](../../aspose.svg.builder/svgfeblendelementbuilder/mode/)(BlendMode) | Sets the 'mode' attribute of the feBlend element, specifying the blending mode to be used. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEBlendElement](../../aspose.svg.filters/svgfeblendelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
