---
title: SVGStopElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGStopElementBuilder class. Builder class for constructing an SVG stop element. The stop element is used within a gradient definition either linear or radial to define the color stops. This class provides methods to set various attributes specific to the stop element such as the offset and color
type: docs
weight: 1620
url: /net/aspose.svg.builder/svgstopelementbuilder/
---
## SVGStopElementBuilder class

Builder class for constructing an SVG 'stop' element. The 'stop' element is used within a gradient definition (either linear or radial) to define the color stops. This class provides methods to set various attributes specific to the 'stop' element, such as the offset and color.

```csharp
public class SVGStopElementBuilder : SVGElementBuilder<SVGStopElement>, 
    IBaseAnimationElementBuilder, ICoreAttributeSetter, IDocumentElementEventAttributeSetter, 
    IGlobalEventAttributeSetter, IPresentationAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGStopElementBuilder](svgstopelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgstopelementbuilder/addscript/)(*Action&lt;SVGScriptElementBuilder&gt;*) | Adds a script configuration to the SVG 'stop' element. |
| [AddStyle](../../aspose.svg.builder/svgstopelementbuilder/addstyle/)(*Action&lt;SVGStyleElementBuilder&gt;*) | Adds a style configuration to the SVG 'stop' element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*[SVGStopElement](../../aspose.svg/svgstopelement/)*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [Offset](../../aspose.svg.builder/svgstopelementbuilder/offset/)(*double, [StopUnitType](../stopunittype/)*) | Sets the 'offset' attribute of the SVG 'stop' element, specifying the position of the color stop within the gradient. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGStopElement](../../aspose.svg/svgstopelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
