---
title: SVGTextPathElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGTextPathElementBuilder class. Builder class for creating SVG textPath elements which are used to align text to a path
type: docs
weight: 1950
url: /net/aspose.svg.builder/svgtextpathelementbuilder/
---
## SVGTextPathElementBuilder class

Builder class for creating SVG 'textPath' elements, which are used to align text to a path.

```csharp
public class SVGTextPathElementBuilder : SVGElementBuilder<SVGTextPathElement>, 
    IBaseAnimationElementBuilder, ICompositeAttributeSetter, IDescriptiveElementBuilder, 
    IPaintServerElementBuilder, IShapeContentElementBuilder, ITextContentSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGTextPathElementBuilder](svgtextpathelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddA](../../aspose.svg.builder/svgtextpathelementbuilder/adda/)(Action&lt;SVGAElementBuilder&gt;) | Adds an 'a' (anchor) element configuration to the 'textPath'. |
| [AddTSpan](../../aspose.svg.builder/svgtextpathelementbuilder/addtspan/)(Action&lt;SVGTSpanElementBuilder&gt;) | Adds a 'tspan' element configuration to the 'textPath'. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGTextPathElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [Href](../../aspose.svg.builder/svgtextpathelementbuilder/href/)(string) | Sets the 'href' attribute, specifying a reference to a path element. |
| [LengthAdjust](../../aspose.svg.builder/svgtextpathelementbuilder/lengthadjust/)(LengthAdjust) | Sets the 'lengthAdjust' attribute, specifying how text length adjustments are made. |
| [Method](../../aspose.svg.builder/svgtextpathelementbuilder/method/)(TextPathMethod) | Sets the 'method' attribute, specifying the text layout method along the path. |
| [Path](../../aspose.svg.builder/svgtextpathelementbuilder/path/)(Action&lt;PathBuilder&gt;) | Configures the path for the text. |
| [Side](../../aspose.svg.builder/svgtextpathelementbuilder/side/)(HorizontalEdge) | Sets the 'side' attribute, specifying which side of the path the text is placed on. |
| [Spacing](../../aspose.svg.builder/svgtextpathelementbuilder/spacing/)(TextPathSpacing) | Sets the 'spacing' attribute, specifying the spacing strategy for text along the path. |
| [StartOffset](../../aspose.svg.builder/svgtextpathelementbuilder/startoffset/)(double, LengthType) | Sets the 'startOffset' attribute, specifying the starting position of the text on the path. |
| [TextLength](../../aspose.svg.builder/svgtextpathelementbuilder/textlength/)(double, LengthType) | Sets the 'textLength' attribute, specifying the length of the text. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGTextPathElement](../../aspose.svg/svgtextpathelement/)
* interface [IBaseAnimationElementBuilder](../ibaseanimationelementbuilder/)
* interface [ICompositeAttributeSetter](../icompositeattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IPaintServerElementBuilder](../ipaintserverelementbuilder/)
* interface [IShapeContentElementBuilder](../ishapecontentelementbuilder/)
* interface [ITextContentSetter](../itextcontentsetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
