---
title: OfficeMath.DisplayType
linktitle: DisplayType
articleTitle: DisplayType
second_title: Aspose.Words for .NET
description: Discover the OfficeMath DisplayType property for flexible equation formatting—choose between inline or standalone display for enhanced document clarity.
type: docs
weight: 10
url: /net/aspose.words.math/officemath/displaytype/
---
## OfficeMath.DisplayType property

Gets/sets Office Math display format type which represents whether an equation is displayed inline with the text or displayed on its own line.

```csharp
public OfficeMathDisplayType DisplayType { get; set; }
```

## Remarks

Display format type has effect for top level Office Math only.

Returned display format type is always Inline for nested Office Math.

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

* enum [OfficeMathDisplayType](../../officemathdisplaytype/)
* class [OfficeMath](../)
* namespace [Aspose.Words.Math](../../../aspose.words.math/)
* assembly [Aspose.Words](../../../)
