---
title: OfficeMath.NodeType
linktitle: NodeType
articleTitle: NodeType
second_title: Aspose.Words for .NET
description: Discover the OfficeMath NodeType property that efficiently returns OfficeMath elements, enhancing your document's mathematical capabilities.
type: docs
weight: 40
url: /net/aspose.words.math/officemath/nodetype/
---
## OfficeMath.NodeType property

Returns OfficeMath.

```csharp
public override NodeType NodeType { get; }
```

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

* enum [NodeType](../../../aspose.words/nodetype/)
* class [OfficeMath](../)
* namespace [Aspose.Words.Math](../../../aspose.words.math/)
* assembly [Aspose.Words](../../../)
