---
title: Body.Accept
linktitle: Accept
articleTitle: Accept
second_title: Aspose.Words for .NET
description: Discover the Body Accept method for seamless visitor engagement. Enhance user experience and boost conversions with our unique approach!
type: docs
weight: 40
url: /net/aspose.words/body/accept/
---
## Body.Accept method

Accepts a visitor.

```csharp
public override bool Accept(DocumentVisitor visitor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | DocumentVisitor | The visitor that will visit the nodes. |

### Return Value

True if all nodes were visited; false if [`DocumentVisitor`](../../documentvisitor/) stopped the operation before visiting all nodes.

## Remarks

Enumerates over this node and all of its children. Each node calls a corresponding method on [`DocumentVisitor`](../../documentvisitor/).

For more info see the Visitor design pattern.

Calls [`VisitBodyStart`](../../documentvisitor/visitbodystart/), then calls [`Accept`](../../node/accept/) for all child nodes of the section and calls [`VisitBodyEnd`](../../documentvisitor/visitbodyend/) at the end.

## Examples

Shows how to process absolute position tab characters with a document visitor.

```csharp
public void DocumentToTxt()
{
    Document doc = new Document(MyDir + "Absolute position tab.docx");

    // Extract the text contents of our document by accepting this custom document visitor.
    DocTextExtractor myDocTextExtractor = new DocTextExtractor();
    Section fisrtSection = doc.FirstSection;
    fisrtSection.Body.Accept(myDocTextExtractor);
    // Visit only start of the document body.
    fisrtSection.Body.AcceptStart(myDocTextExtractor);
    // Visit only end of the document body.
    fisrtSection.Body.AcceptEnd(myDocTextExtractor);

    // The absolute position tab, which has no equivalent in string form, has been explicitly converted to a tab character.
    Assert.That(myDocTextExtractor.GetText(), Is.EqualTo("Before AbsolutePositionTab\tAfter AbsolutePositionTab"));

    // An AbsolutePositionTab can accept a DocumentVisitor by itself too.
    AbsolutePositionTab absPositionTab = (AbsolutePositionTab)doc.FirstSection.Body.FirstParagraph.GetChild(NodeType.SpecialChar, 0, true);

    myDocTextExtractor = new DocTextExtractor();
    absPositionTab.Accept(myDocTextExtractor);

    Assert.That(myDocTextExtractor.GetText(), Is.EqualTo("\t"));
}

/// <summary>
/// Collects the text contents of all runs in the visited document. Replaces all absolute tab characters with ordinary tabs.
/// </summary>
public class DocTextExtractor : DocumentVisitor
{
    public DocTextExtractor()
    {
        mBuilder = new StringBuilder();
    }

    /// <summary>
    /// Called when a Run node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitRun(Run run)
    {
        AppendText(run.Text);
        return VisitorAction.Continue;
    }

    /// <summary>
    /// Called when an AbsolutePositionTab node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitAbsolutePositionTab(AbsolutePositionTab tab)
    {
        mBuilder.Append("\t");
        return VisitorAction.Continue;
    }

    /// <summary>
    /// Adds text to the current output. Honors the enabled/disabled output flag.
    /// </summary>
    private void AppendText(string text)
    {
        mBuilder.Append(text);
    }

    /// <summary>
    /// Plain text of the document that was accumulated by the visitor.
    /// </summary>
    public string GetText()
    {
        return mBuilder.ToString();
    }

    private readonly StringBuilder mBuilder;
}
```

### See Also

* class [DocumentVisitor](../../documentvisitor/)
* class [Body](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
