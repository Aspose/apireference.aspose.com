---
title: SVGSetElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGSetElementBuilder class. Builder class for constructing an SVG set element. The set element is used to define a simple animation where a single attribute value changes over a period of time. This class provides methods to set various attributes specific to the set element such as the target attribute and the value to set
type: docs
weight: 1860
url: /net/aspose.svg.builder/svgsetelementbuilder/
---
## SVGSetElementBuilder class

Builder class for constructing an SVG 'set' element. The 'set' element is used to define a simple animation where a single attribute value changes over a period of time. This class provides methods to set various attributes specific to the 'set' element, such as the target attribute and the value to set.

```csharp
public class SVGSetElementBuilder : SVGElementBuilder<SVGSetElement>, 
    IAnimationEventAttributeSetter, IAnimationTargetAttributeSetter, 
    IAnimationTargetElementAttributeSetter, IAnimationTimingAttributeSetter, 
    IConditionalProcessingAttributeSetter, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IDocumentElementEventAttributeSetter, IGlobalEventAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGSetElementBuilder](svgsetelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGSetElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [To](../../aspose.svg.builder/svgsetelementbuilder/to/)(string) | Sets the 'to' attribute of the SVG 'set' element, specifying the final value of the attribute that will be changed during the animation. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGSetElement](../../aspose.svg/svgsetelement/)
* interface [IAnimationEventAttributeSetter](../ianimationeventattributesetter/)
* interface [IAnimationTargetAttributeSetter](../ianimationtargetattributesetter/)
* interface [IAnimationTargetElementAttributeSetter](../ianimationtargetelementattributesetter/)
* interface [IAnimationTimingAttributeSetter](../ianimationtimingattributesetter/)
* interface [IConditionalProcessingAttributeSetter](../iconditionalprocessingattributesetter/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
