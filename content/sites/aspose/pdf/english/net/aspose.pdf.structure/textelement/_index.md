---
title: Class TextElement
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Structure.TextElement class. General text element of document logical structure
type: docs
weight: 10370
url: /net/aspose.pdf.structure/textelement/
---
## TextElement class

General text element of document logical structure.

```csharp
public class TextElement : Element
```

## Properties

| Name | Description |
| --- | --- |
| virtual [ActualText](../../aspose.pdf.structure/element/actualtext/) { get; set; } | (Optional; PDF 1.4) Text that is an exact replacement for the structure element and its children. This replacement text (which should apply to as small a piece of content as possible) is useful when extracting the document's contents in support of accessibility to users with disabilities or for other purposes. |
| virtual [Alt](../../aspose.pdf.structure/element/alt/) { get; set; } | (Optional) An alternate description of the structure element and its children in human-readableform, which is useful when extracting the document's contents in support of accessibility to users with disabilities or for other purposes. |
| [Children](../../aspose.pdf.structure/element/children/) { get; } | Gets child elements collection. |
| virtual [E](../../aspose.pdf.structure/element/e/) { get; set; } | (Optional; PDF 1.5) The expanded form of an abbreviation. |
| virtual [Lang](../../aspose.pdf.structure/element/lang/) { get; set; } | (Optional; PDF 1.4) A language specifying the natural language for all text in the structure element except where overridden by language specifications for nested structure elements or marked content. |
| [Text](../../aspose.pdf.structure/textelement/text/) { get; } | Gets the value of text structure element. |

## Methods

| Name | Description |
| --- | --- |
| [Remove](../../aspose.pdf.structure/element/remove/)() | Remove element. |

### See Also

* class [Element](../element/)
* namespace [Aspose.Pdf.Structure](../../aspose.pdf.structure/)
* assembly [Aspose.PDF](../../)


