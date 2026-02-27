---
title: SVGFEMorphologyElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEMorphologyElementBuilder class. Builder class for creating SVG feMorphology elements which are used to apply morphological operations like dilation or erosion on an input image
type: docs
weight: 1370
url: /net/aspose.svg.builder/svgfemorphologyelementbuilder/
---
## SVGFEMorphologyElementBuilder class

Builder class for creating SVG 'feMorphology' elements, which are used to apply morphological operations like dilation or erosion on an input image.

```csharp
public class SVGFEMorphologyElementBuilder : SVGElementBuilder<SVGFEMorphologyElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEMorphologyElementBuilder](svgfemorphologyelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfemorphologyelementbuilder/addscript/)(*Action&lt;SVGScriptElementBuilder&gt;*) | Adds a script configuration to the feMorphology element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGFEMorphologyElement](../../aspose.svg.filters/svgfemorphologyelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [Operator](../../aspose.svg.builder/svgfemorphologyelementbuilder/operator/)(*[MorphologyOperator](../morphologyoperator/)*) | Sets the 'operator' attribute of the feMorphology element, specifying the type of morphological operation. |
| [Radius](../../aspose.svg.builder/svgfemorphologyelementbuilder/radius/)(*double, double?*) | Sets the 'radius' attribute of the feMorphology element, defining the radius for the morphological operation. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEMorphologyElement](../../aspose.svg.filters/svgfemorphologyelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
