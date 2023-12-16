---
title: SVGAElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGAElementBuilder class. Builder class for constructing an SVG a element which is used to define hyperlinks. It enables the building of content within a element and provides methods to set various attributes specific to the a element in SVG
type: docs
weight: 1630
url: /net/aspose.svg.builder/svgaelementbuilder/
---
## SVGAElementBuilder class

Builder class for constructing an SVG 'a' element, which is used to define hyperlinks. It enables the building of content within 'a' element and provides methods to set various attributes specific to the 'a' element in SVG.

```csharp
public class SVGAElementBuilder : SVGElementBuilder<SVGAElement>, ICompositeAttributeSetter, 
    ICompositeElementBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGAElementBuilder](svgaelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGAElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Download](../../aspose.svg.builder/svgaelementbuilder/download/)(string) | Sets the 'download' attribute of the SVG 'a' element, indicating that the link is to be downloaded when activated. |
| [Href](../../aspose.svg.builder/svgaelementbuilder/href/)(string) | Sets the 'href' attribute of the SVG 'a' element, specifying the URL of the linked resource. |
| [HrefLang](../../aspose.svg.builder/svgaelementbuilder/hreflang/)(string) | Sets the 'hreflang' attribute of the SVG 'a' element, indicating the language of the linked resource. |
| [Ping](../../aspose.svg.builder/svgaelementbuilder/ping/)(string) | Sets the 'ping' attribute of the SVG 'a' element, containing a list of URLs to be notified if the link is followed. |
| [ReferrerPolicy](../../aspose.svg.builder/svgaelementbuilder/referrerpolicy/)(ReferrerPolicy) | Sets the 'referrerPolicy' attribute of the SVG 'a' element, specifying how much of the referrer to send along with requests. |
| [Rel](../../aspose.svg.builder/svgaelementbuilder/rel/)(string) | Sets the 'rel' attribute of the SVG 'a' element, specifying the relationship of the target object to the link object. |
| [SetTarget](../../aspose.svg.builder/svgaelementbuilder/settarget/)(string) | Sets the 'target' attribute of the SVG 'a' element to a custom XML name. |
| [Type](../../aspose.svg.builder/svgaelementbuilder/type/)(string) | Sets the 'type' attribute of the SVG 'a' element, specifying the media type of the linked resource. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGAElement](../../aspose.svg/svgaelement/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [ICompositeElementBuilder](../icompositeelementbuilder/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
