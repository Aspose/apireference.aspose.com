---
title: SVGClipPathElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGClipPathElementBuilder class. Builder class for constructing an SVG clipPath element which is used to define a clipping path. It enables the building of content within the clipPath element and provides methods to set various attributes specific to the clipPath element in SVG
type: docs
weight: 1680
url: /net/aspose.svg.builder/svgclippathelementbuilder/
---
## SVGClipPathElementBuilder class

Builder class for constructing an SVG 'clipPath' element, which is used to define a clipping path. It enables the building of content within the 'clipPath' element and provides methods to set various attributes specific to the 'clipPath' element in SVG.

```csharp
public class SVGClipPathElementBuilder : SVGElementBuilder<SVGClipPathElement>, 
    IAnimationElementBuilder, ICompositeAttributeSetter, IDescriptiveElementBuilder, 
    IShapeElementBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGClipPathElementBuilder](svgclippathelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgclippathelementbuilder/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) | Adds a script element to the clipPath element. |
| [AddText](../../aspose.svg.builder/svgclippathelementbuilder/addtext/)(Action&lt;SVGTextElementBuilder&gt;) | Adds a text element to the clipPath element. |
| [AddUse](../../aspose.svg.builder/svgclippathelementbuilder/adduse/)(Action&lt;SVGUseElementBuilder&gt;) | Adds a 'use' element to the clipPath element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGClipPathElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [ClipPathUnits](../../aspose.svg.builder/svgclippathelementbuilder/clippathunits/)(CoordinateUnits) | Sets the 'clipPathUnits' attribute of the SVG 'clipPath' element, specifying the coordinate system for the clipping path. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGClipPathElement](../../aspose.svg/svgclippathelement/)
* interface [IAnimationElementBuilder](../ianimationelementbuilder/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IShapeElementBuilder](../ishapeelementbuilder/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
