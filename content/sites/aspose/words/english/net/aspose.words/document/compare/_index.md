---
title: Document.Compare
linktitle: Compare
articleTitle: Compare
second_title: Aspose.Words for .NET
description: Effortlessly compare documents with our Document Compare tool. Identify edits and format changes quickly for streamlined revisions and enhanced collaboration.
type: docs
weight: 600
url: /net/aspose.words/document/compare/
---
## Compare(*[Document](../), string, DateTime*) {#compare}

Compares this document with another document producing changes as number of edit and format revisions [`Revision`](../../revision/).

```csharp
public void Compare(Document document, string author, DateTime dateTime)
```

| Parameter | Type | Description |
| --- | --- | --- |
| document | Document | Document to compare. |
| author | String | Initials of the author to use for revisions. |
| dateTime | DateTime | The date and time to use for revisions. |

## Remarks

Documents must not have revisions before comparison.

## Examples

Shows how to compare documents.

```csharp
Document docOriginal = new Document();
DocumentBuilder builder = new DocumentBuilder(docOriginal);
builder.Writeln("This is the original document.");

Document docEdited = new Document();
builder = new DocumentBuilder(docEdited);
builder.Writeln("This is the edited document.");

// Comparing documents with revisions will throw an exception.
if (docOriginal.Revisions.Count == 0 && docEdited.Revisions.Count == 0)
    docOriginal.Compare(docEdited, "authorName", DateTime.Now);

// After the comparison, the original document will gain a new revision
// for every element that is different in the edited document.
foreach (Revision r in docOriginal.Revisions)
{
    Console.WriteLine($"Revision type: {r.RevisionType}, on a node of type \"{r.ParentNode.NodeType}\"");
    Console.WriteLine($"\tChanged text: \"{r.ParentNode.GetText()}\"");
}

// Accepting these revisions will transform the original document into the edited document.
docOriginal.Revisions.AcceptAll();

Assert.That(docEdited.GetText(), Is.EqualTo(docOriginal.GetText()));
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## Compare(*[Document](../), string, DateTime, [CompareOptions](../../../aspose.words.comparing/compareoptions/)*) {#compare_1}

Compares this document with another document producing changes as a number of edit and format revisions [`Revision`](../../revision/). Allows to specify comparison options using [`CompareOptions`](../../../aspose.words.comparing/compareoptions/).

```csharp
public void Compare(Document document, string author, DateTime dateTime, CompareOptions options)
```

## Examples

Shows how to filter specific types of document elements when making a comparison.

```csharp
// Create the original document and populate it with various kinds of elements.
Document docOriginal = new Document();
DocumentBuilder builder = new DocumentBuilder(docOriginal);

// Paragraph text referenced with an endnote:
builder.Writeln("Hello world! This is the first paragraph.");
builder.InsertFootnote(FootnoteType.Endnote, "Original endnote text.");

// Table:
builder.StartTable();
builder.InsertCell();
builder.Write("Original cell 1 text");
builder.InsertCell();
builder.Write("Original cell 2 text");
builder.EndTable();

// Textbox:
Shape textBox = builder.InsertShape(ShapeType.TextBox, 150, 20);
builder.MoveTo(textBox.FirstParagraph);
builder.Write("Original textbox contents");

// DATE field:
builder.MoveTo(docOriginal.FirstSection.Body.AppendParagraph(""));
builder.InsertField(" DATE ");

// Comment:
Comment newComment = new Comment(docOriginal, "John Doe", "J.D.", DateTime.Now);
newComment.SetText("Original comment.");
builder.CurrentParagraph.AppendChild(newComment);

// Header:
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
builder.Writeln("Original header contents.");

// Create a clone of our document and perform a quick edit on each of the cloned document's elements.
Document docEdited = (Document)docOriginal.Clone(true);
Paragraph firstParagraph = docEdited.FirstSection.Body.FirstParagraph;

firstParagraph.Runs[0].Text = "hello world! this is the first paragraph, after editing.";
firstParagraph.ParagraphFormat.Style = docEdited.Styles[StyleIdentifier.Heading1];
((Footnote)docEdited.GetChild(NodeType.Footnote, 0, true)).FirstParagraph.Runs[1].Text = "Edited endnote text.";
((Table)docEdited.GetChild(NodeType.Table, 0, true)).FirstRow.Cells[1].FirstParagraph.Runs[0].Text = "Edited Cell 2 contents";
((Shape)docEdited.GetChild(NodeType.Shape, 0, true)).FirstParagraph.Runs[0].Text = "Edited textbox contents";
((FieldDate)docEdited.Range.Fields[0]).UseLunarCalendar = true;
((Comment)docEdited.GetChild(NodeType.Comment, 0, true)).FirstParagraph.Runs[0].Text = "Edited comment.";
docEdited.FirstSection.HeadersFooters[HeaderFooterType.HeaderPrimary].FirstParagraph.Runs[0].Text =
    "Edited header contents.";

// Comparing documents creates a revision for every edit in the edited document.
// A CompareOptions object has a series of flags that can suppress revisions
// on each respective type of element, effectively ignoring their change.
CompareOptions compareOptions = new CompareOptions
{
    CompareMoves = false,
    IgnoreFormatting = false,
    IgnoreCaseChanges = false,
    IgnoreComments = false,
    IgnoreTables = false,
    IgnoreFields = false,
    IgnoreFootnotes = false,
    IgnoreTextboxes = false,
    IgnoreHeadersAndFooters = false,
    Target = ComparisonTargetType.New
};

docOriginal.Compare(docEdited, "John Doe", DateTime.Now, compareOptions);
docOriginal.Save(ArtifactsDir + "Revision.CompareOptions.docx");
```

### See Also

* class [CompareOptions](../../../aspose.words.comparing/compareoptions/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
