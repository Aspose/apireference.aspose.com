---
title: SVGFEComponentTransferElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEComponentTransferElementBuilder class. Builder class for creating SVG feComponentTransfer elements used in SVG filters
type: docs
weight: 1210
url: /net/aspose.svg.builder/svgfecomponenttransferelementbuilder/
---
## SVGFEComponentTransferElementBuilder class

Builder class for creating SVG 'feComponentTransfer' elements, used in SVG filters.

```csharp
public class SVGFEComponentTransferElementBuilder : 
    SVGElementBuilder<SVGFEComponentTransferElement>, ICoreAttributeSetter, 
    IDescriptiveElementBuilder, IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFEComponentTransferElementBuilder](svgfecomponenttransferelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| override [Build](../../aspose.svg.builder/svgfecomponenttransferelementbuilder/build/#build)(*[Document](../../aspose.svg.dom/document/)*) | Builds the SVGFEComponentTransferElement with the configured component transfer functions. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGFEComponentTransferElement](../../aspose.svg.filters/svgfecomponenttransferelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [WithFeFuncA](../../aspose.svg.builder/svgfecomponenttransferelementbuilder/withfefunca/)(*Action&lt;SVGFEFuncAElementBuilder&gt;*) | Configures the 'feFuncA' component transfer function for the alpha channel. |
| [WithFeFuncB](../../aspose.svg.builder/svgfecomponenttransferelementbuilder/withfefuncb/)(*Action&lt;SVGFEFuncBElementBuilder&gt;*) | Configures the 'feFuncB' component transfer function for the blue channel. |
| [WithFeFuncG](../../aspose.svg.builder/svgfecomponenttransferelementbuilder/withfefuncg/)(*Action&lt;SVGFEFuncGElementBuilder&gt;*) | Configures the 'feFuncG' component transfer function for the green channel. |
| [WithFeFuncR](../../aspose.svg.builder/svgfecomponenttransferelementbuilder/withfefuncr/)(*Action&lt;SVGFEFuncRElementBuilder&gt;*) | Configures the 'feFuncR' component transfer function for the red channel. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGFEComponentTransferElement](../../aspose.svg.filters/svgfecomponenttransferelement/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
