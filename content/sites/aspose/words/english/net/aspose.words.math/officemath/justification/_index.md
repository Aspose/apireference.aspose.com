---
title: OfficeMath.Justification
linktitle: Justification
articleTitle: Justification
second_title: Aspose.Words for .NET
description: Discover the OfficeMath Justification property to easily customize and set your Office Math alignment. Enhance your document's presentation effortlessly!
type: docs
weight: 20
url: /net/aspose.words.math/officemath/justification/
---
## OfficeMath.Justification property

Gets/sets Office Math justification.

```csharp
public OfficeMathJustification Justification { get; set; }
```

## Remarks

Justification cannot be set to the Office Math with display format type Inline.

Inline justification cannot be set to the Office Math with display format type Display.

Corresponding [`DisplayType`](../displaytype/) has to be set before setting Office Math justification.

## Examples

Shows how to set office math display formatting.

```csharp
Document doc = new Document(MyDir + "Office math.docx");

OfficeMath officeMath = (OfficeMath)doc.GetChild(NodeType.OfficeMath, 0, true);

// OfficeMath nodes that are children of other OfficeMath nodes are always inline.
// The node we are working with is the base node to change its location and display type.
Assert.That(officeMath.MathObjectType, Is.EqualTo(MathObjectType.OMathPara));
Assert.That(officeMath.NodeType, Is.EqualTo(NodeType.OfficeMath));
Assert.That(officeMath.ParentParagraph, Is.EqualTo(officeMath.ParentNode));

// Change the location and display type of the OfficeMath node.
officeMath.DisplayType = OfficeMathDisplayType.Display;
officeMath.Justification = OfficeMathJustification.Left;

doc.Save(ArtifactsDir + "Shape.OfficeMath.docx");
```

### See Also

* enum [OfficeMathJustification](../../officemathjustification/)
* class [OfficeMath](../)
* namespace [Aspose.Words.Math](../../../aspose.words.math/)
* assembly [Aspose.Words](../../../)
