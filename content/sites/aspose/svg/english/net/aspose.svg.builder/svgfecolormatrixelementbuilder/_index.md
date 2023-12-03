---
title: SVGFEColorMatrixElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEColorMatrixElementBuilder class. Builder class for creating SVG feColorMatrix elements used in SVG filters
type: docs
weight: 790
url: /net/aspose.svg.builder/svgfecolormatrixelementbuilder/
---
## SVGFEColorMatrixElementBuilder class

Builder class for creating SVG 'feColorMatrix' elements, used in SVG filters.

```csharp
public class SVGFEColorMatrixElementBuilder : SVGElementBuilder<SVGFEColorMatrixElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEColorMatrixElementBuilder](svgfecolormatrixelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfecolormatrixelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script configuration to the feColorMatrix element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGFEColorMatrixElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [TypeAndValues](../../aspose.svg.builder/svgfecolormatrixelementbuilder/typeandvalues/)(ColorMatrixOperation, params double[]) | Sets the 'type' and 'values' attributes of the feColorMatrix element, specifying the color matrix operation and its parameters. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEColorMatrixElement](../../aspose.svg.filters/svgfecolormatrixelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
