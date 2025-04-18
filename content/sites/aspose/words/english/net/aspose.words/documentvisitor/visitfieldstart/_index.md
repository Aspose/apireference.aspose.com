---
title: DocumentVisitor.VisitFieldStart
linktitle: VisitFieldStart
articleTitle: VisitFieldStart
second_title: Aspose.Words for .NET
description: Discover the DocumentVisitor VisitFieldStart method, triggered at the start of a field in your document, enhancing your coding efficiency and workflow.
type: docs
weight: 200
url: /net/aspose.words/documentvisitor/visitfieldstart/
---
## DocumentVisitor.VisitFieldStart method

Called when a field starts in the document.

```csharp
public virtual VisitorAction VisitFieldStart(FieldStart fieldStart)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fieldStart | FieldStart | The object that is being visited. |

### Return Value

A [`VisitorAction`](../../visitoraction/) value that specifies how to continue the enumeration.

## Remarks

A field in a Word document consists of a field code and field value.

For example, a field that displays a page number can be represented as follows:

[FieldStart]PAGE[FieldSeparator]98[FieldEnd]

The field separator separates field code from field value in the document. Note that some fields have only field code and do not have field separator and field value.

Fields can be nested.

## Examples

Shows how to print the node structure of every field in a document.

```csharp
public void FieldToText()
{
    Document doc = new Document(MyDir + "DocumentVisitor-compatible features.docx");
    FieldStructurePrinter visitor = new FieldStructurePrinter();

    // When we get a composite node to accept a document visitor, the visitor visits the accepting node,
    // and then traverses all the node's children in a depth-first manner.
    // The visitor can read and modify each visited node.
    doc.Accept(visitor);

    Console.WriteLine(visitor.GetText());
}

/// <summary>
/// Traverses a node's non-binary tree of child nodes.
/// Creates a map in the form of a string of all encountered Field nodes and their children.
/// </summary>
public class FieldStructurePrinter : DocumentVisitor
{
    public FieldStructurePrinter()
    {
        mBuilder = new StringBuilder();
        mVisitorIsInsideField = false;
    }

    public string GetText()
    {
        return mBuilder.ToString();
    }

    /// <summary>
    /// Called when a Run node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitRun(Run run)
    {
        if (mVisitorIsInsideField) IndentAndAppendLine("[Run] \"" + run.GetText() + "\"");

        return VisitorAction.Continue;
    }

    /// <summary>
    /// Called when a FieldStart node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitFieldStart(FieldStart fieldStart)
    {
        IndentAndAppendLine("[Field start] FieldType: " + fieldStart.FieldType);
        mDocTraversalDepth++;
        mVisitorIsInsideField = true;

        return VisitorAction.Continue;
    }

    /// <summary>
    /// Called when a FieldEnd node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitFieldEnd(FieldEnd fieldEnd)
    {
        mDocTraversalDepth--;
        IndentAndAppendLine("[Field end]");
        mVisitorIsInsideField = false;

        return VisitorAction.Continue;
    }

    /// <summary>
    /// Called when a FieldSeparator node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitFieldSeparator(FieldSeparator fieldSeparator)
    {
        IndentAndAppendLine("[FieldSeparator]");

        return VisitorAction.Continue;
    }

    /// <summary>
    /// Append a line to the StringBuilder, and indent it depending on how deep the visitor is
    /// into the field's tree of child nodes.
    /// </summary>
    /// <param name="text"></param>
    private void IndentAndAppendLine(string text)
    {
        for (int i = 0; i < mDocTraversalDepth; i++)
        {
            mBuilder.Append("|  ");
        }

        mBuilder.AppendLine(text);
    }

    private bool mVisitorIsInsideField;
    private int mDocTraversalDepth;
    private readonly StringBuilder mBuilder;
}
```

### See Also

* enum [VisitorAction](../../visitoraction/)
* class [FieldStart](../../../aspose.words.fields/fieldstart/)
* class [DocumentVisitor](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
