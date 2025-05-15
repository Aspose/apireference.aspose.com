---
title: SVGFEImageElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEImageElementBuilder class. Builder class for creating SVG feImage elements which define an image to be used by other filter primitives
type: docs
weight: 1340
url: /net/aspose.svg.builder/svgfeimageelementbuilder/
---
## SVGFEImageElementBuilder class

Builder class for creating SVG 'feImage' elements, which define an image to be used by other filter primitives.

```csharp
public class SVGFEImageElementBuilder : SVGElementBuilder<SVGFEImageElement>, 
    IAnimationElementBuilder, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveAttributeSetter, IPresentationAttributeSetter, 
    IPreserveAspectRatioAttributeSetter, IXLinkAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEImageElementBuilder](svgfeimageelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddAnimateTransform](../../aspose.svg.builder/svgfeimageelementbuilder/addanimatetransform/)(*Action&lt;SVGAnimateTransformElementBuilder&gt;*) | Adds an animate transform configuration to the feImage element. |
| [AddScript](../../aspose.svg.builder/svgfeimageelementbuilder/addscript/)(*Action&lt;SVGScriptElementBuilder&gt;*) | Adds a script configuration to the feImage element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGFEImageElement](../../aspose.svg.filters/svgfeimageelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [Href](../../aspose.svg.builder/svgfeimageelementbuilder/href/)(*string*) | Sets the 'href' attribute of the feImage element, defining the URL of the image to be used. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEImageElement](../../aspose.svg.filters/svgfeimageelement/)
* interface [IAnimationElementBuilder](../ianimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveAttributeSetter](../ifilterprimitiveattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* interface [IPreserveAspectRatioAttributeSetter](../ipreserveaspectratioattributesetter/)
* interface [IXLinkAttributeSetter](../ixlinkattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
