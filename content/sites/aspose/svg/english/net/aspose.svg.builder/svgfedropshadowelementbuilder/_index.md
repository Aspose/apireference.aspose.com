---
title: SVGFEDropShadowElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEDropShadowElementBuilder class. Builder class for creating SVG feDropShadow elements used within SVG filters to apply a drop shadow effect
type: docs
weight: 1270
url: /net/aspose.svg.builder/svgfedropshadowelementbuilder/
---
## SVGFEDropShadowElementBuilder class

Builder class for creating SVG 'feDropShadow' elements, used within SVG filters to apply a drop shadow effect.

```csharp
public class SVGFEDropShadowElementBuilder : SVGElementBuilder<SVGFEDropShadowElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEDropShadowElementBuilder](svgfedropshadowelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfedropshadowelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script configuration to the feDropShadow element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGFEDropShadowElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Dx](../../aspose.svg.builder/svgfedropshadowelementbuilder/dx/)(double) | Sets the horizontal offset ('dx') for the drop shadow. |
| [Dy](../../aspose.svg.builder/svgfedropshadowelementbuilder/dy/)(double) | Sets the vertical offset ('dy') for the drop shadow. |
| [StdDeviation](../../aspose.svg.builder/svgfedropshadowelementbuilder/stddeviation/)(double, double?) | Sets the standard deviation for the blur effect in the drop shadow. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEDropShadowElement](../../aspose.svg.filters/svgfedropshadowelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
