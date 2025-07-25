---
title: FieldRef.InsertParagraphNumberInRelativeContext
linktitle: InsertParagraphNumberInRelativeContext
articleTitle: InsertParagraphNumberInRelativeContext
second_title: Aspose.Words for .NET
description: Manage paragraph numbering effortlessly with the FieldRef InsertParagraphNumberInRelativeContext property. Enhance document organization and clarity.
type: docs
weight: 70
url: /net/aspose.words.fields/fieldref/insertparagraphnumberinrelativecontext/
---
## FieldRef.InsertParagraphNumberInRelativeContext property

Gets or sets whether to insert the paragraph number of the referenced paragraph in relative context.

```csharp
public bool InsertParagraphNumberInRelativeContext { get; set; }
```

## Examples

Shows how to insert REF fields to reference bookmarks.

```csharp
public void FieldRef()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    builder.StartBookmark("MyBookmark");
    builder.InsertFootnote(FootnoteType.Footnote, "MyBookmark footnote #1");
    builder.Write("Text that will appear in REF field");
    builder.InsertFootnote(FootnoteType.Footnote, "MyBookmark footnote #2");
    builder.EndBookmark("MyBookmark");
    builder.MoveToDocumentStart();

    // We will apply a custom list format, where the amount of angle brackets indicates the list level we are currently at.
    builder.ListFormat.ApplyNumberDefault();
    builder.ListFormat.ListLevel.NumberFormat = "> \x0000";

    // Insert a REF field that will contain the text within our bookmark, act as a hyperlink, and clone the bookmark's footnotes.
    FieldRef field = InsertFieldRef(builder, "MyBookmark", "", "\n");
    field.IncludeNoteOrComment = true;
    field.InsertHyperlink = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\f \\h"));

    // Insert a REF field, and display whether the referenced bookmark is above or below it.
    field = InsertFieldRef(builder, "MyBookmark", "The referenced paragraph is ", " this field.\n");
    field.InsertRelativePosition = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\p"));

    // Display the list number of the bookmark as it appears in the document.
    field = InsertFieldRef(builder, "MyBookmark", "The bookmark's paragraph number is ", "\n");
    field.InsertParagraphNumber = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\n"));

    // Display the bookmark's list number, but with non-delimiter characters, such as the angle brackets, omitted.
    field = InsertFieldRef(builder, "MyBookmark", "The bookmark's paragraph number, non-delimiters suppressed, is ", "\n");
    field.InsertParagraphNumber = true;
    field.SuppressNonDelimiters = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\n \\t"));

    // Move down one list level.
    builder.ListFormat.ListLevelNumber++;
    builder.ListFormat.ListLevel.NumberFormat = ">> \x0001";

    // Display the list number of the bookmark and the numbers of all the list levels above it.
    field = InsertFieldRef(builder, "MyBookmark", "The bookmark's full context paragraph number is ", "\n");
    field.InsertParagraphNumberInFullContext = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\w"));

    builder.InsertBreak(BreakType.PageBreak);

    // Display the list level numbers between this REF field, and the bookmark that it is referencing.
    field = InsertFieldRef(builder, "MyBookmark", "The bookmark's relative paragraph number is ", "\n");
    field.InsertParagraphNumberInRelativeContext = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" REF  MyBookmark \\r"));

    // At the end of the document, the bookmark will show up as a list item here.
    builder.Writeln("List level above bookmark");
    builder.ListFormat.ListLevelNumber++;
    builder.ListFormat.ListLevel.NumberFormat = ">>> \x0002";

    doc.UpdateFields();
    doc.Save(ArtifactsDir + "Field.REF.docx");
}

/// <summary>
/// Get the document builder to insert a REF field, reference a bookmark with it, and add text before and after it.
/// </summary>
private static FieldRef InsertFieldRef(DocumentBuilder builder, string bookmarkName, string textBefore, string textAfter)
{
    builder.Write(textBefore);
    FieldRef field = (FieldRef)builder.InsertField(FieldType.FieldRef, true);
    field.BookmarkName = bookmarkName;
    builder.Write(textAfter);
    return field;
}
```

### See Also

* class [FieldRef](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
