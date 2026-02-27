---
title: SVGFilterElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFilterElementBuilder class. Builder class for creating SVG filter elements which define filter effects that can be applied to SVG graphics
type: docs
weight: 1440
url: /net/aspose.svg.builder/svgfilterelementbuilder/
---
## SVGFilterElementBuilder class

Builder class for creating SVG 'filter' elements, which define filter effects that can be applied to SVG graphics.

```csharp
public class SVGFilterElementBuilder : SVGElementBuilder<SVGFilterElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IDocumentElementEventAttributeSetter, IFilterPrimitiveElementBuilder, 
    IGlobalEventAttributeSetter, IPresentationAttributeSetter, IRectAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFilterElementBuilder](svgfilterelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfilterelementbuilder/addscript/)(*Action&lt;SVGScriptElementBuilder&gt;*) | Adds a script configuration to the filter element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGFilterElement](../../aspose.svg/svgfilterelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [FilterUnits](../../aspose.svg.builder/svgfilterelementbuilder/filterunits/)(*[CoordinateUnits](../coordinateunits/)*) | Sets the coordinate system for the filter's x, y, width, and height attributes. |
| [PrimitiveUnits](../../aspose.svg.builder/svgfilterelementbuilder/primitiveunits/)(*[CoordinateUnits](../coordinateunits/)*) | Sets the coordinate system for the filter's primitive sub-elements. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFilterElement](../../aspose.svg/svgfilterelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IFilterPrimitiveElementBuilder](../ifilterprimitiveelementbuilder/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* interface [IRectAttributeSetter](../irectattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
