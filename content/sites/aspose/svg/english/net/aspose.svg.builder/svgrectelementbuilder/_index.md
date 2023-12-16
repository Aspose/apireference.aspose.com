---
title: SVGRectElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGRectElementBuilder class. Builder class for constructing an SVG rect element. The rect element is used to create rectangles within SVG graphics. This class provides methods to set various attributes specific to the rect element including corner radii and dimensions
type: docs
weight: 1860
url: /net/aspose.svg.builder/svgrectelementbuilder/
---
## SVGRectElementBuilder class

Builder class for constructing an SVG 'rect' element. The 'rect' element is used to create rectangles within SVG graphics. This class provides methods to set various attributes specific to the 'rect' element, including corner radii and dimensions.

```csharp
public class SVGRectElementBuilder : SVGElementBuilder<SVGRectElement>, IAnimationElementBuilder, 
    IDescriptiveElementBuilder, IPaintServerElementBuilder, IRectAttributeSetter, 
    IShapeAttributeSetter, IShapeContentElementBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGRectElementBuilder](svgrectelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGRectElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Rx](../../aspose.svg.builder/svgrectelementbuilder/rx/)(double, LengthType) | Sets the 'rx' attribute of the SVG 'rect' element, specifying the horizontal radius of the rectangle's rounded corners. |
| [Ry](../../aspose.svg.builder/svgrectelementbuilder/ry/)(double, LengthType) | Sets the 'ry' attribute of the SVG 'rect' element, specifying the vertical radius of the rectangle's rounded corners. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGRectElement](../../aspose.svg/svgrectelement/)
* interface [IAnimationElementBuilder](../ianimationelementbuilder/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IPaintServerElementBuilder](../ipaintserverelementbuilder/)
* interface [IRectAttributeSetter](../irectattributesetter/)
* interface [IShapeAttributeSetter](../ishapeattributesetter/)
* interface [IShapeContentElementBuilder](../ishapecontentelementbuilder/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
