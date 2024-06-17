---
title: SVGImageElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGImageElementBuilder class. Builder class for constructing an SVG image element. This element is used to embed images within SVG graphics. It provides methods to set various attributes specific to the image element and to add additional configurations like clip paths masks styles and scripts
type: docs
weight: 1470
url: /net/aspose.svg.builder/svgimageelementbuilder/
---
## SVGImageElementBuilder class

Builder class for constructing an SVG 'image' element. This element is used to embed images within SVG graphics. It provides methods to set various attributes specific to the 'image' element and to add additional configurations like clip paths, masks, styles, and scripts.

```csharp
public class SVGImageElementBuilder : SVGElementBuilder<SVGImageElement>, IAnimationElementBuilder, 
    ICompositeAttributeSetter, IDescriptiveElementBuilder, IPreserveAspectRatioAttributeSetter, 
    IRectAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGImageElementBuilder](svgimageelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddClipPath](../../aspose.svg.builder/svgimageelementbuilder/addclippath/)(Action&lt;SVGClipPathElementBuilder&gt;) | Adds a clip path configuration to the SVG 'image' element. |
| [AddMask](../../aspose.svg.builder/svgimageelementbuilder/addmask/)(Action&lt;SVGMaskElementBuilder&gt;) | Adds a mask configuration to the SVG 'image' element. |
| [AddScript](../../aspose.svg.builder/svgimageelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script configuration to the SVG 'image' element. |
| [AddStyle](../../aspose.svg.builder/svgimageelementbuilder/addstyle/)(Action&lt;SVGStyleElementBuilder&gt;) | Adds a style configuration to the SVG 'image' element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGImageElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Href](../../aspose.svg.builder/svgimageelementbuilder/href/)(string) | Sets the 'href' attribute of the SVG 'image' element, specifying the URL of the image to be embedded. |
| [HrefBase64FromBytes](../../aspose.svg.builder/svgimageelementbuilder/hrefbase64frombytes/)(byte[], string) | Sets the 'href' attribute of the SVG 'image' element using base64 encoded bytes of an image. |
| [HrefBase64FromFile](../../aspose.svg.builder/svgimageelementbuilder/hrefbase64fromfile/#hrefbase64fromfile)(string) | Sets the 'href' attribute of the SVG 'image' element using a base64 encoded image file. |
| [HrefBase64FromFile](../../aspose.svg.builder/svgimageelementbuilder/hrefbase64fromfile/#hrefbase64fromfile_1)(string, string) | Sets the 'href' attribute of the SVG 'image' element using a base64 encoded image file with a specified MIME type. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGImageElement](../../aspose.svg/svgimageelement/)
* interface [IAnimationElementBuilder](../ianimationelementbuilder/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IPreserveAspectRatioAttributeSetter](../ipreserveaspectratioattributesetter/)
* interface [IRectAttributeSetter](../irectattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
