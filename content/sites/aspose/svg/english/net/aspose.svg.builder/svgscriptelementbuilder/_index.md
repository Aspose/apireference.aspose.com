---
title: SVGScriptElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGScriptElementBuilder class. Builder class for constructing an SVG script element. The script element is used to embed or reference executable scripts within SVG documents. This class provides methods to set various attributes specific to the script element such as type source and cross-origin settings
type: docs
weight: 1600
url: /net/aspose.svg.builder/svgscriptelementbuilder/
---
## SVGScriptElementBuilder class

Builder class for constructing an SVG 'script' element. The 'script' element is used to embed or reference executable scripts within SVG documents. This class provides methods to set various attributes specific to the 'script' element, such as type, source, and cross-origin settings.

```csharp
public class SVGScriptElementBuilder : SVGElementBuilder<SVGScriptElement>, ICoreAttributeSetter, 
    IDocumentElementEventAttributeSetter, IGlobalEventAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGScriptElementBuilder](svgscriptelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGScriptElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Crossorigin](../../aspose.svg.builder/svgscriptelementbuilder/crossorigin/)(string) | Sets the 'crossorigin' attribute of the SVG 'script' element, specifying the CORS settings for the external script. |
| [Href](../../aspose.svg.builder/svgscriptelementbuilder/href/)(string) | Sets the 'href' attribute of the SVG 'script' element, specifying the URL of an external script file. |
| [Type](../../aspose.svg.builder/svgscriptelementbuilder/type/)(string) | Sets the 'type' attribute of the SVG 'script' element, specifying the scripting language type (e.g., "text/javascript"). |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGScriptElement](../../aspose.svg/svgscriptelement/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
