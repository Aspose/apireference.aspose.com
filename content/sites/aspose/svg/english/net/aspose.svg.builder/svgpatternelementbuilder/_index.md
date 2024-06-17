---
title: SVGPatternElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGPatternElementBuilder class. Builder class for constructing an SVG pattern element which is used to define a pattern to be used for filling graphics elements within SVG. This class provides methods to set various attributes specific to the pattern element and to build its content
type: docs
weight: 1540
url: /net/aspose.svg.builder/svgpatternelementbuilder/
---
## SVGPatternElementBuilder class

Builder class for constructing an SVG 'pattern' element, which is used to define a pattern to be used for filling graphics elements within SVG. This class provides methods to set various attributes specific to the 'pattern' element and to build its content.

```csharp
public class SVGPatternElementBuilder : SVGElementBuilder<SVGPatternElement>, 
    ICompositeElementBuilder, ICoreAttributeSetter, IGlobalEventAttributeSetter, 
    IPresentationAttributeSetter, IPreserveAspectRatioAttributeSetter, IRectAttributeSetter, 
    IViewBoxAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGPatternElementBuilder](svgpatternelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGPatternElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Href](../../aspose.svg.builder/svgpatternelementbuilder/href/)(string) | Sets the 'href' attribute of the SVG 'pattern' element, specifying a reference to another pattern which this pattern inherits attributes from. |
| [PatternContentUnits](../../aspose.svg.builder/svgpatternelementbuilder/patterncontentunits/)(CoordinateUnits) | Sets the 'patternContentUnits' attribute of the SVG 'pattern' element, specifying the coordinate system for the contents of the pattern. |
| [PatternTransform](../../aspose.svg.builder/svgpatternelementbuilder/patterntransform/)(Func&lt;TransformBuilder, TransformBuilder&gt;) | Sets the 'patternTransform' attribute of the SVG 'pattern' element, applying a transformation to the pattern. |
| [PatternUnits](../../aspose.svg.builder/svgpatternelementbuilder/patternunits/)(CoordinateUnits) | Sets the 'patternUnits' attribute of the SVG 'pattern' element, specifying the coordinate system for the pattern's x, y, width, and height. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGPatternElement](../../aspose.svg/svgpatternelement/)
* interface [ICompositeElementBuilder](../icompositeelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* interface [IPreserveAspectRatioAttributeSetter](../ipreserveaspectratioattributesetter/)
* interface [IRectAttributeSetter](../irectattributesetter/)
* interface [IViewBoxAttributeSetter](../iviewboxattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
