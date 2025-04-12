---
title: SVGSVGElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGSVGElementBuilder class. Builder class for creating an SVGSVGElement the root element of an SVG document
type: docs
weight: 1590
url: /net/aspose.svg.builder/svgsvgelementbuilder/
---
## SVGSVGElementBuilder class

Builder class for creating an SVGSVGElement, the root element of an SVG document.

```csharp
public class SVGSVGElementBuilder : SVGElementBuilder<SVGSVGElement>, ICompositeAttributeSetter, 
    ICompositeElementBuilder, IDocumentEventAttributeSetter, IPreserveAspectRatioAttributeSetter, 
    IRectAttributeSetter, IViewBoxAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGSVGElementBuilder](svgsvgelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| [BaseProfile](../../aspose.svg.builder/svgsvgelementbuilder/baseprofile/)(*double*) | Sets the 'baseProfile' attribute of the SVG element. This attribute indicates which subset of the full SVG specification applies to the document. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGSVGElement](../../aspose.svg/svgsvgelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [ContentScriptType](../../aspose.svg.builder/svgsvgelementbuilder/contentscripttype/)(*string*) | Sets the 'contentScriptType' attribute of the SVG element. This attribute specifies the default scripting language for the contents of the SVG document. |
| [ContentStyleType](../../aspose.svg.builder/svgsvgelementbuilder/contentstyletype/)(*string*) | Sets the 'contentStyleType' attribute of the SVG element. This attribute specifies the default styling language for the contents of the SVG document. |
| [Version](../../aspose.svg.builder/svgsvgelementbuilder/version/)(*double*) | Sets the 'version' attribute of the SVG element. This attribute specifies the SVG specification version that the document conforms to. |
| [WithXlink](../../aspose.svg.builder/svgsvgelementbuilder/withxlink/)() | Adds the XLink namespace declaration to the SVG element. This is necessary for using XLink attributes such as 'xlink:href'. |
| [ZoomAndPan](../../aspose.svg.builder/svgsvgelementbuilder/zoomandpan/)(*string*) | Sets the 'zoomAndPan' attribute of the SVG element. This attribute controls whether the SVG content can be zoomed and panned. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGSVGElement](../../aspose.svg/svgsvgelement/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [ICompositeElementBuilder](../icompositeelementbuilder/)
* interface [IDocumentEventAttributeSetter](../idocumenteventattributesetter/)
* interface [IPreserveAspectRatioAttributeSetter](../ipreserveaspectratioattributesetter/)
* interface [IRectAttributeSetter](../irectattributesetter/)
* interface [IViewBoxAttributeSetter](../iviewboxattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
